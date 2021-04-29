package _01_sea_creature;

public class runner {

	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("sponge bob");
		spongebob.eat();
		spongebob.laugh();
		
		SeaCreature patrick = new SeaCreature("patrick");
		patrick.eat();
		patrick.laugh();
	
		SeaCreature Squidward = new SeaCreature("squidward");
		Squidward.eat();
		Squidward.laugh();
	}
	
}
