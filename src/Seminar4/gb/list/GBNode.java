package Seminar4.gb.list;

public class GBNode<T> {
    T item;
    GBNode<T> next;
    GBNode<T> prev;

    public GBNode(GBNode<T> prev, T element, GBNode<T> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }

    public GBNode(T element) {
        this(null, element, null);
    }

    @Override
    public String toString() {
        return String.format("%s", item);
    }
}
