package nl.hsleiden.iiad.les2.mblinearlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MBLinkedList<E> {

    private Entry<E> head; // , tail;

    public MBLinkedList() {
        head = null;
    }

    public boolean add(E element) {
        if(null == head)
            return addFirst(element);
        else
            return appendNext(element, head);
    }

    private boolean addFirst(E element) {
        head = new Entry<>(element);
        return true;
    }

    private boolean appendNext(E element, Entry entry) {
        if(entry.hasNext())
            appendNext(element, entry.getNext());
        else
            entry.next = new Entry<>(element);
        return true;
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return null == head;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator<E> iterator() {
        return new LinkedListIterator<>();
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {
        head = null;
    }

    public E get(int n) {
        Entry<E> temp = null, pos = head;
        for(int i = 0; i < n; i++) {
            temp = pos;
            pos = temp.getNext();
        }
        return pos.getElement();
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    protected class Entry<E> {
        private E element;
        private Entry next;

        public Entry(E element) {
            this.element = element;
            next = null;
        }

        private Entry(E element, Entry next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Entry getNext() {
            return next;
        }

        public boolean hasNext() {
            return null != next;
        }
    }

    private class LinkedListIterator<E> implements Iterator {

        private Entry position = head;

        @Override
        public boolean hasNext() {
            return (position != null);
        }

        @Override
        public E next() {
            Entry temp = position;
            position = temp.getNext();
            return (E) temp.getElement();
        }
    }

}
