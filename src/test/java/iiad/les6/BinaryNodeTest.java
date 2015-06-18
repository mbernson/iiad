package iiad.les6;

import iiad.les6.tree.BinaryNode;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinaryNodeTest extends TestCase {
    private BinaryNode<String> root;

    @Before
    public void setUp() throws Exception {
        root = new BinaryNode<>("wortel");
        root.add(new BinaryNode<>("kind 1"));
        root.add(new BinaryNode<>("kind 2"));
    }

    @After
    public void tearDown() throws Exception {
        root = null;
    }

    @Test
    public void testAddingChildren() throws Exception {
        root = new BinaryNode<>("wortel");
        BinaryNode<String> left = new BinaryNode<>("kind 1");
        root.add(left);

        assertEquals(root.getLeftChild(), left);

        BinaryNode<String> right = new BinaryNode<>("kind 2");
        root.add(right);
        assertEquals(root.getRightChild(), right);
    }

    @Test
    public void testAantalKnopenInEnkeleKnoop() {
        BinaryNode<String> knoop = new BinaryNode<>();
        assertEquals(knoop.nodeCount(), 1);
    }

    @Test
    public void testAantalKnopenInBoom() {
        assertEquals(root.nodeCount(), 3);
        root.getLeftChild().add(new BinaryNode<>());
        root.getLeftChild().add(new BinaryNode<>());
        assertEquals(root.nodeCount(), 5);
        root.getRightChild().add(new BinaryNode<>());
        assertEquals(root.nodeCount(), 6);
    }

    @Test
    public void testAantalBladenInEnkeleKnoop() {
        BinaryNode<String> knoop = new BinaryNode<>();
        assertEquals(knoop.leafCount(), 1);
    }

    @Test
    public void testAantalBladenInBoom() {
        assertEquals(root.leafCount(), 2);

        root.getLeftChild().add(new BinaryNode<>());
        assertEquals(root.leafCount(), 2);
        root.getLeftChild().add(new BinaryNode<>());
        assertEquals(root.leafCount(), 3);

    }

    @Test
    public void testDiepteVanEnkeleKnoop() {
        BinaryNode<String> knoop = new BinaryNode<>();
        assertEquals(knoop.depth(), 1);
    }

    @Test
    public void testDiepteVanBoom() {
        assertEquals(root.depth(), 2);

        root.getLeftChild().add(new BinaryNode<>());
        assertEquals(root.depth(), 3);
        root.getLeftChild().add(new BinaryNode<>());
        assertEquals(root.depth(), 3);

        BinaryNode<String> child = new BinaryNode<>();
        root.getRightChild().add(child);
        assertEquals(root.depth(), 3);

        child.add(new BinaryNode<>());
        child.add(new BinaryNode<>());
        assertEquals(root.depth(), 4);
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