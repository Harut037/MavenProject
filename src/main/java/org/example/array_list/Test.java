package org.example.array_list;

import org.example.linked_list.MyLinkedList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
       MyArrayList list = new MyArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }


    }
}
