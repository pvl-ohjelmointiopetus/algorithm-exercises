package sorting.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import sorting.engine.BubbleSorter;

public class SorterGUI extends JFrame implements ActionListener {
	
	private BubbleSorter sorter;
	
	private JButton nextRound = new JButton("Next round");
	private JButton sort = new JButton("Sort");
	private JLabel list = new JLabel();
	
	public SorterGUI() {
		sorter = new BubbleSorter();
		
		updateView();
		
		// show ui
		this.setTitle("SorterFrame");
		this.setLayout( new FlowLayout() );
		
		list.setVisible(true);
		this.add( list );
		
		nextRound.addActionListener(this);
		nextRound.setVisible(true);
		this.add( nextRound );
		
		sort.addActionListener(this);
		sort.setVisible(true);
		this.add( sort );
		
		this.pack();
		
		this.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent event) {
		if( event.getSource() == nextRound ) {
			sorter.sortOneRound();
			updateView();
		}
		if( event.getSource() == sort ) {
			sorter.sort();
			updateView();
		}
	}

	private void updateView() {
		String text = Arrays.toString( sorter.getNumbers() );
		list.setText(text);
		
		// disable buttons if list is ordered
		if( sorter.getRoundCount() == sorter.COUNT_OF_NUMBERS ) {
			sort.setEnabled(false);
			nextRound.setEnabled(false);
		}
		
	}
	
}
