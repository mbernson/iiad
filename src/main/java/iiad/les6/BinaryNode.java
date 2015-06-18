package iiad.les6;

// Klasse voor een knoop voor een binaire boom
public class BinaryNode<E> {
    private BinaryNode<E> parent, leftChild, rightChild;

    private E userObject;

    public static final int LEFT = 0, RIGHT = 1;

    // Constructors
    public BinaryNode() {
        this( null );
    }

    public BinaryNode(E userObject) {
        parent = null;
        leftChild = null;
        rightChild = null;
        this.userObject = userObject;
    }

    // Methoden
    public void add( BinaryNode<E> newChild ) {
        if( leftChild == null )
            insert( newChild, LEFT );
        else
        if( rightChild == null )
            insert( newChild, RIGHT );
        else
            throw new IllegalArgumentException(
                    "Meer dan 2 kinderen" );
    }

    public E get() {
        return userObject;
    }

    public BinaryNode<E> getLeftChild() {
        return leftChild;
    }

    public BinaryNode<E> getRightChild() {
        return rightChild;
    }

    public BinaryNode<E> getParent() {
        return parent;
    }

    public void insert( BinaryNode<E> newChild, int childIndex ) {
        if( isAncestor( newChild ) )
            throw new IllegalArgumentException(
                    "Nieuw kind is voorouder" );
        if( childIndex != LEFT &&
                childIndex != RIGHT )
            throw new IllegalArgumentException(
                    "Index moet 0 of 1 zijn" );

        if( newChild != null ) {
            BinaryNode<E> oldParent = newChild.getParent();
            if( oldParent != null )
                oldParent.remove( newChild );
        }

        newChild.parent = this;
        if( childIndex == LEFT )
            leftChild = newChild;
        else
            rightChild = newChild;
    }

    public boolean isChild( BinaryNode<E> aNode ) {
        return aNode == null?
                false :
                aNode.getParent() == this;
    }

    public boolean isAncestor( BinaryNode<E> aNode ) {
        BinaryNode<E> ancestor = this;
        while( ancestor != null && ancestor != aNode )
            ancestor = ancestor.getParent();
        return ancestor != null;
    }

    public void remove( BinaryNode<E> aChild ) {
        if( aChild == null )
            throw new IllegalArgumentException(
                    "Argument is null" );

        if( !isChild( aChild ) )
            throw new IllegalArgumentException(
                    "Argument is geen kind" );

        if( aChild == leftChild ) {
            leftChild.parent = null;
            leftChild = null;
        } else {
            rightChild.parent = null;
            rightChild = null;
        }
    }

    public String toString() {
        return userObject.toString();
    }

    public int nodeCount() {
        int total = 1;

        if(null != leftChild)
            total += leftChild.nodeCount();

        if(null != rightChild)
            total += rightChild.nodeCount();

        return total;
    }

    public int leafCount() {
        if(null == leftChild && null == rightChild) {
            return 1;
        }
        int count = 0;

        if(null != leftChild)
            count += leftChild.leafCount();

        if(null != rightChild)
            count += rightChild.leafCount();

        return count;
    }

    public int depth() {
        int depth = 1,
            rDepth = 0,
            lDepth = 0;

        if(null != leftChild)
            lDepth = leftChild.depth();

        if(null != rightChild)
            rDepth = rightChild.depth();

        depth += lDepth > rDepth ? lDepth : rDepth;

        return depth;
    }
}

