package iiad.les2.stack;

public interface Stack<E> {
    public E pop();
    public E peek();
    public void push(E element);

    public int size();
    public boolean isEmpty();
}
