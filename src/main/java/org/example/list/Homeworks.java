package org.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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


        ArrayList<Integer> tmp = new ArrayList<>();
        tmp.add(-5);
        tmp.add(10);
        tmp.add(-34);
        tmp.add(-9);
        tmp.add(-11);
        tmp.add(101);
//        homeworks.removeNegativeNumbers(tmp);

        tmp.clear();
        tmp.add(4);
        tmp.add(2);
        tmp.add(2);
        tmp.add(5);
        tmp.add(2);
        tmp.add(3);
        tmp.add(2);
        tmp.add(3);
        tmp.add(1);
        tmp.add(5);
        tmp.add(2);
        homeworks.found(tmp);
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
     * @param list
     * @return
     */
    public ArrayList<Integer> removeNegativeNumbers(ArrayList<Integer> list){
        int counter = 0;
        System.out.print("\nList`s elements` [ ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println("]");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0){
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


    public void found(List tmp){
        int checkSize = tmp.size();
        int counter = 1;
        for (int i = 0; i < tmp.size(); i++) {
            for (int j = i + 1; j < tmp.size() ; j++) {
                if (tmp.get(i) == tmp.get(j)){
                    counter++;
                }
            }
            for (int j = i + 1; j < tmp.size(); j++) {
                if (counter % 2 == 1){
                    if (tmp.get(i) == tmp.get(j)){
                        counter++;
                    }
                }
            }


        }

        System.out.print("\nList`s  elements` [ ");
        for (int i = 0; i < tmp.size(); i++) {
            System.out.print(tmp.get(i) + " ");
        }
        System.out.println("]");

    }
}



