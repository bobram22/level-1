import javax.swing.JOptionPane;

public class SeaCreatureRunner {
public static void main(String[] args) {
	
	Object[] possibilities = {"SpongeBob", "Patrick", "Squidward"};
	String s = (String)JOptionPane.showInputDialog(
	                    null,
	                    "Complete the sentence:\n"
	                    + "\"Green eggs and...\"",
	                    "Customized Dialog",
	                    JOptionPane.PLAIN_MESSAGE,
	                    null,
	                    possibilities,
	                    "ham");

if(s .equals("Spongebob")){
	SeaCreature Spongebob = new SeaCreature("Spongebob");
	Spongebob.eat();
	Spongebob.laugh();
}
	if(s .equals("Patrick")){
	SeaCreature Patrick = new SeaCreature("Patrick");
	Patrick.getName();
	Patrick.eat();
	Patrick.laugh();
	}
	
	if(s .equals("Squidward")){
	SeaCreature Squidward = new SeaCreature("Squidward");
	Squidward.getName();
	Squidward.eat();
	Squidward.laugh();
	}
}
}
