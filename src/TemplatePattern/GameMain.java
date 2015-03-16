package TemplatePattern;


public abstract class GameMain {
	
	final void makeGamePackage()
	{
			
			getGame();
			getGType();
			getGContainer();
	
			
			if(hasGSleeve()){
				getGSleeve();
			}
			
			if(hasGSpecialEd()){
				getGSpecialED();
			}
			
			if(hasGInstructions()){
				getGInstructions();
			}
			
			if(hasGDLCCode()){
				getDLCCode();
			}
			
			if(hasGInserts()){
				getGInserts();
			}
			
			packGame();
			sellGame();
			
		}
		
		
		public void getGame(){
			System.out.println("Selected Game");
		}
		
		public void packGame(){
			System.out.println("Game is ready to sell");
		}
		
		public void sellGame(){
			System.out.println("Game is on display to buy\n");
		}
		
		abstract void getGType();
		abstract void getGContainer();
	
		abstract void getGSleeve();
		abstract void getGSpecialED();
		abstract void getGInstructions();
		abstract void getDLCCode();
		abstract void getGInserts();
		
		boolean hasGSleeve() { return true; }
		boolean hasGSpecialEd() { return true; }
		boolean hasGInstructions() { return true; }
		boolean hasGDLCCode() { return true; }
		boolean hasGInserts() { return true; }

}
