package src.basics;

public class GenericDoubleParameter {
    public static void main(String[] args) {

	Book book = new Book("BK00001", "Generics for Beginners", "2025-10-18", 20);
	Author author = new Author("AU00001", "Jay Kay", "Male", 19);
	PublicationRecord record = new PublicationRecord<>(book, author);

	record.printSummary();
    }
}
