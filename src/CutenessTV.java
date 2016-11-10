import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame j = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JButton B = new JButton();
	JButton bb = new JButton();
	public static void main(String[] args) {
		CutenessTV c = new CutenessTV();
		c.buttonsForVid();
		
	}
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}


	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}


	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
public void buttonsForVid() {
	
	j.setVisible(true);	
	j.add(p);
	p.add(b);
	p.add(bb);
	p.add(B);
	b.addActionListener(this);
	bb.addActionListener(this);
	B.addActionListener(this);
j.pack();
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	Object ee = e.getSource();
	if(ee .equals(b)){
		showDucks();
	}
	if(ee.equals(B)){
		showFrog();
	}
	if(ee .equals(bb)){
		showFluffyUnicorns();
	}
}

}
