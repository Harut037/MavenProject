package org.example.arrayList;

import java.util.*;

public class MyArrayList<E> implements List<E> {

//    public static void main(String[] args) {
//        MyArrayList ma = new MyArrayList();
//        ma.add("a");
//        ma.add("b");
//        ma.add("c");
//        ma.remove("a");
//
//
//    }

    private int initialCapacity = 10;
    private int size;
    private int index;
    private E[] array = (E[]) new Object[initialCapacity];

    /**
     * If array size bigger than capacity, this method creating new array whose size equals size + capacity.
     */
    public void createNewArray() {
        int newCapacity = initialCapacity + 16;
        E[] arr = (E[]) new Object[newCapacity];
        System.arraycopy(array,0,arr,0,initialCapacity);
        array = arr;
        initialCapacity = newCapacity;
    }

    /**
     * Method return array`s size.
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Method check array is empty or not.
     * @return
     */
    @Override
    public boolean isEmpty() {
        if (array[0] == null){
            return true;
        }
        return false;
    }


    /**
     * Method check is array contains that element.
     * @param o element whose presence in this list is to be tested
     * @return
     */
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (o.equals(array[i])){
                return true;
            }
        }
        return false;
    }

    /**
     * Method doing reverse array elements.
     * @return
     */
    public E[] reverse(){
        E[] arr = (E[])new Object[array.length];
        int index = 0;
        for (int i = size - 1; i >= 0; i--) {
            arr[index] = array[i];
            index++;
        }
        for (int i = 0; i < size; i++) {
            array[i] = arr[i];
        }
        return array;
    }

    /**
     * Method updating with index.
     * @param index
     * @param o
     * @return
     */
    public E[] update( int index ,Object o){
        if (index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        array[index] = (E) o;
        return array;
    }


    /**
     * Method copy other list elements.
     * @param list
     * @return
     */
    public E[] copy(List list){
        Object o;
    for (int i = 0; i < list.size(); i++) {
        o = list.get(i);
        array[i] = (E) o;
        size++;
    }
    return array;
}

    /**
     * Method doing swap two elements in an array list.
     * @param index_1
     * @param index_2
     * @return
     */
    public E[] swap(int index_1, int index_2){
        if (index_1 >= size || index_2 >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        Object tmp = array[index_1];
        array[index_1] = array[index_2];
        array[index_2] = (E) tmp;
        return array;
}

    /**
     * Method adding an element into the array list at the first position.
     * @param o
     * @return
     */
    public E[] insert(Object o){
        size++;
        for (int i = size - 1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = (E) o;
        return array;
    }

    /**
     * Method searching by using index.
     * @param index
     * @return
     */
    public E search(int index){
        if (index >= size){
            throw  new ArrayIndexOutOfBoundsException();
        }
        System.out.println(array[index]);
        return  array[index];
    }

    /**
     * Method searching by using object.
     * @param o
     */
    public void search(Object o){
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])){
                System.out.println("\n " + i);
                return;
            }
        }
        System.out.println("\nThe list not contains this element.");
    }
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    /**
     * Method adds an element to the array.
     * @param e element whose presence in this collection is to be ensured
     * @return
     */
    @Override
    public boolean add(E e) {
        if (index >= array.length) {
            createNewArray();
        }
        array[index++] = e;
        size++;
        return true;
    }

    /**
     * Method
     * @param o element to be removed from this list, if present
     * @return
     */
    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])){
                 {
                     for (int j = i; j < size-1; j++) {
                         array[j] = array[j+1];
                     }
                }
                size--;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
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
        size = 0;

    }

    @Override
    public E get(int index) {
        if (index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) array[index];
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        if (index >= size){
            throw  new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < size; i++) {
            array[i] = array[i+1];
        }
        size--;
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
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
