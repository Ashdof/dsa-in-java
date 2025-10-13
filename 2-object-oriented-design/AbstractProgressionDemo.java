import progression.*;

public class AbstractProgressionDemo {
    public static void main(String[] args) {
	
	ArithmeticAbstractProgression arithmeticProgression;
	int endValue = 10, step = 4, base = 2;

	System.out.print("Arithmetic progression with default increment: ");
	arithmeticProgression = new ArithmeticAbstractProgression();
	arithmeticProgression.printProgression(endValue);

	System.out.print("Arithmetic progression with increment of 5: ");
	arithmeticProgression = new ArithmeticAbstractProgression(5);
	arithmeticProgression.printProgression(endValue);

	System.out.print("Arithmetic progression with start of 2 and increment of 5: ");
	arithmeticProgression = new ArithmeticAbstractProgression(2, 5);
	arithmeticProgression.printProgression(endValue);

	System.out.println();
    }
}
