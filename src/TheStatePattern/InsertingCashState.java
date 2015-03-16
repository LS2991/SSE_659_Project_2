package TheStatePattern;

public class InsertingCashState implements State {
	SelfScanner selfScanner;
	
	public InsertingCashState(SelfScanner selfScanner) {
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
		System.out.println("Already paying");
	}

	
	public void payWithCash() {
		System.out.println("Already paying");
	}

	
	public void payWithCard() {
		System.out.println("Already paying");
	}

	
	public void swipeDebit() {
		System.out.println("Already paying");
	}

	
	public void swipeCredit() {
		System.out.println("Already paying");
	}

	
	public void enterPin() {
		System.out.println("Already paying");
	}

	
	public void insertCoins() {
		System.out.println("Already inserted coins");
	}

	public void insertCash() {
		System.out.println("Finished paying, thank you");
		selfScanner.setState(selfScanner.getWaitingForStartState());
	}
}

