package iiad.les2.linearlist;

import java.util.Iterator;

public interface List<E> {
    int size();

    boolean isEmpty();

    boolean contains(E object);

    /**
     * Get a standard iterator for this list.
     * @return java.util.Iterator
     */
    Iterator<E> iterator();

    Object[] toArray();

    boolean remove(E object);

    /**
     * Empty the list.
     */
    void clear();

    E get(int n);

    E set(int index, E element);

    /**
     * Remove an element from the list.
     * @param index
     * @return element
     */
    E remove(int index);

    int indexOf(E object);

    /**
     * Add an element to the end of the list.
     * @param element
     */
    void push(E element);
    void add(E element);

    /**
     * Pop the last element off the list and return it.
     * @return
     */
    E pop();

    /**
     * Shift an element off the beginning of the list and return it.
     */
    E shift();

    /**
     * Add an element to the beginning of the list.
     * @param element
     */
    void unshift(E element);
}
