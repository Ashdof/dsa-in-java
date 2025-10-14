import exceptions.ExceptionClass;

public class ExceptionClassDemo {
    public static void main(String[] args) {
	ExceptionClass exceptClass;
	int start = 1, end = 5;

	System.out.println("Initialize class with two parameters");
	exceptClass = new ExceptionClass(start, end);
	exceptClass.printResult();

	System.out.println("Initialize class with one parameter");
	exceptClass = new ExceptionClass(start);
	exceptClass.printResult();

	System.out.println("Demonstration of division of two parameters");
	exceptClass = new ExceptionClass(2, end);
	exceptClass.printDivisionResult();

	System.out.println("Demonstration of division of one parameter");
	exceptClass = new ExceptionClass(start);
	exceptClass.printDivisionResult();
    }
}
