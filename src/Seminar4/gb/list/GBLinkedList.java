package Seminar4.gb.list;

import Seminar4.gb.GBList;

import java.util.Iterator;

public class GBLinkedList<T> implements GBList<T> {

    int size = 0;
    GBNode<T> first;
    GBNode<T> last;

    public GBLinkedList() {
        this.first = null;
        this.last = null;
    }

    @Override
    public void addFirst(T element) {
        GBNode<T> item = new GBNode<>(element);
        if (size == 0) last = item;
        else first.prev = item;
        item.next = first;
        first = item;
        size++;
    }

    @Override
    public void addLast(T element) {
        GBNode<T> item = new GBNode<>(element);
        if (size == 0) first = item;
        else last.next = item;
        item.prev = last;
        last = item;
        size++;
    }

    @Override
    public GBNode<T> remove(int index) {
        if ((index < 0) || (index >= size)) return null;
        GBNode<T> element = get(index);
        if ((index > 0) && (index < size - 1)) {
            GBNode<T> elementPrev = get(index - 1);
            GBNode<T> elementNext = get(index + 1);
            elementPrev.next = elementNext;
            elementNext.prev = elementPrev;
        }
        if (index == 0) {
            GBNode<T> elementNext = get(index + 1);
            elementNext.prev = null;
            first = elementNext;
        }
        if (index == size - 1) {
            GBNode<T> elementPrev = get(index - 1);
            elementPrev.next = null;
            last = elementPrev;
        }
        size--;
        return element;
    }

    @Override
    public GBNode<T> get(int index) {
        if (size == 0) return first;
        GBNode<T> element = first;
        for (int i = 0; (i < index) && (index <= size); i++) {
            element = element.next;
        }
        return element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new GBLinkedIterator<>(first);
    }
}
