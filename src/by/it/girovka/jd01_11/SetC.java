package by.it.girovka.jd01_11;

import java.util.*;

class SetC<T> implements List<T> {
    private T[] elements = (T[])new Object[]{};
    private int size=0;
    HashSet<String> words = new HashSet<>(100);
    long callTime = System.nanoTime();
    Scanner scan = null;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        String delimiter = "";
        for (int i = 0; i < size; i++) {
            sb.append(delimiter).append(elements[i]);
            delimiter = ", ";
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean isEmpty() {
        
        return (size)==0;
    }

    @Override
    public boolean contains(Object t){
        return t.equals(elements);
    }
    

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if (size==elements.length)
            elements= Arrays.copyOf(elements,((size*3)/2+1));
        elements[size++]=t;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index >-1) remove(index);
        return (index>-1);
    }

    @Override
    public boolean containsAll(Collection<?> t)
    
    {
        return t.isEmpty();
    }

    @Override
    public boolean addAll(Collection<? extends T> t) {
        boolean modified = false;
        for (T element : t)
            if (add(element)) modified = true;

        return modified;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> t)
    {
     return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public T set(int index, T element) {
        rangeCheck(index);
        T oldValue = element(index);
        elements[index]= element;
        return oldValue;
    }

    private T element(int index) {
        return (T) elements[index];
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException();
    }

    @Override
    public void add(int index, T element) {
        if (size==elements.length)
            elements= Arrays.copyOf(elements,((size*3)/2+1));
        System.arraycopy(elements,index,elements,index+1,size-index);
        elements[index] = element;
        size++;
    }

    @Override
    public T remove(int index) {
        T del = elements[index];
        System.arraycopy(elements,index+1,elements,index,size-1-index);
        size--;
        return del;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
