package TemplatePattern;

public class GameXbox extends GameMain{
	
	boolean hasGSpecialEd() { return false; }
	boolean hasGInserts() { return false; }
	String game = "Xbox Game";
	String gameBox = "Xbox Game Box";
	
	@Override
	void getGType() {
		System.out.println("Game is a Microsoft " + game);
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
		System.out.println("DLC Code is inserted in the " + gameBox);
	}

	@Override
	void getGInserts() {
	}
}
