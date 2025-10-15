import exceptions.ThrowException;
import java.util.Scanner;

public class ThrowExceptionDemo {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int value;

	System.out.print("Enter number: ");
	value = scanner.nextInt();
	scanner.nextLine();

	try {
	    ThrowException.ensurePositive(value);
	    System.out.printf("You entered: '%d'%n", value);
	} catch(IllegalArgumentException ex) {
	    System.out.println("Error: " + ex.getMessage());
	}
    }
}
