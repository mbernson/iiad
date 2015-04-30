package nl.hsleiden.iiad;

public interface SearchAlgorithm<T> {
    public T search(T[] items, T target);
}
