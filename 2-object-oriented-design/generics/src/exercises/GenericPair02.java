package src.exercises;

public class GenericPair02<K, V> {
    private K key;
    private V value;

    public GenericPair02(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public K getKey() {
	return this.key;
    }

    public V getValue() {
	return this.value;
    }

    public static void main(String[] args) {

	GenericPair02<String, Double> score = new GenericPair02<>("Jay Kay", 80.5);

	System.out.println("Original tuple: (Jay Kay, 80.5)");
	System.out.printf("Key: %s%n", score.getKey());
	System.out.printf("Value: %.2f%n", score.getValue());
    }
}
