package org.example.abstract_class_and_interface.homework_7;

public class A extends Marks{

    /**
     * This method count student`s percentage.
     * @return percentage.
     */
    @Override
    double getPercentage() {
        double total = subject1 + subject2 + subject3;
        return total/3;
    }

   private int subject1;
   private int subject2;
   private int subject3;

    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        if (subject1 <= 100 && subject1 > -1){
            this.subject1 = subject1;
        }
        else this.subject1 = 0;

    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        if (subject2 <= 100 && subject2 > -1){
            this.subject2 = subject2;
        }
        else this.subject2 = 0;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        if (subject3 <= 100 && subject3 > -1){
            this.subject3 = subject3;
        }
        else this.subject3 = 0;
    }

    public A(int subject1, int subject2, int subject3) {
        setSubject1(subject1);
        setSubject2(subject2);
        setSubject3(subject3);
    }
}
