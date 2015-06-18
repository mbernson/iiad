package iiad.les1.sorting;

public class MergeSortTest extends SortableTestBase {

    @Override
    public Sortable<String> newInstance() {
        return new MergeSort<>();
    }

}