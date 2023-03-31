package Seminar4.gb.list;

import java.util.Iterator;

public class GBLinkedIterator<T> implements Iterator<T> {
    private GBNode<T> element;


    public GBLinkedIterator(GBNode<T> element) {
        this.element = element;
    }

    @Override
    public boolean hasNext() {
        return element != null;
    }

    @Override
    public T next() {
        T out = element.item;
        element = element.next;
        return out;
    }
}
