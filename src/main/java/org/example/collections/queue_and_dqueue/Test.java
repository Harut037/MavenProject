package org.example.collections.queue_and_dqueue;

import org.example.inheritance.aggregation.example_1.Person;

import java.util.*;

public class Test implements Comparator {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Test(int age) {
        this.age = age;
    }

    public Test() {
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Test test = new Test();
        Test tests = new Test(15);
        ForTest forTest = new ForTest(10);



//  1.	Implement a queue using LinkedList and add elements to it.

//        test.addElementQueue();


//  2.	Implement a deque using LinkedList and add elements to it.

//        test.addElementDeque();


//  3.	Create a priority queue of integers and add elements to it.

//        test.queueOfIntegers();


//  4.	Create a priority queue of strings and add elements to it.

//        test.queueOfStrings();


//  5. Create a deque using ArrayDeque and add elements to it.

//        test.dequeOfIntegers();


//  6. Create a priority queue of custom objects and add elements to it.

        System.out.println(test.compare(tests.age, forTest.getAge()));


//  7. Remove elements from a queue until it is empty.

//        test.queueOfIntegers();


//  8. Remove elements from a deque until it is empty.

//        test.dequeOfIntegers();


//  9. Check if an element is present in a queue.

//        System.out.print("\nEnter name` ");
//        test.checkQueue(scanner.nextLine());


//  10. Check if an element is present in a deque.

//        System.out.print("\nEnter name` ");
//        test.checkDeque(scanner.nextLine());


//  11.Using the Queue<T> class write a program to print  its first 50 members for
//     given N. N = 1,3,5,7,9,...

//        test.printAllNumbers();


//  12.Write a Java program to create a new priority queue, add some colors (string)
//     and print out the elements of the priority queue.

//        test.queueOfColors();


//  13.Write a Java program to add all the elements of a priority queue to another priority queue.

//        test.copyOfQueue();


//  14.Write a Java program to retrieve and remove the first element.

//        test.removeFirstElement();


    }


    /**
     * Method add element in queue
     */
    public void addElementQueue() {
        Queue queue = new LinkedList();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

    }

    /**
     * Method add element in deque
     */
    public void addElementDeque() {
        Deque deque = new LinkedList();

        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
    }


    /**
     * Method create queue, add elements and remove all elements, check queue contains element or not
     */
    public void queueOfIntegers() {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);


        while (!queue.isEmpty()) {
            queue.poll();
            System.out.println(queue);
        }

    }


    /**
     * Method create queue of Strings
     */
    public void queueOfStrings() {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        Scanner scanner = new Scanner(System.in);
        queue.add("Gurgen");
        queue.add("Babken");
        queue.add("Harut");

    }


    /**
     * Method create deque of Integers, remove elements from deque and check contains deque element or not
     */
    public void dequeOfIntegers() {
        Deque deque = new ArrayDeque();

        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);


        while (!deque.isEmpty()) {
            deque.poll();
        }
    }

    /**
     * Method check contains deque element or not.
     *
     * @param name
     */

    public void checkQueue(String name) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Gurgen");
        queue.add("Babken");
        queue.add("Harut");
        if (queue.contains(name)) {
            System.out.println("\n" + name + " is present in the Queue");
        } else {
            System.out.println("\n" + name + " is not present in the Queue");
        }
    }

    public void checkDeque(String name) {
        Deque<String> deque = new ArrayDeque();
        deque.add("Gurgen");
        deque.add("Babken");
        deque.add("Harut");
        if (deque.contains(name)) {
            System.out.println("\n" + name + " is present in the Queue");
        } else {
            System.out.println("\n" + name + " is not present in the Queue");
        }
    }

    /**
     * Method print all numbers from queue and removes elements
     */
    public void printAllNumbersQueue() {
        Queue<Integer> queue = new PriorityQueue<Integer>();

    }


    /**
     * Method prints the elements of the list one by one
     */
    public void queueOfColors() {
        PriorityQueue<String> colors = new PriorityQueue<>();

        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");

        while (!colors.isEmpty()) {
            System.out.println(colors.poll());
        }
    }

    /**
     * Method adds all the elements of a priority queue to another
     * priority queue.
     */
    public void copyOfQueue() {
        PriorityQueue queue = new PriorityQueue();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        PriorityQueue priorityQueue = new PriorityQueue(queue);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }

    /**
     * Method remove list`s the first element.
     */
    public void removeFirstElement() {
        PriorityQueue queue = new PriorityQueue<>();

        queue.add("apple");
        queue.add("banana");
        queue.add("orange");

        System.out.println("\nList: " + queue);
        queue.poll();
        System.out.println("\nList after remove first element: " + queue);
    }

    /**
     * Method print the first 50 members of the list.
     */
    public void printAllNumbers() {
        Queue<Integer> queue = new LinkedList<>();
        int counter = 0;
        for (int i = 1; i < 200; i += 2) {
            queue.add(i);
        }
        System.out.print("The first 50 members of the list:  [  ");
        while (counter < 50) {
            System.out.print(queue.poll() + "  ");
            counter++;
        }
        System.out.println("]");

    }


    /**
     * Method compared two object.
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        Test test = new Test(15);
        ForTest forTest = new ForTest(10);
        return Integer.compare(test.age, forTest.getAge());
    }
}

