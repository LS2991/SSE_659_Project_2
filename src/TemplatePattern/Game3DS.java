package TemplatePattern;

public class Game3DS extends GameMain{
	
	boolean hasGSpecialEd() { return false; }
	boolean hasGDLCCode() { return false; }
	String game = "3DS Game";
	String gameBox = "3DS Game Box";
	
	@Override
	void getGType() {
		System.out.println("Game is a Nintendo " + game);
	}

	@Override
	void getGContainer() {
		System.out.println(game + " is put in a " + gameBox);
	}

	@Override
	void getGSleeve() {
		System.out.println("Sleeve for "+ game +" is inserted on the outside of the " + gameBox);
	}
	
	@Override
	void getGSpecialED() {		
	}

	@Override
	void getGInstructions() {
		System.out.println("Instructions are inserted into the " + gameBox);
	}

	@Override
	void getDLCCode() {		
	}

	@Override
	void getGInserts() {
		System.out.println("Ads for new games coming out are inserted into the " + gameBox);
	}

}
