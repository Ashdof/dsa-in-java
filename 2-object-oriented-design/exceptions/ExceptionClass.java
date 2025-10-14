package exceptions;

/**
 * Demonstration of exceptions
 */
public class ExceptionClass {

    private int valueOne;
    private int valueTwo;

    public ExceptionClass(int valueOne) {
	this(0, valueOne);
    }

    public ExceptionClass(int valueOne, int valueTwo) {
	this.valueOne = valueOne;
	this.valueTwo = valueTwo;
    }

    protected void advance() {
	valueOne++;
    }

    protected void decrement() {
	valueTwo--;
    }

    public int addSeries() {
	int sum = 0;
	while (valueOne < valueTwo) {
	    sum += valueOne;
	    advance();
	}

	return sum;
    }

    protected void divideSeries() {
	int result = valueTwo;
	while (valueTwo > valueOne) {
	    result /= valueOne;
	    decrement();

	    System.out.print(result + " ");
	}

	System.out.println();
    }

    public void printDivisionResult() {
	System.out.printf("%nSummary:%n==============%nStart value: %d%nEnd value: %d%nResult: ",
			  valueTwo, valueOne);
	this.divideSeries();
	System.out.println();
    }

    public void printResult() {
	System.out.printf("%nSummary:%n===========%nStart value: %d%nEnd value: %d%nSum: %d%n%n",
			  valueOne, valueTwo, addSeries());
    }
}
