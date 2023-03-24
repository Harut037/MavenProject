package org.example.linked_list;

import org.example.array_list.MyArrayList;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        MyLinkedList ml = new MyLinkedList();
        ml.addFirst(1);
        ml.addLast(2);
        ml.addLast(3);
        ml.replace(0,9);
        ml.iterate();

    }
}
