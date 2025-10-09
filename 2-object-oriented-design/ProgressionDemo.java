import progression.*;

public class ProgressionDemo {
    public static void main(String[] args) {
	
	Progression progression;
	ArithmeticProgression arithmeticProgression;
	GeometricProgression geometricProgression;
	FibonacciProgression fibonacciProgression;
	int endValue = 10, step = 4, base = 2;

	progression = new Progression();
	System.out.print("Normal progression: ");
	progression.printProgression(endValue);
	System.out.println();

	System.out.print("Arithmetic progression with default increment: ");
	arithmeticProgression = new ArithmeticProgression();
	arithmeticProgression.printProgression(endValue);

	System.out.print("Arithmetic progression with increment of 5: ");
	arithmeticProgression = new ArithmeticProgression(5);
	arithmeticProgression.printProgression(endValue);

	System.out.print("Arithmetic progression with start of 2: ");
	arithmeticProgression = new ArithmeticProgression(5, 2);
	arithmeticProgression.printProgression(endValue);

	System.out.println();

	System.out.print("Geometric progression with default base: ");
	geometricProgression = new GeometricProgression();
	geometricProgression.printProgression(endValue);

	System.out.print("Geometric progression with base 2: ");
	geometricProgression = new GeometricProgression(base);
	geometricProgression.printProgression(endValue);

	System.out.println();
	
	System.out.print("Fibonacci progression with default start values: ");
	fibonacciProgression = new FibonacciProgression(base, step);
	fibonacciProgression.printProgression(endValue);

	System.out.print("Fibonacci progression with start values of 4 and 6: ");
	fibonacciProgression = new FibonacciProgression(4, 6);
	fibonacciProgression.printProgression(endValue);
    }
}
