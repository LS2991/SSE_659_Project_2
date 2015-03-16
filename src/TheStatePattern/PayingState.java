package TheStatePattern;

import java.util.Scanner;


public class PayingState implements State {
	SelfScanner selfScanner;
	
	public PayingState(SelfScanner selfScanner) {
		this.selfScanner = selfScanner;
	}
	
	public void start() {
		System.out.println("Scanning has already started");
	}

	public void scan() {
		System.out.println("Cannot scan, paying");
	}

	public void weigh() {
		System.out.println("Cannot weigh, paying");
	}

	public void moreToBag() {
		System.out.println("Cannot bag, paying");
	}

	public void readyToPay() {
		System.out.println("Already selecting payment method");
	}

	public void payWithCash() {
		Scanner in = new Scanner(System.in);
		boolean finished = false;
		
		System.out.println("Cash selected");
		while(!finished) {
			
			System.out.println("Are you sure? (y/n) ");
			
			String input = in.nextLine();
			input.toLowerCase();
			input.trim();
			
			if(input.equals("y")) {
				System.out.print("Please insert coins");
				selfScanner.setState(selfScanner.getInsertingCoinsState());
				finished = true;
			}
			
			else if(input.equals("n")) {
				System.out.println("Please choose another payment type");
				selfScanner.setState(selfScanner.getPayingState());
				finished = true;
			}
			
			else {
				System.out.println("Invalid input");
			}
		}
	}

	public void payWithCard() {
		Scanner in = new Scanner(System.in);
		boolean finished = false;
		
		System.out.println("Card selected");
		while(!finished) {
			
			System.out.print("Are you sure? (y/n) ");
			
			String input = in.nextLine();
			input.toLowerCase();
			input.trim();
			
			if(input.equals("y")) {
				System.out.println("Please select card type");
				selfScanner.setState(selfScanner.getSwipingCardState());
				finished = true;
			}
			
			else if(input.equals("n")) {
				System.out.println("Please choose another payment type");
				selfScanner.setState(selfScanner.getPayingState());
				finished = true;
			}
			
			else {
				System.out.println("Invalid input");
			}
		}
	}

	public void swipeDebit() {
		System.out.println("Payment method not selected");
	}

	public void swipeCredit() {
		System.out.println("Payment method not selected");
	}

	public void enterPin() {
		System.out.println("Payment method not selected");
	}

	@Override
	public void insertCoins() {
		System.out.println("Payment method not selected");
	}

	@Override
	public void insertCash() {
		System.out.println("Payment method not selected");
	}
}

