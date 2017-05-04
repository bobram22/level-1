import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton trick = new JButton("Trick");
	JButton treat = new JButton("Treat");
	private void userInterface(){
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.add(p);
		p.add(treat);
		p.add(trick);
		f.setVisible(true);
		treat.addActionListener(this);
		trick.addActionListener(this);
		f.pack();
	}
	
	public static void main(String[] args) {
		NastySurprise nasty = new NastySurprise();
		nasty.userInterface();
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(treat)){
			showPictureFromTheInternet("http://www.aicr.org/assets/images/foods-that-fight-cancer/tomatoes-for-ftfc.jpg");
		}
		if (e.getSource().equals(trick)){
			showPictureFromTheInternet("https://static.giantbomb.com/uploads/original/0/4231/261961-a_konami.png" );
		}
	}


}
