package progression;

public class ArithmeticProgression extends Progression {

    protected long increment;

    /** Constructs progression 0, 1, 2, ... */
    public ArithmeticProgression() {
	this(0, 1);
    }

    /** Constructs progression 0, stepsize, 2*stepsize, ... */
    public ArithmeticProgression(long stepsize) {
	this(stepsize, 0);
    }

    /** Constructs progression with arbitrary start and increment */
    public ArithmeticProgression(long stepsize, long start) {
	super(start);
	this.increment = stepsize;
    }

    /** Adds arithmetic increment to the current value */
    protected void advance() {
	current += increment;
    }
}
