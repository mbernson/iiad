package nl.hsleiden.iiad;

import nl.hsleiden.iiad.sorting.BubbleSort;
import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {
        final Integer[] randomElements = generateRandomCharArray(1000);
        System.out.println("Generated a random list");
        printList(randomElements);
        System.out.println("Sorting...");

        SortingAlgorithm<Integer> sort = new BubbleSort<>();

        final long start, end;
        start = System.currentTimeMillis();
        final Integer[] sorted = sort.sort(randomElements);
        end = System.currentTimeMillis();

        System.out.println("Done");
        printList(sorted);
        System.out.printf("Elapsed time: %d ms\n", (end - start));
    }

    private static Integer[] generateRandomCharArray(int amount) {
        Random rng = new Random();
        Integer[] result = new Integer[amount];
        for (int i = 0; i < amount; i++) {
            result[i] = rng.nextInt();
        }
        return result;
    }

    private static void printList(Integer[] list) {
        System.out.print("{ ");
        for(Integer c : list) {
            System.out.print(c);
            System.out.print(", ");
        }
        System.out.print("}\n");
    }
}
