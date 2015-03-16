package TheStatePattern;

public class WaitForStartState implements State {
	SelfScanner selfScanner;
	
	public WaitForStartState(SelfScanner selfScanner) {
		this.selfScanner = selfScanner;
	}
	
	public void start() {
		System.out.println("Checkout has started");
		selfScanner.setState(selfScanner.getScanningState());
	}
	
	public void scan() {
		System.out.println("Scanning has not started");
	}
	
	public void weigh() {
		System.out.println("Scanning has not started");
	}
	
	public void moreToBag () {
		System.out.println("Scanning has not started");
	}
	
	public void doneBagging() {
		System.out.println("Scanning has not started");
	}
	
	public void readyToPay() {
		System.out.println("Scanning has not started");
	}
	
	public void payWithCash() {
		System.out.println("Scanning has not started");
	}
	
	public void payWithCard() {
		System.out.println("Scanning has not started");
	}
	
	public void swipeDebit() {
		System.out.println("Scanning has not started");
	}
	
	public void swipeCredit() {
		System.out.println("Scanning has not started");
	}
	
	public void enterPin() {
		System.out.println("Scanning has not started");
	}

	@Override
	public void insertCoins() {
		System.out.println("Scanning has not started");
	}

	@Override
	public void insertCash() {
		System.out.println("Scanning has not started");
	}

}

