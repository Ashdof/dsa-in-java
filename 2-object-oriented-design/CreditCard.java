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
}
