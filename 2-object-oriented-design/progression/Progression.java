package progression;

/**
 * Generate a simple progression. By default: 0, 1, 2, 3 ...
 */
public class Progression {

    // instance variable
    protected long current;

    /** Constructs a progression starting at zero **/
    public Progression() {
	this(0);
    }

    /** Constructs progression with given start number */
    public Progression(long start) {
	current = start;
    }

    /** Returns the next value of the progression */
    public long nextValue() {
	long answer = current;
	adnvance();
	
	return answer;
    }

    /** Advance the current value to the next value of the progression */
    protected void advance() {
	current++;
    }

    /** Print the next n values of the progression, separated by spaces */
    public void printProgression(int n) {
	System.out.print(nextValue());

	for (int j = 1; j < n; j++)
	    System.out.print(" " + nextValue());

	System.out.println();
    }
}
