package iiad.les1.sorting;

public class QuickSortTest extends SortableTestBase {

    @Override
    public Sortable<String> newInstance() {
        return new QuickSort<>();
    }

}