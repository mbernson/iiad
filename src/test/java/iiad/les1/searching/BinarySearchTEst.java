package iiad.les1.searching;

public class BinarySearchTest extends SearchableTestBase {

    @Override
    public Searchable<String> newInstance() {
        return new BinarySearch<>();
    }

}
