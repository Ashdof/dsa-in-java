package src.basics;

public class Book {

    private String id, title, pubDate;
    private int quantity;

    public Book(String id, String title, String pubDate, int quantity) {
	this.id = id;
	this.title = title;
	this.pubDate = pubDate;
	this.quantity = quantity;
    }

    @Override
    public String toString() {

	return String.format("Book Information:%n==============================%nID:\t\t\t%s%nPublication date:\t%s%nQuantity:\t\t%s%n",
			     this.id, this.title, this.pubDate, String.valueOf(this.quantity));
    }
}
