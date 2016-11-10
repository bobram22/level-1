
public class Superhero {
String name;
String Superpower;
public Superhero (String name, String Superpower){
	this.name= name;
	this.Superpower= Superpower;
}
public String getname(){
	return name;	
}
public String getSuperpower(){

	return Superpower;
}
public static void main(String[] args) {
Superhero DatBoi =	new Superhero("Dat Boi", "Whatup" );
Superhero BIll = new Superhero("Billy Mayes", "Oxy Clean");
Superhero L = new Superhero("Lord Saledan", "Iorn Lord");
System.out.println(DatBoi);
System.out.println(BIll);
System.out.println(L);
}
public String toString(){
	return name +" has mad " + Superpower + " skills!";
}
}
