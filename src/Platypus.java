public class Platypus {
	private String name;

	public Platypus(String quack) {
		// TODO Auto-generated constructor stub
		name=quack;
	}

	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		Platypus Perry = new Platypus("Perry");	
		//2. Call the sayHi method
		Perry.sayHi();
//3. Create a constructor in the platypus class so that you can give your platypus a name.
	}
}
