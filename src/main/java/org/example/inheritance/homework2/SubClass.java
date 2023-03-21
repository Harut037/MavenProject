package org.example.inheritance.homework2;

public class SubClass extends SuperClass {
    String message = "Hello SubClass class";


    public static void main(String[] args) {
        SubClass sc = new SubClass();

//        2. Create a class SuperClass which includes the field String message  =  “Hello SuperClass class ”.
//        Create a class SubClass which inherits from SuperClass and  has String message = “Hello SubClass class”.
//        Print both messages using only one object.
        sc.print();
    }

    /**
     * Method print parent class instance variable string, and its instance variable string.
     */
    public void print(){
        System.out.println(super.message);
        System.out.println(message);
    }

}
