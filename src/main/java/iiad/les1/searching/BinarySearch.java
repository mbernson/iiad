package iiad.les1.searching;

public class BinarySearch<T extends Comparable<T>> implements Searchable<T> {

    @Override
    public int search(T[] items, T target) {
        int low = 0,
            high = items.length - 1;

        while(low <= high) {
//            int middle = low + (high - low) / 2;
//            if      (target.compareTo(items[middle])) hi = mid - 1;
//            else if (key > a[mid]) lo = mid + 1;
//            else return mid;
        }

        return NOT_FOUND;
    }

}
