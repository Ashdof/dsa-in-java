package generics.src.exercises;

public class SwapFunction01 {

    public static <T> T[] swap(T[] array, int post1, int post2) {
	
	T[] data = array;
	T temp = data[post1];
	data[post1] = data[post2];
	data[post2] = temp;

	return data;
    }

    public static <T> void printArray(T[] data) {

	for (T t : data)
	    System.out.print(" " + t);
	System.out.println();
    }

    public static void main(String[] args) {

	String[] animals = {"cat", "dog", "lion", "pigeon", "duck", "tiger", "pig"};
	Integer[] scores = {70, 45, 50, 55, 60, 65, 40};

	System.out.print("Original: ");
	printArray(animals);
	String[] newAnimals = swap(animals, 2, 6);
	System.out.print("Swapped: ");
	printArray(newAnimals);
	
	System.out.println();
	
	System.out.print("Original: ");
	printArray(scores);
	Integer[] newScores = swap(scores, 0, 6);
	System.out.print("Swapped: ");
	printArray(newScores);
    }
}
