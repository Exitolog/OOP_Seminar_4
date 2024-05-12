package list;

import java.util.Iterator;

public class MyLinkedList <E>{
    private Value<E> first;
    private Value<E> last;
    private int size;
    private int capacity;

    private class Value<E>{
        Value<E> prev;
        E item;
        Value<E> next;

        public Value(Value<E> prev, E item, Value<E> next) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    };

    public MyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
        this.capacity = 10;
//        this.values = (E[]) new Comparable[capacity];
    }

    public void addFirst(E e){
        Value<E> first = this.first;
        Value<E> newValue = new Value<>(null, e, first);
        this.first = newValue;
        if(first == null){
            last = newValue;
        }
        else {
            first.prev = newValue;
        }
        size++;
        capacity++;
    }
    public void addLast(E e){
        Value<E> last = this.last;
        Value<E> newValue = new Value<>(last, e, null);
        this.last = newValue;
        if(last == null){
            first = newValue;
        }
        else {
            last.next = newValue;
        }
        size++;
        capacity++;
    }


    public void add(E element) {
        addLast(element);
    }

    public E get(int index) {
        if(index>=0 && index < size) {
            Value<E> x = first;
            for (int i = 0; i < index ; i++) {
            x = x.next;
            }
            return x.item;
        }
         return null;
    }



    public int size() {
        return size;
    }



}
