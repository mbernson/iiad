package nl.hsleiden.iiad.les1.sorting;

import nl.hsleiden.iiad.les1.SortingAlgorithm;

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
