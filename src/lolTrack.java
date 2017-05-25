import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class lolTrack implements ActionListener {

	JButton b = new JButton();
	JButton B = new JButton();
	public void setup() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();

		f.add(p);
		p.add(b);
		p.add(B);
		f.setVisible(true);
		b.addActionListener(this);
		B.addActionListener(this);
		
		f.pack();
	}

	public static void main(String[] args) {
		lolTrack l = new lolTrack();
		l.setup();
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(b)) {
			playSound("yay.wav");
		}
		else if (e.getSource().equals(B)){
			playSound("lol.wav");
		}
	}

}
