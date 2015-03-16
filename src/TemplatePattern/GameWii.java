package TemplatePattern;

public class GameWii extends GameMain{
	
	boolean hasGSpecialEd() { return false; }
	boolean hasGInstructions() { return false; }
	boolean hasGDLCCode() { return false; }
	String game = "Wii Game";
	String gameBox = "Wii Game Box";
	
	
	public GameWii() {
		super();
	}
	
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
	}

	@Override
	void getDLCCode() {		
	}

	@Override
	void getGInserts() {
		System.out.println("Ads for new games coming out are inserted into the " + gameBox);
	}
}
