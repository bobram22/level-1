import javax.swing.JOptionPane;

public class pizzaMethods {
 void iRock(String name){
	System.out.println(name + "rocks/DawyenJohnson"); 
 
 }
 
 void truth(String names){
	 Object[] possibilities = {"Justin Biber", "Pokemon"};
	 String s = (String)JOptionPane.showInputDialog(
	                     null,
	                     "Complete the sentence:\n"
	                     + "\"who do you choose\"",
	                     "Customized Dialog",
	                     JOptionPane.PLAIN_MESSAGE,
	                     null,
	                     possibilities,
	                     "ham");

	 if(s .equals("Justin Biber")){
		 JOptionPane.showMessageDialog(null, "How dare you");
	 }
	 else if (s .equals("Pokemon")){
		 JOptionPane.showMessageDialog(null, "Yeah!!! Pokemon!!!!");
	 }

 }
}
