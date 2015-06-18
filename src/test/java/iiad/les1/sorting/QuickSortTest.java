package iiad.les1.sorting;

public class QuickSortTest extends SortableTestBase {

    @Override
    public Sortable<Integer> newInstance() {
        return new QuickSort<>();
    }

}