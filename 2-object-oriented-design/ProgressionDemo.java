import progression.*;

public class ProgressionDemo {
    public static void main(String[] args) {
	
	Progression progression;
	ArithmeticProgression arithmeticProgression;
	int endValue = 20, step = 4;

	progression = new Progression();
	System.out.print("Normal progression: ");
	progression.printProgression(endValue);

	arithmeticProgression = new ArithmeticProgression(step);
	System.out.print("Arithmetic progression: ");
	arithmeticProgression.printProgression(endValue);
    }
}
