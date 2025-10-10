package interfaces;

public interface Insurable extends Sellable, Transportable {

    /** Returns insured value in Ghana cedis */
    int insuredValue();
}
