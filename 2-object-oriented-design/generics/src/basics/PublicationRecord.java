package src.basics;

public class PublicationRecord<T, Y> {

    private T t;
    private Y y;

    public PublicationRecord(T t, Y y) {
	this.t = t;
	this.y = y;
    }

    public void printSummary() {
	System.out.printf("%s%n%s", t.toString(), y.toString());
    }
}
