import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PIG {
public static void main(String[] args) {
	
	PIG pig =  new PIG();
bub();}

private  void bub() {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton("Translate");
	JTextField t = new JTextField();
	JTextField T = new JTextField();
	f.setVisible(true);
	f.add(p);
	p.add(t);
	p.add(b);
	p.add(T);
	t.setPreferredSize(new Dimension(100,30));
	T.setPreferredSize(new Dimension(100,30));
	b.addActionListener(this);
	f.pack();
}
}
