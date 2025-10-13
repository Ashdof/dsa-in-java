package progression;

/**
 * Definition of abstract base class
 */
public abstract class AbstractProgression {

    protected long current;

    public AbstractProgression(long start) {

	this.current = start;
    }

    public AbstractProgression() {
	this(0);
    }

    public long nextValue() {       // this is a concrete method
	long answer = current;
	advance();   // this protected call is responsible for advancing the current value
	return answer;
    }

    public void printProgression(int n) {   // this is a concrete method
	System.out.print(nextValue());  // print first value without leading space
	for (int j = 1; j < n; j++)
	    System.out.print(" " + nextValue()); // print leading space before others
	System.out.println();  // end the line
    }

    protected abstract void advance();  // abstract method without method body
}
