package TemplatePattern;

public class GamePS3SP extends GameMain{
	
	boolean hasGInserts() { return false; }
	String game = "PS3 Game";
	String gameBox = "PS3 Game Box";
	
	public GamePS3SP() {
		super();
	}
	
	@Override
	void getGType() {
		System.out.println("Game is a Sony Special Edition " + game);
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
		System.out.println(gameBox + "is put inside of a Special Edition Game Box.\n "
				+ "The Special Edition Box includes Game Character Figures, a Deluxe Strategy Guide,\n "
				+ "Game Poster and DLC Codes preinstalled on the game");
	}

	@Override
	void getGInstructions() {
		System.out.println("Instructions are inserted into the " + gameBox);
	}

	@Override
	void getDLCCode() {	
		System.out.println("DLC Codes are inserted in the Special Edition " + gameBox);
	}

	@Override
	void getGInserts() {
	}

}
