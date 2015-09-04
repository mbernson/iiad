package iiad.les1.sorting;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public abstract class SortableTestBase extends TestCase {

    private Sortable<Integer> sortable;

    public abstract Sortable<Integer> newInstance();

    @Before
    public void setUp() throws Exception {
        sortable = newInstance();
    }

    @After
    public void tearDown() throws Exception {
        sortable = null;
    }

    @Test
    public void testSort() throws Exception {
        Integer[] arr = new Integer[] {
                5, 2, 3, 1, 0, 4
        };

        Integer[] sorted = sortable.sort(arr);

        assertNotNull(sorted);
        assertEquals(arr.length, sorted.length);
        assertArrayEquals(sorted, new Integer[]{0, 1, 2, 3, 4, 5});

        assertSame(sorted[0], Integer.valueOf(0));
        assertSame(sorted[5], Integer.valueOf(5));
    }
}