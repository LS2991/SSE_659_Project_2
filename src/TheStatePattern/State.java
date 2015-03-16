package TheStatePattern;

public interface State {
	public void start();
	public void scan();
	public void weigh();
	public void moreToBag();
	public void readyToPay();
	public void payWithCash();
	public void payWithCard();
	public void swipeDebit();
	public void swipeCredit();
	public void enterPin();
	public void insertCoins();
	public void insertCash();
}
