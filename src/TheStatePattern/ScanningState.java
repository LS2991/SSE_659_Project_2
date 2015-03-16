package TheStatePattern;

public class ScanningState implements State {
	SelfScanner selfScanner;
	
	public ScanningState(SelfScanner selfScanner) {
		this.selfScanner = selfScanner;
	}
	
	public void start() {
		System.out.println("Scanning has already been started");
	}
	
	public void scan() {
		System.out.println("Item scanned, checking weight");
		selfScanner.setState(selfScanner.getCheckWeightState());
	}
	
	public void weigh() {
		System.out.println("Item has not been scanned");
	}
	
	
	public void moreToBag() {
		System.out.println("Item has not been scanned");
	}
	
	public void readyToPay() {
		System.out.println("Item has not been scanned");
	}
	
	public void payWithCash() {
		System.out.println("Item has not been scanned");
	}
	
	public void payWithCard() {
		System.out.println("Item has not been scanned");
	}
	
	public void swipeDebit() {
		System.out.println("Item has not been scanned");
	}
	
	public void swipeCredit() {
		System.out.println("Item has not been scanned");
	}
	
	public void enterPin() {
		System.out.println("Item has not been scanned");
	}

	@Override
	public void insertCoins() {
		System.out.println("Item has not been scanned");
	}

	@Override
	public void insertCash() {
		System.out.println("Item has not been scanned");
	}
}

