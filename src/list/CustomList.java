package list;

import java.lang.reflect.Array;
import java.util.*;

public class CustomList<T> implements List<T> {
    private T[] array;
    private int length;

    public CustomList() {
        T[] arr = (T[])new Object[8];
        length = 0;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i< array.length;i++){
            if (((T)o).equals((T)o)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return Arrays.stream(array).iterator();
    }

    @Override
    public Object[] toArray() {
        Object[] newArr = Arrays.copyOf(array, length);
        return newArr;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        if (a.length < array.length) {
            return (T1[]) Arrays.copyOf(array, array.length, a.getClass());
        }
        System.arraycopy(array, 0, a, 0, array.length);
        if (a.length > array.length)
            a[array.length] = null;
        return a;
    }

    @Override
    public boolean add(T t) {
        if (length == array.length-1) {
            T[] newArray = (T[]) new Object[array.length * 2];
            for (int i = 0; i < length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[length] = t;
        length++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < length; i++){
            if (array[i].equals((T)o)){
                for (int j = i; j<length-1; j++){
                    array[j] = array[j+1];
                }

                return true;
            }
        }

        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
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
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
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
