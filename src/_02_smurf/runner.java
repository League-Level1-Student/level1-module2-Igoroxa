package _02_smurf;

public class runner {
public static void main(String[] args) {
	

	Smurf HandySmurf = new Smurf("HandySmurf");
	HandySmurf.eat();
	HandySmurf.getName();
	
	Smurf PapaSmurf = new Smurf("papasmurf");
	PapaSmurf.getName();
	PapaSmurf.getHatColor();
	PapaSmurf.isGirlOrBoy();
	
	Smurf Smurfette = new Smurf("Smurfette");
	Smurfette.getName();
	Smurfette.getHatColor();
	Smurfette.isGirlOrBoy();
}
}
