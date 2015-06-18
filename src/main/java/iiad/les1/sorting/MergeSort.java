package iiad.les1.sorting;

import java.lang.reflect.Array;

<<<<<<< HEAD
public class MergeSort<T extends Comparable<T>> implements Sortable<T> {
=======
public class MergeSort<T> implements Sortable<T> {
>>>>>>> 09fdba4947e653537b9ac850d638e151bba3a0d8

    @Override
    public T[] sort(T[] list) {
        if(list.length <= 1)
            return list;

        T[] result = null;

        if(list.length % 2 == 0) {
//            T[] left =  newArray(list.length / 2),
//                right = new T[list.length / 2];
        } else {

        }

        return result;
    }

    public T[] newArray(Class<T> klass, int length) {
        @SuppressWarnings("unchecked")
        final T[] array = (T[]) Array.newInstance(klass, length);
        return array;
    }

    private T[] a, b, result;
    private void mergeSort(T[] a, T[] b, T[] c) {

    }

}
