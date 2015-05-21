package nl.hsleiden.iiad.les2.mblinearlist;

import java.util.Iterator;

public class MBLinkedList<E> implements MBList<E> {

    private Entry<E> head; // , tail;

    public MBLinkedList() {
        head = null;
    }

    @Override
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

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return null == head;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator<>();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public E get(int n) {
        Entry<E> temp = null, pos = head;
        for(int i = 0; i < n; i++) {
            temp = pos;
            pos = temp.getNext();
        }
        return pos.getElement();
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
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
