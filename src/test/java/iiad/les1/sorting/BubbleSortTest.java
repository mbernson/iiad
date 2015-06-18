package iiad.les1.sorting;

public class BubbleSortTest extends SortableTestBase {

    @Override
    public Sortable<Integer> newInstance() {
        return new BubbleSort<>();
    }

}