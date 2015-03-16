package TheStatePattern;

public class EnteringPinState implements State {
	SelfScanner selfScanner;
	
	public EnteringPinState(SelfScanner selfScanner) {
		this.selfScanner = selfScanner;
	}
	
	@Override
	public void start() {
		System.out.println("Scanning has already started");
	}

	@Override
	public void scan() {
		System.out.println("Cannot scan, paying");
	}

	@Override
	public void weigh() {
		System.out.println("Cannot weigh, paying");
	}

	@Override
	public void moreToBag() {
		System.out.println("Cannot bag, paying");
	}

	@Override
	public void readyToPay() {
		System.out.println("Already paying");
	}

	@Override
	public void payWithCash() {
		System.out.println("Already paying");
	}

	@Override
	public void payWithCard() {
		System.out.println("Already paying");

	}

	@Override
	public void swipeDebit() {
		System.out.println("Already paying");

	}

	@Override
	public void swipeCredit() {
		System.out.println("Already paying");

	}

	@Override
	public void enterPin() {
		System.out.println("Finished paying, thank you");
		selfScanner.setState(selfScanner.getWaitingForStartState());
	}

	@Override
	public void insertCoins() {
		System.out.println("Paying with card");
	}

	@Override
	public void insertCash() {
		System.out.println("Paying with cash");
	}

}

