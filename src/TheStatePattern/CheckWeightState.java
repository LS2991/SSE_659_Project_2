package TheStatePattern;

import java.util.Scanner;


public class CheckWeightState implements State {
	SelfScanner selfScanner;
	
	public CheckWeightState(SelfScanner selfScanner) {
		this.selfScanner = selfScanner;
	}
	
	public void start() {
		System.out.println("Scanning has already been started");
	}
	
	public void scan() {
		System.out.println("Scanning has already been started");
	}
	
	public void weigh() {
		
		Scanner in = new Scanner(System.in);
		boolean done = false;
		System.out.print("Weight correct (y/n)? ");
		while(!done) {
			String answer = in.nextLine();
			answer.toLowerCase();
			answer.trim();
			if(answer.equals("y")) {
				System.out.println("Item bagged");
				done = true;
				selfScanner.setState(selfScanner.getBaggingState());
			}
			else if(answer.equals("n")) {
				System.out.println("Please rescan the item");
				done = true;
				selfScanner.setState(selfScanner.getScanningState());
			}
			else
				System.out.println("Invalid input");
		}	
		
//		System.out.print("Weight corrent. Bag item now");
//		selfScanner.setState(selfScanner.getBaggingState());
	}
	
	public void moreToBag() {
		System.out.println("Still weighing item");
	}
	
	public void readyToPay() {
		System.out.println("Still weighing item");
	}
	
	public void payWithCash() {
		System.out.println("Still weighing item");
	}
	
	public void payWithCard() {
		System.out.println("Still weighing item");
	}
	
	public void swipeDebit() {
		System.out.println("Still weighing item");
	}
	
	public void swipeCredit() {
		System.out.println("Still weighing item");
	}
	
	public void enterPin() {
		System.out.println("Still weighing item");
	}

	@Override
	public void insertCoins() {
		System.out.println("Still weighing item");
	}

	@Override
	public void insertCash() {
		System.out.println("Still weighing item");
	}
}
