package TemplatePattern;

public class GameXboxSP extends GameMain{
	
	boolean hasGInserts() { return false; }
	boolean hasGDLCCode() { return false; }
	String game = "Xbox Game";
	String gameBox = "Xbox Game Box";
	
	public GameXboxSP() {
		super();
	}
	
	@Override
	void getGType() {
		System.out.println("Game is a Microsoft Special Edition " + game);
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
		System.out.println(gameBox + "is put inside of a Special Edition Steel Game Box.\n "
				+ "The Special Edition Box includes a Deluxe Strategy Guide and Game Poster ");
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
	}
}
