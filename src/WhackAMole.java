import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	Date d = new Date();
	int m = 0;
	public static void main(String[] args) {
		WhackAMole m = new WhackAMole();
		
		int r = new Random().nextInt(24);
		
		//int r = new Random().nextInt(24);
		m.drawButtons(r);
	}

	public void drawButtons(int num) {
		f= new JFrame();
		p = new JPanel();
		for (int i = 0; i < 24; i++) {
			int x = 0;
			JButton b = new JButton();
			/*
			 * if (i % 3 == 0) { x = 20; } else if (i % 3 == 1) { x = 70; } else if (i % 3 == 2) { x = 120; }
			 */
			f.add(p);
			p.add(b);
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
		f.setSize(500, 500);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int R = new Random().nextInt(24);

JButton B =(JButton) e.getSource();
		if(!B.getText().equals("MOLE!"))
	{
	speak("que tienes es muy facil, o ya se porque, eres menso o no");
	}
		else{
			m++;
			if(m==9){
				endGame(d,m);
				System.exit(0);
			}
		}
		f.dispose();
		drawButtons(R);
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
