package iiad.les1.searching;

public class LinearSearchTest extends SearchableTestBase {

    @Override
    public Searchable<String> newInstance() {
        return new LinearSearch<>();
    }

    @Override
    public void testSearch() {
    }
}
