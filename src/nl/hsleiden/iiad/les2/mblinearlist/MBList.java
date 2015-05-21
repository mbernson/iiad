package nl.hsleiden.iiad.les2.mblinearlist;

import java.util.Iterator;

public interface MBList<E> {
    boolean add(E element);

    int size();

    boolean isEmpty();

    boolean contains(E object);

    Iterator<E> iterator();

    Object[] toArray();

    boolean remove(Object object);

    void clear();

    E get(int n);

    E set(int index, E element);

    void add(int index, E element);

    E remove(int index);

    int indexOf(E object);
}
