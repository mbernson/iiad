package nl.hsleiden.iiad.searching;

import nl.hsleiden.iiad.SearchAlgorithm;

public class BinarySearch<T extends Comparable<T>> implements SearchAlgorithm<T> {

    @Override
    public T search(T[] items, T target) {
        final int min = 0, max = items.length;
        int i = (max - min) / 2;

//        while(true) {
//            if(i)
//        }

        return null;
    }

}
