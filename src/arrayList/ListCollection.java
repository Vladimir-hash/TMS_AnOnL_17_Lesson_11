package arrayList;

public interface ListCollection<E> {
    void add(E e);

    void remove(int index);

    void remove(E e);

    E elementByIndex(int index);

    boolean contains(E e);

    void clear();

    void printElements();
}
