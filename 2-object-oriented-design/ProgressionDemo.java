import progression.*;

public class ProgressionDemo {
    public static void main(String[] args) {
	
	Progression progression;
	ArithmeticProgression arithmeticProgression;
	GeometricProgression geometricProgression;
	int endValue = 20, step = 4, base = 3;

	progression = new Progression();
	System.out.print("Normal progression: ");
	progression.printProgression(endValue);

	arithmeticProgression = new ArithmeticProgression(step);
	System.out.print("Arithmetic progression: ");
	arithmeticProgression.printProgression(endValue);

	geometricProgression = new GeometricProgression(base);
	System.out.print("Geometric progression: ");
	geometricProgression.printProgression(endValue);
    }
}
