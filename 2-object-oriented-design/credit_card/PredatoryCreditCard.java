package credit_card;

public class PredatoryCreditCard extends CreditCard {
    private double apr;

    public PredatoryCreditCard(String customer, String bank, String account, int limit, double initialBal, double rate) {
	
	super(customer, bank, account, limit, initialBal); // initialize superclass
	this.apr = rate;
    }

    // A new method for assessing monthly interest charges
    public void processMonth() {
	if (balance > 0) {
	    double monthlyFactor = Math.pow(1 + apr, 1.0/12); // compute monthly rate
	    balance *= monthlyFactor;  // assess interest
	}
    }

    // Override the charge method defined in the superclass
    @Override
    public boolean charge(double price) {
	boolean isSuccess = super.charge(price);  // call inherited method
	if (!isSuccess)
	    balance += 5;

	return isSuccess;
    }
}
