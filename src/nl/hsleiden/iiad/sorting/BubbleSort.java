package nl.hsleiden.iiad.sorting;

import nl.hsleiden.iiad.SortingAlgorithm;

public class BubbleSort<T extends Comparable<T>> implements SortingAlgorithm<T> {

    @Override
    public T[] sort(T[] list) {
        int end = list.length;

        boolean swapped;
        do {
            swapped = false;

            for(int i = 1; i < end; i++) {

                if(list[i-1].compareTo(list[i]) > 0) {
                    list = swap(list, i-1, i);
                    swapped = true;
                }

            }

            end--;

        } while(swapped);

        return list;
    }

    private T[] swap(T[] list, int a, int b) {
        final T temp = list[a];
        list[a] = list[b];
        list[b] = temp;
        return list;
    }

}
