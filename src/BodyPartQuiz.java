
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String Slash = "/Users/league/Desktop/level-1/src/slash.jpg";
	String Brian = "/Users/league/Desktop/level-1/src/Brian.jpg";
	String Jimi = "/Users/league/Desktop/level-1/src/jimi.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
			
		// Make an int variable to hold the score.
int score = 0;
		// Ask the user who this person is and store their answer
String person = JOptionPane.showInputDialog("Who is this person");
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
if(person .equals("slash"))
{
	JOptionPane.showMessageDialog(null, "good");
	score++;
}
		// Otherwise:
		// -- Tell them they are wrong
else{
JOptionPane.showMessageDialog(null, "Wrong");
}	
// Use the method below to show the next image
showNextImage();
String acdc = JOptionPane.showInputDialog("Who is this person");
// If they got the answer right:
// -- Tell them they are correct.
// -- Increase the score by 1
if(acdc .equals("brain johnson"))
{
JOptionPane.showMessageDialog(null, "good");
score++;
}
// Otherwise:
// -- Tell them they are wrong
else{
JOptionPane.showMessageDialog(null, "Wrong");
}	
showNextImage();
String jim = JOptionPane.showInputDialog("Who is this person");
// If they got the answer right:
// -- Tell them they are correct.
// -- Increase the score by 1
if(jim .equals("jimi hendrix"))
{
JOptionPane.showMessageDialog(null, "good");
score++;
}
// Otherwise:
// -- Tell them they are wrong
else{
JOptionPane.showMessageDialog(null, "Wrong");
}
if(score == 3){
	JOptionPane.showMessageDialog(null, "you win!!!");
}
else {
	JOptionPane.showMessageDialog(null, "sorry try again");
}
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(Slash);
		imageList.add(imageLabel);
		imageLabel = loadImage(Brian);
		imageList.add(imageLabel);
		imageLabel = loadImage(Jimi);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}

