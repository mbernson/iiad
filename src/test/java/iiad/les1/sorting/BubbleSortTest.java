package iiad.les1.sorting;

public class BubbleSortTest extends SortableTestBase {

    @Override
    public Sortable<String> newInstance() {
        return new BubbleSort<>();
    }
}