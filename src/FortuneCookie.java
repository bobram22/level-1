import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
public static void main(String[] args) {

FortuneCookie FC =  new FortuneCookie();
FC.showbutton();
}
JButton b = new JButton();
private void showbutton() {
	// TODO Auto-generated method stub
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	
	f.setVisible(true);
	f.add(p);
	p.add(b);
	f.pack();
	b.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int r = new Random().nextInt(5);
	
	if(b == e.getSource()){
		if(r == 1){
			JOptionPane.showMessageDialog(null, "Just because the chicken loses its head dosen't mean that it can't run");
		}
		if(r == 2){
			JOptionPane.showMessageDialog(null, "the worst weapon to give to your enemy is fear");
		}
		if(r == 3){
			JOptionPane.showMessageDialog(null, "if you play with fire you get burned if you tame it you have light");
		}
		if(r == 4){
			JOptionPane.showMessageDialog(null, "sometimes its best to seem like an idoit than act like genuise");
		}
	}
	
}

}
