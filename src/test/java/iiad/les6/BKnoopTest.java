package iiad.les6;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BKnoopTest extends TestCase {
    private BKnoop<String> root;

    @Before
    public void setUp() throws Exception {
        root = new BKnoop<>("wortel");
        root.add(new BKnoop<>("kind 1"));
        root.add(new BKnoop<>("kind 2"));
    }

    @After
    public void tearDown() throws Exception {
        root = null;
    }

    @Test
    public void testAddingChildren() throws Exception {
        root = new BKnoop<>("wortel");
        BKnoop<String> left = new BKnoop<>("kind 1");
        root.add(left);

        assertEquals(root.getLeftChild(), left);

        BKnoop<String> right = new BKnoop<>("kind 2");
        root.add(right);
        assertEquals(root.getRightChild(), right);
    }

    @Test
    public void testAantalKnopenInEnkeleKnoop() {
        BKnoop<String> knoop = new BKnoop<>();
        assertEquals(knoop.aantalKnopen(), 1);
    }

    @Test
    public void testAantalKnopenInBoom() {
        assertEquals(root.aantalKnopen(), 3);
        root.getLeftChild().add(new BKnoop<>());
        root.getLeftChild().add(new BKnoop<>());
        assertEquals(root.aantalKnopen(), 5);
        root.getRightChild().add(new BKnoop<>());
        assertEquals(root.aantalKnopen(), 6);
    }

    @Test
    public void testAantalBladenInEnkeleKnoop() {
        BKnoop<String> knoop = new BKnoop<>();
        assertEquals(knoop.aantalBladen(), 1);
    }

    @Test
    public void testAantalBladenInBoom() {
        assertEquals(root.aantalBladen(), 2);

        root.getLeftChild().add(new BKnoop<>());
        assertEquals(root.aantalBladen(), 2);
        root.getLeftChild().add(new BKnoop<>());
        assertEquals(root.aantalBladen(), 3);

    }

    @Test
    public void testDiepteVanEnkeleKnoop() {
        BKnoop<String> knoop = new BKnoop<>();
        assertEquals(knoop.diepte(), 1);
    }

    @Test
    public void testDiepteVanBoom() {
        assertEquals(root.diepte(), 2);

        root.getLeftChild().add(new BKnoop<>());
        assertEquals(root.diepte(), 3);
        root.getLeftChild().add(new BKnoop<>());
        assertEquals(root.diepte(), 3);

        BKnoop<String> child = new BKnoop<>();
        root.getRightChild().add(child);
        assertEquals(root.diepte(), 3);

        child.add(new BKnoop<>());
        child.add(new BKnoop<>());
        assertEquals(root.diepte(), 4);
    }

    @Test
    public void testGet() throws Exception {

    }

    @Test
    public void testGetParent() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {

    }

    @Test
    public void testIsChild() throws Exception {

    }

    @Test
    public void testIsAncestor() throws Exception {

    }

    @Test
    public void testRemove() throws Exception {

    }
}