package iiad.les2.stack;

public class StackImpl<E> implements Stack<E> {
    private Entry head;
    private int size = 0;

    @Override
    public E pop() {
        if (null == head) {
            return null;
        }
        Entry temp = head;
        head = temp.getPrevious();
        size--;
        return temp.getElement();
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    @Override
    public void push(E element) {
        size++;
        Entry entry = new Entry(element, head);
        head = entry;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private final class Entry {
        private Entry previous;
        private E element;

        public Entry(E element, Entry previous) {
            this.element = element;
            this.previous = previous;
        }

        public Entry getPrevious() {
            return previous;
        }

        public void setPrevious(Entry previous) {
            this.previous = previous;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }
    }
}
