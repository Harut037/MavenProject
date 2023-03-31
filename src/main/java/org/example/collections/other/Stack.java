package org.example.collections.other;

import java.util.ArrayList;

public class Stack<E> {

    public static void main(String[] args) {
        Stack stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    private ArrayList<E> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    /**
     * Method push elements in the stack.
     * @param item
     */
    public void push(E item) {
        stack.add(item);
    }

    /**
     * Method pop elements from the stack․
     * @return
     */
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    /**
     * Method checks is stack empty?
     * @return
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

