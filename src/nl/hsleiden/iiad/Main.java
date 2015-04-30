package nl.hsleiden.iiad;

import nl.hsleiden.iiad.searching.LinearSearch;
import nl.hsleiden.iiad.sorting.BubbleSort;
import nl.hsleiden.iiad.sorting.QuickSort;

public class Main {

    public static void main(String[] args) {
        final Character[] rij = {'M', 'H', 'O', 'G', 'P', 'F', 'Z', 'D', 'A', 'K'};

        SortingAlgorithm<Character> sort = new BubbleSort<>();
        SearchAlgorithm<Character> search = new LinearSearch<>();

        final long start, end;
        start = System.currentTimeMillis();
//        Character result = search.search(rij, 'A');
        final Character[] sorted = sort.sort(rij);
        end = System.currentTimeMillis();

        System.out.println("Done");
        printList(sorted);
//        System.out.println(result);
        System.out.printf("Elapsed time: %d ms\n", (end - start));
    }

    private static void printList(Character[] list) {
        for(Character c : list) {
            System.out.println(c);
        }
    }
}
