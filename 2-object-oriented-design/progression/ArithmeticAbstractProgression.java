package progression;

/**
 * Implements the AbstractProgression class
 */
public class ArithmeticAbstractProgression extends AbstractProgression {

    protected long increment;

    /** Constructs progression 0, 1, 2, ... */
    public ArithmeticAbstractProgression() {
	this(0, 1);
    }

    /** Constructs progression 0, stepsize, 2*stepsize, ... */
    public ArithmeticAbstractProgression(long stepsize) {
	this(0, stepsize);
    }

    /** Constructs progression with arbitrary start and increment */
    public ArithmeticAbstractProgression(long start, long stepsize) {
	super(start);
	this.increment = stepsize;
    }

    /** Adds arithmetic increment to the current value */
    protected void advance() {
	current += increment;
    }
}
