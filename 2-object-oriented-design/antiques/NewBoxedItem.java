package antiques;

import interfaces.Insurable;

/** Class for objects that can be sold, packed and shipped */
public class NewBoxedItem implements Insurable {

    private final String description;    // description of this item
    private final int price;             // list price in Ghana cedis
    private final int weight;            // weight in grams
    private final boolean hazardous;     // true if object is hazardous
    private int height;            // box height in centimeters
    private int width;             // box width in centimeters
    private int depth;             // box depth in centimeters

    /** Constructor */
    public NewBoxedItem(String description, int price, int weight, boolean hazardous) {
	this.description = description;
	this.price = price;
	this.weight = weight;
	this.hazardous = hazardous;
    }

    public String description() {
	return description;
    }

    public int listPrice() {
	return price;
    }

    public int lowestPrice() {
	return price / 2;
    }

    public int weight() {
	return weight;
    }

    public boolean isHazardous() {
	return hazardous;
    }

    public int insuredValue() {
	    return price * 2;
    }

    public void setBox(int height, int width, int depth) {
	this.height = height;
	this.width = width;
	this.depth = depth;
    }
}
