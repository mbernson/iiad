package nl.hsleiden.iiad.sorting;

import nl.hsleiden.iiad.SortingAlgorithm;

import java.util.Collections;

public class QuickSort<T> implements SortingAlgorithm<T> {

    @Override
    public T[] sort(T[] list) {
        if(list.length == 0)
            return list;

        T x = list[0];

//        final T[] smallerSorted = sort((x, list)),
//                  biggerSorted =  sort((x, list));
        return list;

    }
}
