package TemplatePattern;

public class GameWiiUsed extends GameMain{
	
	boolean hasGSleeve() { return false; }
	boolean hasGSpecialEd() { return false; }
	boolean hasGInstructions() { return false; }
	boolean hasGDLCCode() { return false; }
	boolean hasGInserts() { return false; }
	String game = "Wii Game";
	String gameBox = "Wii Game Box";
	
	public GameWiiUsed() {
		super();
	}
	
	@Override
	void getGType() {
		System.out.println("Game is a used Nintendo " + game);
	}

	@Override
	void getGContainer() {
		System.out.println(game + " is put in a blank used " + gameBox);
	}

	@Override
	void getGSleeve() {
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
	}
}
