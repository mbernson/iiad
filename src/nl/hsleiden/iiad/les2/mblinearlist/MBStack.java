package nl.hsleiden.iiad.les2.mblinearlist;

public interface MBStack<E> {
    public E pop();
    public E peek();
    public void push(E element);

    public int size();
    public boolean isEmpty();
}
