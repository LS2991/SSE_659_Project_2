package TheStatePattern;

public class SwipingCardState implements State {
	SelfScanner selfScanner;
	
	public SwipingCardState(SelfScanner selfScanner) {
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
		System.out.println("Please enter pin");
		selfScanner.setState(selfScanner.getEnteringPinState());
	}

	@Override
	public void swipeCredit() {
		System.out.println("Finished paying, thank you");
	}

	@Override
	public void enterPin() {
		System.out.println("Card has not been swiped");
	}
	
	@Override
	public void insertCash() {
		System.out.println("Paying with a card");
	}
	@Override
	public void insertCoins() {
		System.out.println("Paying with a card");
	}

}

