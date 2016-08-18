
public class SeaCreaturerunner {
	public static void main(String[] args) {
		SeaCreature spongebob = new	SeaCreature("Spongebob");
		System.out.println(spongebob.getName());
		spongebob.eat();
		spongebob.laugh();
		SeaCreature patrick = new SeaCreature("Patrick");
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		SeaCreature squidward = new SeaCreature("Squidward");
		System.out.println(squidward.getName());
		squidward.eat();
		squidward.laugh();
	}
}
