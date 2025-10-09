package progression;

public class GeometricProgression extends Progression {

    protected long base;

    /** Constructs progression 1, 2, 4, 8, 16 etc. */
    public GeometricProgression() {
	this(2, 1);
    }

    /** Constructs progression 1, b, b^2, b^3, b^4, ... for base b */
    public GeometricProgression(long base) {
	this(base, 1);
    }

    /** Constructs geometric progression with arbitrary base and start */
    public GeometricProgression(long base, long start) {
	super(start);
	this.base = base;
    }

    /** Multiplies the current value by the geometric base */
    protected void advance() {
	current *= base;
    }
}
