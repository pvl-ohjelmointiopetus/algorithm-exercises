package searching.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import searching.engine.LinearSearcher;

public class SearcherGUI extends JFrame implements ActionListener {
	
	private LinearSearcher searcher;
	
	private JButton min = new JButton("Min");
	private JButton max = new JButton("Max");
	private JButton search = new JButton("Search");
	private JLabel list = new JLabel();
	
	public SearcherGUI() {
		searcher = new LinearSearcher();
		
		String text = Arrays.toString( searcher.getNumbers() );
		list.setText(text);
		
		// show ui
		this.setTitle("SearchFrame");
		this.setLayout( new FlowLayout() );
		
		list.setVisible(true);
		this.add( list );
		
		min.addActionListener(this);
		min.setVisible(true);
		this.add( min );
		
		max.addActionListener(this);
		max.setVisible(true);
		this.add( max );

		search.addActionListener(this);
		search.setVisible(true);
		this.add( search );
		
		this.pack();
		
		this.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent event) {
		if( event.getSource() == min ) {
			int minValue = searcher.findMin();
			JOptionPane.showMessageDialog( null, "Minium value found was " + minValue);
		}
		if( event.getSource() == max ) {
			int maxValue = searcher.findMax();
			JOptionPane.showMessageDialog( null, "Maxium value found was " + maxValue);
		}
		if( event.getSource() == search ) {
			String val = JOptionPane.showInputDialog(null, "What value are we looking for?");
			int searchValue = Integer.parseInt( val );
			boolean found = searcher.findValue(searchValue);
			if( found ) {
				JOptionPane.showMessageDialog(null, "Value " + val + " was found.", "Value found", JOptionPane.INFORMATION_MESSAGE );
			} else {
				JOptionPane.showMessageDialog(null, "Value " + val + " was not found.", "Value not found", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
}
