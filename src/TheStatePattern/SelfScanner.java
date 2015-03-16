package TheStatePattern;

public class SelfScanner {
	
	State baggingState;
	State checkWeightState;
	State enteringPinState;
	State insertingCashState;
	State insertingCoinsState;
	State payingState;
	State scanningState;
	State swipingCardState;
	State waitForStartState;
	
	State state;
	
	public SelfScanner() {
		baggingState = new BaggingState(this);
		checkWeightState = new CheckWeightState(this);
		enteringPinState = new EnteringPinState(this);
		insertingCashState = new InsertingCashState(this);
		insertingCoinsState = new InsertingCoinsState(this);
		swipingCardState = new SwipingCardState(this);
		waitForStartState = new WaitForStartState(this);
		payingState = new PayingState(this);
		scanningState = new ScanningState(this);
		state = waitForStartState;
	}
	
	public void start() {
		state.start();
	}
	public void scan() {
		state.scan();
	}

	public void weigh() {
		state.weigh();
	}
	
	public void moreToBag() {
		state.moreToBag();
	}
	
	public void readyToPay() {
		state.readyToPay();
	}
	
	public void payWithCash() {
		state.payWithCash();
	}
	
	public void payWithCard() {
		state.payWithCard();
	}
	
	public void swipeDebit() {
		state.swipeDebit();
	}
	
	public void swipeCredit() {
		state.swipeCredit();
	}
	
	public void enterPin() {
		state.enterPin();
	}
	
	public void insertCoins() {
		state.insertCoins();
	}
	
	public void insertCash() {
		state.insertCash();
	}
	
	public String toString() {
		return state.toString().substring(0, state.toString().lastIndexOf("@")); //parses memory location from string
	}
	
	public State getCheckWeightState() {
		return checkWeightState;
	}

	public State getBaggingState() {
		return baggingState;
	}

	public State getScanningState() {
		return scanningState;
	}

	public State getPayingState() {
		return payingState;
	}
	
	public State getInsertingCoinsState() {
		return insertingCoinsState;
	}

	public State getSwipingCardState() {
		return swipingCardState;
	}

	public State getInsertingCashState() {
		return insertingCashState;
	}

	public State getWaitingForStartState() {
		return waitForStartState;
	}

	public State getEnteringPinState() {
		return enteringPinState;
	}
	
	public void setState(State newState) {
		state = newState;
	}

}

