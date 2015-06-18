package iiad.les1.searching;

public class BinarySearch<T extends Comparable<T>> implements Searchable<T> {

    @Override
    public int search(T[] items, T target) {
        int low = 0,
            high = items.length - 1;

        while(low <= high) {

        }

        return NOT_FOUND;
    }

}
