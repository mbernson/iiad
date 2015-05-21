package nl.hsleiden.iiad.les1.searching;

import nl.hsleiden.iiad.les1.SearchAlgorithm;

public class LinearSearch<T> implements SearchAlgorithm<T> {

    @Override
    public T search(T[] items, T target) {
        for(T item : items) {
            if(item.equals(target))
                return item;
        }
        return null;
    }

}
