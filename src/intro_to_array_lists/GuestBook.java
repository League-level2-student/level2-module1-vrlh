package intro_to_array_lists;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame;
	JPanel panel;
	JButton addName;
	JButton viewNames;
	
	
	ArrayList<String> names = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		GuestBook books = new GuestBook();
		books.createUI();
		
		
	}
	void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		addName = new JButton("Add Names");
		viewNames = new JButton("View Names");
		
		
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		
		frame.add(panel);
		panel.add(addName);
		panel.add(viewNames);
		
		frame.setVisible(true);
		
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addName) {
			String name = JOptionPane.showInputDialog("Enter Name");
			names.add(name);
		}if(e.getSource() == viewNames) {
			String f = "";
			for(int i = 0; i < names.size(); i++){
				String s = names.get(i);
				int n = i+1;
				f +=  "Guest #" + n + ": " + s + "\n";
				
			}
			JOptionPane.showMessageDialog(null, f);
		}
	}
}
