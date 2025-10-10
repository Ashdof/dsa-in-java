package interfaces;

/** Interface for objects that can be sold */
public interface Sellable {

    /** Returns description of the object */
    String description();

    /** Returns the list price in Ghana Cedis */
    int listPrice();

    /** Returns the lowest price in Ghana Cedis we will accept */
    int lowestPrice();
}
