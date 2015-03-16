package TemplatePattern;

public class GameGBAdv extends GameMain{
	
	boolean hasGSleeve() { return false; }
	boolean hasGSpecialEd() { return false; }
	boolean hasGInstructions() { return false; }
	boolean hasGDLCCode() { return false; }
	boolean hasGInserts() { return false; }
	String game = "GameBoy Advance Game";
	String gameBox = "GameBoy Advance Game Box";
	
	@Override
	void getGType() {
		System.out.println("Game is a Nintendo " + game);
	}

	@Override
	void getGContainer() {
		System.out.println("There is no box for the " + game);
	}

	@Override
	void getGSleeve() {	}
	
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
	}
}
