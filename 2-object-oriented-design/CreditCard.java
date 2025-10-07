public class CreditCard {
    // Instance Variables
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    // Constructors
    public CreditCard(String customer, String bank, String account, int limit, double initialBalance) {
	this.customer = customer;
	this.bank = bank;
	this.account = account;
	this.limit = limit;
	this.balance = initialBalance;
    }

    public CreditCard(String customer, String bank, String account, int limit) {
	this(customer, bank, account, limit, 0.0); // use a balance of zero as default
    }

    // Accessor Methods
    public String getCustomer() {return this.customer;}
    public String getBank() {return this.bank;}
    public String getAccount() {return this.account;}
    public int getLimit() {return this.limit;}
    public double getBalance() {return this.balance;}

    // Update methods
    public boolean charge(double price) {
	if (price + balance > limit)
	    return false;
	// at this point the charge is successful
	balance += price;
	return true;
    }

    public void makePayment(double amount) {
	balance -= amount;
    }

    // Utility method to print a card's information
    public static void printSummary(CreditCard card) {

	System.out.printf("Customer: %s%nBank: %s%nAccount: %s%nBalance: %.2f%nLimit: %d%n",
			  card.customer, card.bank, card.account, card.balance, card.limit);
    }

    // Main class
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
