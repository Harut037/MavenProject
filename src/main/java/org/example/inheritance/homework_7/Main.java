package org.example.inheritance.homework_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public String toString(List list) {
        return list.toString();
    }

    public static void main(String[] args) {
        Address adress = new Address("Armenia","Kievyan","404");
        Address adress1 = new Address("Armenia","Kievyan","403");
        List list = new ArrayList<>();
        list.add(adress1);
        list.add(adress);


        User user = new User("Harut",list);
        System.out.println(Arrays.toString(list.toArray()));

    }
}
