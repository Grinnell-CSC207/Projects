package edu.grinnell.CSC207.F2013.project_files;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List<T> implements java.util.List<T> {

    java.util.List<T> proxy;

    public List() {
        proxy = new ArrayList<T>();
    }

    @Override
    public void add(int location, T object) {
        proxy.add(location, object);
    }

    @Override
    public boolean add(T object) {
        return proxy.add(object);
    }

    @Override
    public boolean addAll(int location, Collection collection) {
        return proxy.addAll(location, collection);
    }

    @Override
    public boolean addAll(Collection collection) {
        return proxy.addAll(collection);
    }

    @Override
    public void clear() {
        proxy.clear();
    }

    @Override
    public boolean contains(Object object) {
        return proxy.contains(object);
    }

    @Override
    public boolean containsAll(Collection collection) {
        return proxy.containsAll(collection);
    }

    @Override
    public T get(int location) {
        return proxy.get(location);
    }

    @Override
    public int indexOf(Object object) {
        return proxy.indexOf(object);
    }

    @Override
    public boolean isEmpty() {
        return proxy.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return proxy.iterator();
    }

    @Override
    public int lastIndexOf(Object object) {
        return proxy.lastIndexOf(object);
    }

    @Override
    public ListIterator listIterator() {
        return proxy.listIterator();
    }

    @Override
    public ListIterator listIterator(int location) {
        return proxy.listIterator(location);
    }

    @Override
    public T remove(int location) {
        return proxy.remove(location);
    }

    @Override
    public boolean remove(Object object) {
        return proxy.remove(object);
    }

    @Override
    public boolean removeAll(Collection collection) {
        return proxy.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection collection) {
        return proxy.retainAll(collection);
    }

    @Override
    public T set(int location, T object) {
        return proxy.set(location, object);
    }

    @Override
    public int size() {
        return proxy.size();
    }

    @Override
    public java.util.List subList(int start, int end) {
        return proxy.subList(start, end);
    }

    @Override
    public Object[] toArray() {
        return proxy.toArray();
    }

    @Override
    public Object[] toArray(Object[] array) {
        return proxy.toArray(array);
    }
}
