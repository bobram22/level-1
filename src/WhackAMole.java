import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WhackAMole implements ActionListener {
	JFrame f = new JFrame();

	public static void main(String[] args) {
		WhackAMole m = new WhackAMole();
		int r = new Random().nextInt(6);
		m.drawButtons(r);
	}

	public void drawButtons(int num) {
		for (int i = 0; i < 24; i++) {
			int x = 0;
			JButton b = new JButton();
			if (i % 3 == 0) {
				x = 20;
			} else if (i % 3 == 1) {
				x = 70;
			} else if (i % 3 == 2) {
				x = 120;
			}
			f.add(b);
			b.setSize(50, 100);
			if (i < 3) {
				b.setLocation(x, 20);
			} else if (i < 6 && i > 2) {
				b.setLocation(x, 120);
			}

			b.addActionListener(this);
			if (i == num) {
				b.setText("MOLE!");
			}
		}
		f.setVisible(true);
		f.setSize(1000, 1000);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
