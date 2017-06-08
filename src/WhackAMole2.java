import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole2 implements ActionListener {
	
	
	public static void main(String[] args) {
		int randnum = new Random ().nextInt(24);
		WhackAMole2 w = new WhackAMole2();
		w.makeButtons(randnum);
	}
	JFrame f = new JFrame();
		JPanel p = new JPanel();
	void makeButtons(int num){
		
		for(int i = 0; i <24; i++){
			JButton b = new JButton();
			p.add(b);
			b.addActionListener(this);
			if(num==i){
				b.setText("mole");
				jb = b;
			}
			else{
				b.setText(" ");
			}
		}
		
		
		f.setVisible(true);
		f.add(p);
		f.setSize(300, 400);
		
	}
	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
		JButton jb = new JButton();
		int hmmw = 0;
		Date d = new Date();
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == jb){
			speak("Muy Bien");
			
		}
		else{
			speak("Estas Menso");
		}
		int ranum = new Random().nextInt(24);
		f.dispose();
		f = new JFrame();
		p = new JPanel();
		makeButtons(ranum);
		hmmw++;
		if(hmmw==10){
			endGame(d,hmmw);
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}

}
