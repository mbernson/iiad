package iiad.les1.searching;

import iiad.les1.sorting.BubbleSort;

public class BinarySearchTest extends SearchableTestBase {

    @Override
    public Searchable<String> newInstance() {
        return new BinarySearch<>();
    }

}
