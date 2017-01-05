import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {

	/*
	 * You’ll need a JFrame and a JPanel.
	 * 
	 * On the panel, put two text fields and a button. A text field is made like
	 * this: JTextField answer = new JTextField(20);
	 * 
	 * It may look like this or you might have a better layout in mind.
	 * 
	 * 
	 * Here is a method that will do the conversion for you.
	 */
	public static void main(String[] args) {
BinaryConverter bc = new BinaryConverter();
bc.display();
	}
	JTextField t = new JTextField();
		JTextField T = new JTextField();
	public void display(){
		JFrame j = new JFrame();
		JPanel p = new JPanel();
		JButton b = new JButton();
		j.add(p);
		j.setVisible(true);
		p.add(T);
		p.add(b);
		p.add(t);
		t.setPreferredSize(new Dimension(200,20));
		T.setPreferredSize(new Dimension(200,20));
		b.setText("Convert");
		b.addActionListener(this);
		j.pack();
			}

	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		if (!Pattern.matches("\\A[01]+\\Z", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}

	}
	 String Convert(String binary) {
	   	 int asciiValue = Integer.parseInt(binary);
	   	 char theLetter = (char) asciiValue;
	   	 return "" + theLetter;
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = T.getText();
		int a = convert(s);
		String na = ""+ a;
		String Na = Convert(na);
		t.setText(Na);
		
	}

}
