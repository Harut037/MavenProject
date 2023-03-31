package org.example.collections.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Homeworks {


    ArrayList<Integer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        Homeworks homeworks = new Homeworks();


        /* 17. Write a program that reads from the console a  sequence of positive integer
               numbers. The sequence  ends when empty line is entered. Calculate and print  the
               sum and average of the elements of the  sequence. Keep the sequence in ArrayList<int>. */

//        homeworks.print();



//        18. Write a program that reads a sequence of integers  (ArrayList<int>) ending with an
//             empty line and sorts  them in an increasing order.

//        homeworks.sort();



//        19. Write a program that removes from given sequence  all negative numbers.

//        ArrayList<Integer> tmp = new ArrayList<>(List.of(-5, 10, -34, -9, -11, 101));
//        homeworks.removeNegativeNumbers(tmp);



//        20. Write a program that removes from given sequence  all numbers that occur odd
//            number of times.  Example: {4, 2, 2, 5, 2, 3, 2, 3, 1, 5, 2} -> {5, 3, 3, 5}

//        homeworks.sequence();



//      21. Write a generic class Stack<T> that can be used to represent stacks of objects of
//          type T. The class should include methods push(), pop(), and isEmpty(). Inside the
//          class, use an ArrayList to hold the items on the stack.

//        Stack stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

    }

    /**
     * Method print sum of list`s positive numbers and that average.
     */
    public void print() {
        System.out.println("Enter positive integers, (if you want end adding enter empty line)");
        while (true) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            int num = Integer.parseInt(line);
            if (num > 0)
                list.add(num);
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double average = (double) sum / list.size();
        System.out.println("\nSum = " + sum);
        System.out.println("\nAverage = " + average);
    }

    public ArrayList sort() {
        while (true) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            int num = Integer.parseInt(line);
            list.add(num);
        }
        int[] temp = new int[list.size()];

        System.out.print("\nUnsorted array` [ ");
        for (int i = 0; i < temp.length; i++) {
            temp[i] = list.get(i);
            System.out.print(temp[i] + " ");
        }
        System.out.println("]");

        Arrays.sort(temp);
        list.clear();

        System.out.print("\nSorted array` [ ");
        for (int i = 0; i < temp.length; i++) {
            list.add(temp[i]);
            System.out.print(temp[i] + "  ");
        }
        System.out.println("]");
        return list;
    }

    /**
     * Method removing negative elements from the list.
     *
     * @param list
     * @return
     */
    public ArrayList<Integer> removeNegativeNumbers(ArrayList<Integer> list) {
        int counter = 0;
        System.out.print("\nList`s elements` [ ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println("]");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);
                i--;
                continue;
            }
        }

        System.out.print("\nList`s no negative elements` [ ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("]");
        return list;
    }


    public void found(int[] sequence) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sequence.length; i++) {
            map.put(i, sequence[i]);
        }

    }


    public void sequence() {
        ArrayList<Integer> sequence = new ArrayList<>(List.of(4, 2, 2, 5, 2, 3, 2, 3, 1, 5, 2));
        ArrayList<Integer> finalSequence = new ArrayList<>();
        for (int i = 0; i < sequence.size(); i++) {
            if (Collections.frequency(sequence, sequence.get(i)) % 2 == 0) {
                finalSequence.add(sequence.get(i));
            }
        }
        System.out.println(finalSequence);
    }
}



