package TheStatePattern;
import java.util.Scanner;


public class SelfScannerTest {

	public static void main(String[] args) {
		SelfScanner selfScanner = new SelfScanner();
		Scanner in = new Scanner(System.in);
		String input;
		boolean done = false;
		
		System.out.println("-------Welcome to the Self Scanner-------\n\n");
		System.out.println("Please type in number of the desired command: \n");
		while(!done) {
			//Menu start
			System.out.println("\n" + selfScanner.toString());
			System.out.println("\n\n1. Start Scanning");
			System.out.println("2. Scan Item");
			System.out.println("3. Weigh Item");
			System.out.println("4. More Items to Scan");
			System.out.println("5. Finished Bagging and Ready to Scan");
			System.out.println("6. Pay With Cash");
			System.out.println("7. Pay With Card");
			System.out.println("8. Swipe Debit Card");
			System.out.println("9. Swipe Credit Card");
			System.out.println("10. Enter Pin Number");
			System.out.println("11. Insert Cash");
			System.out.println("12. Insert Coins");
			System.out.println("f. Finish Program\n");
			System.out.print("Input command here: ");
			input = in.nextLine();
			input.toLowerCase();
			input.trim();
			
			System.out.println();
			
			switch(input) {
				
			case "1":
				selfScanner.start();
				break;
				
			case "2":
				selfScanner.scan();
				break;
				
			case "3":
				selfScanner.weigh();
				break;
				
			case "4":
				selfScanner.moreToBag();
				break;
				
			case "5":
				selfScanner.readyToPay();
				break;
				
			case "6":
				selfScanner.payWithCash();
				break;
				
			case "7":
				selfScanner.payWithCard();
				break;
				
			case "8":
				selfScanner.swipeDebit();
				break;
				
			case "9":
				selfScanner.swipeCredit();
				break;
				
			case "10":
				selfScanner.enterPin();
				break;
				
			case "11":
				selfScanner.insertCash();
				break;
				
			case "12":
				selfScanner.insertCoins();
				break;
			case "f":
				done = true;
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
		in.close();
	}

}
