import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LuckyNumbers implements ActionListener {
public static void main(String[] args) {
	
	LuckyNumbers  l = new LuckyNumbers();
	l.Money();
}

private void Money() {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	f.setVisible(true);
	f.add(p);
	p.add(b);
	b.setText("get your luck Click here!!");
	b.addActionListener(this);
	f.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int r = new Random().nextInt(59);
	int R = new Random().nextInt(59);
	int t = new Random().nextInt(59);
	int T = new Random().nextInt(35);
	int y = new Random().nextInt(59);
	int Y = new Random().nextInt(59);
	int u = new Random().nextInt(59);
	JOptionPane.showMessageDialog(null, r  + " " + R + " " + t + " " + T + " " + y +" " + Y + " " + u);
	
}
}
