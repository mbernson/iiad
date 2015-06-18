package iiad.les1.searching;

import iiad.les1.sorting.Sortable;

public class BinarySearch<T extends Comparable<T>> implements Searchable<T> {

    @Override
    public int search(T[] items, T target) {
        int low = 0,
<<<<<<< HEAD
            high = items.length - 1;

        while(low <= high) {
//            int middle = low + (high - low) / 2;
//            if      (target.compareTo(items[middle])) hi = mid - 1;
//            else if (key > a[mid]) lo = mid + 1;
//            else return mid;
=======
            mid,
            high = items.length - 1;

        while(low <= high) {
            mid = ( low + high ) / 2;

            if(items[mid].compareTo(target) < 0) {
                low = mid + 1;
            } else if(items[mid].compareTo(target) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
>>>>>>> 09fdba4947e653537b9ac850d638e151bba3a0d8
        }

        return NOT_FOUND;
    }

}
