package org.example.abstract_class_and_interface.homework_7;

public class B extends Marks {

    /**
     * This method count students`s percentage.
     * @return  percentage.
     */
    @Override
    double getPercentage() {
        double total = subject1 + subject2 + subject3 + subject4;
        return total / 4;
    }


    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;

    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        if (subject1 <= 100 && subject1 >= 0)
            this.subject1 = subject1;
        else this.subject1 = 0;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        if (subject2 <= 100 && subject2 > -1)
            this.subject2 = subject2;
        else this.subject2 = 0;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        if (subject3 <= 100 && subject3 > -1)
            this.subject3 = subject3;
        else {
            this.subject3 = 0;
        }

    }

    public int getSubject4() {
        return subject4;
    }

    public void setSubject4(int subject4) {
        if (subject4 <= 100 && subject3 > -1) {
            this.subject4 = subject4;
        }
        else this.subject4 = 0;
    }

    public B(int subject1, int subject2, int subject3, int subject4) {
        setSubject1(subject1);
        setSubject2(subject2);
        setSubject3(subject3);
        setSubject4(subject4);
    }
}
