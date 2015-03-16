package TemplatePattern;

public class GamePS3 extends GameMain{
	
	boolean hasGSpecialEd() { return false; }
	boolean hasGDLCCode() { return false; }
	boolean hasGInserts() { return false; }
	String game = "PS3 Game";
	String gameBox = "PS3 Game Box";
	
	public GamePS3() {
		super();
	}
	
	@Override
	void getGType() {
		System.out.println("Game is a Sony " + game);
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
	}
}
