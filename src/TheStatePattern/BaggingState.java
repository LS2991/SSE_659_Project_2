package TheStatePattern;

public class BaggingState implements State {
	SelfScanner selfScanner;
	
	public BaggingState(SelfScanner selfScanner) {
		this.selfScanner = selfScanner;
	}
	
	public void start() {
		System.out.println("Scanning has already started");
	}
	
	public void scan() {
		System.out.println("Cannot scan, bagging item");
	}
	
	public void weigh() {
		System.out.println("Cannot weigh, bagging item");
	}
	
	public void moreToBag() {
		System.out.println("Item bagged, scan next item");
		selfScanner.setState(selfScanner.getScanningState());
	}
	
	public void readyToPay() {
		System.out.println("Bagging is complete, please select payment method");
		selfScanner.setState(selfScanner.getPayingState());
	}
	
	public void payWithCash() {
		System.out.println("Bagging is not complete");
	}
	
	public void payWithCard() {
		System.out.println("Bagging is not complete");
	}
	
	public void swipeDebit() {
		System.out.println("Bagging is not complete");
	}
	
	public void swipeCredit() { 
		System.out.println("Bagging is not complete");
	}
	
	public void enterPin() {
		System.out.println("Bagging is not complete");
	}

	@Override
	public void insertCoins() {
		System.out.println("Bagging is not complete");
	}

	@Override
	public void insertCash() {
		System.out.println("Bagging is not complete");
	}
}

