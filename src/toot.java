import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class toot implements ActionListener {
public static void main(String[] args) {
toot t = new toot();
t.fart();
}
void fart(){
JFrame f = new JFrame();
JPanel p = new JPanel();
JButton b = new JButton();
f.add(p);
p.add(b);
f.setVisible(true);
b.setText("Fart");
b.addActionListener(this);
b.setSize(20, 10);
f.pack();
}
private void playSound(String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}


}
