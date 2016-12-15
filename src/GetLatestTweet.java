import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
JTextField t = new JTextField();
public static void main(String[] args) {
	
	GetLatestTweet l = new GetLatestTweet();
	l.meh();

}
	void meh(){
		JFrame j = new JFrame();
	JPanel p = new JPanel();
	
	JButton b = new JButton();
	Dimension d = new Dimension(100,30);
	j.add(p);
	p.add(t);
	p.add(b);
	j.setVisible(true);
	b.addActionListener(this);
	t.setPreferredSize(d);
	b.setText("Search the Twitterverse");
	j.pack();
	}
	private String getLatestTweet(String searchingFor) {


		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);


		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String m = getLatestTweet(t.getText());
		JOptionPane.showMessageDialog(null, m);
		
	}







}
