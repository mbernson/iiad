package iiad.les1.sorting;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public abstract class SortableTestBase extends TestCase {

    private Sortable<String> sortable;

    public abstract Sortable<String> newInstance();

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

    }
}