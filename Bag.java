package com.graph;

import java.util.Arrays;
import java.util.Iterator;

public class Bag<T> implements Iterable<T>{

    private int size;
    T[] arr;
    Bag() {
        size = -1;
        arr = (T[]) new Object[100];
    }

    void add(T t) {
        arr[++size] = t;
    }

    public boolean isEmpty() {
        return size == -1;
    }
    public int size() {
        return size + 1;
    }

    public class BagIterator implements Iterator<T>{

        private int i = 0;
        @Override
        public boolean hasNext() {
            return i <= size ;
        }

        @Override
        public T next() {
            return arr[i++];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new BagIterator();
    }

    public static void main(String[] args) {
        Bag<Integer> bag = new Bag<>();
        bag.add(2);
        bag.add(5);
        for(Integer i : bag) {
            System.out.println(i);
        }
        System.out.println(args[0]);
    }
}
