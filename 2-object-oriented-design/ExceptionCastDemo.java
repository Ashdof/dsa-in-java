/**
 * Demonstration of ExceptionCast
 */
public class ExceptionCastDemo {
    public static void main(String[] args) {
	Number n;
	Integer i;

	n = new Integer(3);
	if (n instanceof Integer) {
	    i = (Integer) n;
	    System.out.printf("Number: %d%nValue of i: %d%n%n", n, i);
	}

	n = new Double(3.1415);
	if (n instanceof Integer) {
	    i = (Integer) n;
	    System.out.printf("Number: %.3f%nValue of i: %d%n%n", n, i);
	}
    }
}
