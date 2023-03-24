package org.example.linked_list;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

public class MyLinkedList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable  {

    private Node head;
    private Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public E get(int index) {

        Node temp = head;
        int counter = 0;
        while (temp != null){
            if (counter == index){
                return (E) temp.data;
            }
            counter++;
            temp = temp.next;
        }
        throw  new ArrayIndexOutOfBoundsException();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Object data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            tail = temp;
        } else
            head.prev = temp;

        temp.next = head;
        head = temp;
    }


    public void addLast(Object data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            head = temp;
        } else
            tail.next = temp;

        temp.prev = tail;
        tail = temp;
    }




    public void setter( int index, Object data) {
        Node cur = head;
        int counter = 0;


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

    public void removeFirst(){
        Node temp = head;

        if (head.next == null){
            tail = null;
        } else {
            head.next.prev = null;
        }
        head = head.next;
    }

    public void removeLast(){
        if (head.next == null){
            head = null;
        }else{
            tail.prev.next = null;
        }
        tail = tail.prev;

    }

    public void iterate() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public void reverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

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


    public void replace(int index,Object element){
        Node temp = head;
        int counter = 0;

        while (temp != null){
            if (index == counter){
                temp.data = element;
                return;
            }
            temp = temp.next;
            counter++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int size(){
        Node temp = head;
        int counter = 0;

        while (temp != null){
            counter++;
            temp = temp.next;
        }
        return counter;
    }
    public void clear(){
        head = null;
        tail = null;
    }

}
