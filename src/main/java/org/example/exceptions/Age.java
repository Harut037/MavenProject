package org.example.exceptions;

public class Age {

    private int age;


    public int getAge() {
        return age;
    }


    /**
     * This method setting valid age.
     * @param age
     */
    public void setAge(int age) {
        this.age = age;

        try {
            if (getAge() > 120 || getAge() < 0){
                throw new IllegalArgumentException();
            }
            System.out.println("\nYour age = " + getAge());
        } catch (IllegalArgumentException e){
            System.out.println("\nEnter valid age` range [0 ; 120] ");
        }
    }



}
