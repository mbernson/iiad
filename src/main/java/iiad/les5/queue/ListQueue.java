package iiad.les5.queue;

import iiad.les2.linearlist.DoublyLinkedList;
import iiad.les2.linearlist.List;

/**
 * Created by mathijs on 16-6-2015.
 */
public class ListQueue<T> implements Queue<T> {
    private List<T> list;

    public ListQueue() {
        list = new DoublyLinkedList<>();
    }

    @Override
    public void enqueue(T element) {
        list.push(element);
    }

    @Override
    public T dequeue() {
        return list.pop();
    }

    @Override
    public T front() {
        return list.get(list.size() - 1);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
