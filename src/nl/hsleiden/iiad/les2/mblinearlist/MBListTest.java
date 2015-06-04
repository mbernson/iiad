package nl.hsleiden.iiad.les2.mblinearlist;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class MBListTest extends TestCase {

    private MBList<String> list;

    @Before
    public void setUp() throws Exception {
//        list = new MBLinkedList<>();
        list = new MBDoublyLinkedList<>();
    }

    @After
    public void tearDown() throws Exception {
        list = null;
    }

    @Test
    public void testPushingAndPopping() {
        assertNull(list.pop());

        list.push("Reyer");
        list.push("Mathijs");

        assertEquals(list.pop(), "Mathijs");
        assertEquals(list.pop(), "Reyer");
        assertNull(list.pop());
    }

    @Test
    public void testShiftingAndUnshifting() {
        assertNull(list.shift());

        list.unshift("Mathijs");
        list.unshift("Reyer");

        assertEquals(list.shift(), "Reyer");
        assertEquals(list.shift(), "Mathijs");
        assertNull(list.shift());
    }

    @Test
    public void testSomeMorePushingAndPoppingAndShifting() {
        list.push("Mathijs");
        list.unshift("Reyer");
        list.push("Lisa");
        list.unshift("Eke");

        // The order should now be:
        // Eke, Reyer, Mathijs, Lisa
        assertEquals(list.get(0), "Eke");
        assertEquals(list.get(1), "Reyer");
        assertEquals(list.get(2), "Mathijs");
        assertEquals(list.get(3), "Lisa");

        assertEquals(list.shift(), "Eke");
        assertEquals(list.pop(), "Lisa");
        assertEquals(list.shift(), "Reyer");
        assertEquals(list.pop(), "Mathijs");
    }

    @Test
    public void testSize() throws Exception {
        assertEquals(list.size(), 0);
        list.add("Mathijs");
        assertEquals(list.size(), 1);
        list.add("Reyer");
        assertEquals(list.size(), 2);
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(list.isEmpty());
        list.add("Mathijs");
        assertFalse(list.isEmpty());
    }

    @Test
    public void testContains() throws Exception {
        String element = "Oscar";
        assertFalse(list.contains(element));
        list.add(element);
        assertTrue(list.contains(element));
        list.add("Mathijs");
        assertTrue(list.contains(element));
    }

    @Test
    public void testIteratorIsAvailable() throws Exception {
        assertNotNull(list.iterator());
    }

    @Test
    public void testIteratorWithEmptyList() throws Exception {
        Iterator<String> iter = list.iterator();
        assertFalse(iter.hasNext());
        assertNull(iter.next());
    }

    @Test
    public void testIteratorWithItems() throws Exception {
        list.add("Mathijs");
        list.add("Henk");
        Iterator<String> iter = list.iterator();
        assertTrue(iter.hasNext());

        assertEquals(iter.next(), "Mathijs");
        assertTrue(iter.hasNext());

        assertEquals(iter.next(), "Henk");
        assertFalse(iter.hasNext());
        assertNull(iter.next());
    }

    @Test
    public void testToArrayWithEmptyList() throws Exception {
        Object[] arr = list.toArray();
        assertEquals(arr.length, 0);
    }

    @Test
    public void testToArrayWithItems() throws Exception {
        list.add("Mathijs");
        list.add("Henk");
        Object[] arr = list.toArray();
        assertEquals(arr.length, 2);
    }

    @Test
    public void testRemove() throws Exception {

    }

    @Test
    public void testClear() throws Exception {
        list.add("Test");
        String element = "Foo";
        list.add(element);

        list.clear();

        assertEquals(list.size(), 0);
        assertFalse(list.contains(element));
    }

    @Test
    public void testGet() throws Exception {
        assertNull(list.get(0));
        assertNull(list.get(1));

        list.add("Hoi");
        assertSame(list.get(0), "Hoi");
    }

}