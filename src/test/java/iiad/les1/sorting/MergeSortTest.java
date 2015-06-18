package iiad.les1.sorting;

public class MergeSortTest extends SortableTestBase {

    @Override
    public Sortable<Integer> newInstance() {
        return new MergeSort<>();
    }

}