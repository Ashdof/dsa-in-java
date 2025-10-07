import credit_card.CreditCard;

public class CreditCardDemo {
    public static void main(String[] args) {

	CreditCard[] wallet = new CreditCard[3];
	
	wallet[0] = new CreditCard("Kwame Awuku", "ProCredit Savings and Loans", "5391 0375 9387 5309", 500);
	wallet[1] = new CreditCard("Ama Ohene", "Central Bank of Ghana", "3485 0399 3395 1954", 3500);
	wallet[2] = new CreditCard("Kwame Awuku", "ProCredit Checking", "5391 0375 9387 5309", 2500, 300);

	for (int val = 1; val <= 16; val++) {
	    wallet[0].charge(3*val);
	    wallet[1].charge(2*val);
	    wallet[2].charge(val);
	}

	for (CreditCard card : wallet) {
	    
	    CreditCard.printSummary(card); // calling static method
	    while (card.getBalance() > 200.0) {
		card.makePayment(200);
		System.out.printf("Payment amount: %d%n", 200); // print payments
		System.out.printf("New balance: %.2f%n", card.getBalance());
	    }
	    
	    System.out.println(); // print a blank space after each main loop
	}
    }
}
