package exceptions;

/**
 * Class to demonstrate how to throw an exception
 */
public class ThrowException {

    public static void ensurePositive(int number) throws IllegalArgumentException {
	if (number < 0)
	    throw new IllegalArgumentException("That's not positive. Enter a positive number!");
    }
}
