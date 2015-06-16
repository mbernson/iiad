package iiad.les1.searching;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mathijs on 16-6-2015.
 */
public abstract class SearchableTestBase extends TestCase {


    private Searchable<String> searchable;

    @Before
    public void setUp() {
        searchable = newInstance();
    }

    public abstract Searchable<String> newInstance();

    @After
    public void tearDown() throws Exception {
        searchable = null;
    }

    @Test
    public void testSearch() throws Exception {
        String[] items = new String[] {
                "Foo",
                "Bar",
                "Baz",
                "Quux"
        };

        assertEquals(-1, searchable.search(items, "Nonexistent"));
        assertEquals(0, searchable.search(items, "Foo"));
        assertEquals(1, searchable.search(items, "Bar"));
        assertEquals(2, searchable.search(items, "Baz"));
        assertEquals(3, searchable.search(items, "Quux"));

        assertEquals(2, searchable.search(items, "Baz"));
        assertEquals(1, searchable.search(items, "Bar"));
    }

    @Test
    public void testSearchingEmptyArrays() {
        String[] items = new String[0];

        assertEquals(-1, searchable.search(items, "Nonexistent"));
    }
}