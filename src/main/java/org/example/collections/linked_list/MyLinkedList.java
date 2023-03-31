package org.example.collections.linked_list;

import org.example.collections.array_list.MyArrayList;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

public class MyLinkedList<E> extends AbstractList<E> implements List<E> {

    E data;
    private Node head;
    private Node tail;
    private int counter = 0;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    /**
     * Method gets element by index.
     * @param index index of the element to return
     * @return
     */
    @Override
    public E get(int index) {
        Node temp = head;
         counter = 0;
        if (index < size() && index >= 0) {
            while (temp != null) {
                if (counter == index) {
                    return (E) temp.data;
                }
                counter++;
                temp = temp.next;
            }
        }
        else
        throw new IndexOutOfBoundsException();
        return (E)temp.data;
    }
    /**
     * Method check is list empty or not.
     * @return
     */
    public boolean isEmpty() {
        return head == null;
    }


    /**
     * Method adds an element from the beginning․
     * @param data
     */
    public void addFirst(E data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            tail = temp;
        } else
            head.prev = temp;

        temp.next = head;
        head = temp;
    }

    /**
     * Method adds an element from the end․
     * @param data
     */
    public void addLast(E data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            head = temp;
        } else
            tail.next = temp;

        temp.prev = tail;
        tail = temp;
    }


    /**
     * Method sets an element at index․
     * @param index
     * @param data
     */

    public void setter( int index, E data) {
        Node cur = head;
        counter = 0;

        while (cur != null && counter != index) {
            cur = cur.next;
            counter++;
        }

        Node temp = new Node(data);

        cur.prev.next = temp;
        temp.prev = cur.prev;
        cur.prev = temp;
        temp.next = cur;
    }

    /**
     * Methode removing the first element in list.
     */
    public void removeFirst() {
        if (size() == 0) {
            throw new NullPointerException();
        } else {
            if (head.next == null) {
                tail = null;
            } else {
                head.next.prev = null;
            }
            head = head.next;

        }
    }
    /**
     * Methode removing the last element in list.
     */
    public void removeLast(){
        if (size() == 0) {
            throw new NullPointerException();
        } else {
            if (head.next == null) {
                head = null;
            } else {
                tail.prev.next = null;
            }
            tail = tail.prev;
            counter--;
        }
    }

    /**
     * Method printing all list elements in order․
     */
    public void iterate() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    /**
     * Method all list elements in reverse order.
     */
    public void reverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    /**
     * Method checking is list contains that element or not.
     * @param element element whose presence in this list is to be tested
     * @return boolean.
     */
    public boolean contains(Object element){
        Node temp = head;
        while (temp != null){
            if (temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    /**
     * Method replacing our node value with index.
     * @param index
     * @param element
     */
    public void replace(int index,E element){
        Node temp = head;
         counter = 0;
        while (temp != null){
            if (index == counter){
                temp.data = element;
                return;
            }
            temp = temp.next;
            counter++;
        }
        throw new IndexOutOfBoundsException();
    }


    /**
     * Method return list size.
     * @return
     */
    public int size(){
        Node temp = head;
        counter = 0;
        while (temp != null){
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    /**
     * Method clean list.
     */
    public void clear(){
        head = null;
        tail = null;
    }


    public void cloneLinkedList(MyLinkedList list) {
        list.clear();
        Node temp = head;
        while(temp != null) {
            list.addLast(temp.data);
            temp = temp.next;
        }
    }

    public void cloneLinkedList(MyArrayList list) {
        list.clear();
        Node temp = head;
        while(temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
    }

}
