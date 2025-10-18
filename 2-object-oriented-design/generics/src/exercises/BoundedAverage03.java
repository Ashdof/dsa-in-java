package generics.src.exercises;

public class BoundedAverage03 {

    public static <T> void printArray(T[] data) {

        for (T t : data)
            System.out.print(" " + t);
        System.out.println();
    }

    public static <T extends Number> double computeAverage(T[] numbers) {

        double sum = 0;
        for (Number num : numbers)
            sum += num.doubleValue();

        return sum/numbers.length;
    }

    public static void main(String[] args) {

        Integer[] ages = {9, 7, 11, 8, 6, 12};
        Double[] scores = {95.0, 88.5, 70.5, 80.5, 91.5, 88.0, 90.5};

        System.out.print("Original ages: ");
        printArray(ages);
        double avgAge = computeAverage(ages);
        System.out.printf("Average age: %.0f%n", avgAge);

        System.out.print("Original scores: ");
        printArray(scores);
        double avgScore = computeAverage(scores);
        System.out.printf("Average score: %.2f%n", avgScore);
    }
}
