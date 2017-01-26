import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class toot {
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
b.addActionListener(null);
b.setSize(20, 10);
f.pack();
}
private void playSound(String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}


}
