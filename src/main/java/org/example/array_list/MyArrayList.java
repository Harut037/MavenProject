package org.example.array_list;

import java.util.*;

public class MyArrayList<E> extends AbstractList<E> implements List<E> , RandomAccess, Cloneable {

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
     * Method print all array`s elements.
     * @return
     */
    public boolean iterateAllElements() {

        for(int i = 0; i< size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        return true;
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

    public E[] set(int index, Object o){
        if (index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    array[index] = (E) o;
                }
                return array;
            }
        }
        return array;
    }

    /**
     * Method pops the first found element with the element we gave.
     * @param o
     * @param element
     * @return
     */
    public E[] replace(Object o, Object element){
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)){
                array[i] = (E) element;
                return array;
            }
        }
        System.out.print("\nList does not contains that element");
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
    public void clear() {
        initialCapacity = 10;
        array = (E[]) new Object[initialCapacity];
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
    public void add(int index, E element) {
        for (int i = size - 1; i >= index ; i--) {

        }
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








}
