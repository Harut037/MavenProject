package org.example.statements;

import java.util.Scanner;

public class Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Statements st = new Statements();
        System.out.print("Enter input parameter(s) ");

        // Java Statements

        // 1. Գրել method, որը ստուգում է տրված x ամբողջ թիվը զույգ է թե կենտ.
        //st.evenOrUneven(sc.nextInt());


        // 2. Գրել method, որը ստուգում է տրված x ամբողջ թիվը դրական է թե բացասական.
        // st.positiveOrNegative(sc.nextInt());

        /* 3. Գրել method, որը ստուգում է տրված x ամբողջ թիվը ՝ կամ փոքր 8 ից և մեծ 5 ից
         *  Կամ փոքր 20 ից և մեծ 15 ից.
         */
        // st.check(sc.nextInt());

        /* 4.Գրել method, որը ստուգում է տրվածղ ամբողջ թիվը կարող է բաժանվել 5-ի և 7-ի վրա
         *  առանց մնացորդի.
         */
        //   st.isDividerIt(sc.nextInt());

        //  5․ Գրել method, որը ստուգում է տրված եռանիշ թվի երկրորդ թվանշանը 7 է թե ոչ։
        // st.isSecondNumberSeven(sc.nextInt());

        /* 6, Գրել method, որը ստուգում է (x,y) կորդինատներով կետը գտնվում է արդյոք K(0,5)
         * շրջանի մեջ թե ոչ։
         */
        //st.circle(sc.nextInt(), sc.nextInt());

        // 7. Գրել method, որը գտնում է տրված 3 թվերից մեծագույնը։
        //st.maximumNumber(sc.nextInt(), sc.nextInt(), sc.nextInt());

        /* 8․ Գրե՛ք method, որը ստուգում է տրված տարին համարվում է արդյոք նահանջ։ (նահանջ
         *    է համարվում այն տարին որը բաժանվում է 4 և 400 բայց միևնույն ժամանակ չի
         *     բաժանվում 100-ի)
         */
        //st.isLeapYear(sc.nextInt());

        // 9. Ինչ ավելացնենք ___ բաց թողնված դիրքում որ տպի 8 ․
        // st.whatToDo();

        // 10. Գտնել սխալը և ուղղել․
        //  st.correctTheMistake();

        // 11.Գրել method, որը console -ում տպում է 1 ից 200 թվերը․
        // st.printNumbers();

        // 12.Գրել method, որը console -ում տպում է տրված թվի առաջին թվանշանը
//        st.firstDigit(sc.nextLong());

        /* 13. Տրված են int x5 = 1, int y5 = 0. Քանի դեռ x < 5 ից և y < 10 տպել x5+y5
         *   արտահայտությունը․
         */
        //st.until();

        // 14. Գրել method, որը console -ում տպում է քառակուսի, օգտագործեք * սիմվոլը։
        //st.printSquare(sc.nextInt());

        /* 15․ Գրել method, որը console -ից ստանում է N թիվը և հաշվում է [1-N] բոլոր 5 -ի բաժանվող
         *    թվերի գումարը։
         */
        //st.sum(sc.nextInt());

        // 16. Գրել method, որը հաշվում է [1-N] բոլոր երկնիշ զույգ թվերի արտադրյալը։
         st.multiple(sc.nextInt());

        /* 17․ Գրել method, որը [1-N] հաջորդական թվերի մեջ գտնում է մեծագույն և փոքրագույն
              տարրերը և հաշվում նրանց թվաբանական միջինը։
         */
        //st.sumOfTheBiggestAndTheSmallest(sc.nextDouble());

        /* 18․ Գրել method, որը ստանում է 5 - անիշ ամբողջ թիվ և հաշվում այդ թվի թվանշանների
       գումարը։
        */
        // st.sumOfDigits(sc.nextInt());

    }


    /**
     * Write a method that checks whether the given integer x is even or odd.
     *
     * @param x
     */
    public String evenOrUneven(int x) {
        String check;
        if (x % 2 == 0) {
            check = "x is even number";
            System.out.println(check);
        } else {
            check = "x is uneven number";
            System.out.println(check);
        }
        return check;
    }

    /**
     * Write a method that checks whether the given integer x is positive or negative.
     *
     * @param x
     */
    public void positiveOrNegative(int x) {
        System.out.println(x > 0 ? "x is positive number" : x < 0 ? "x is negative number" : "x is zero");
    }

    /**
     * Write a method that checks if a given integer x is either less than 8 or greater than 5
     * Or smaller than 20 and larger than 15
     *
     * @param x
     */
    public void check(int x) {
        if ((x < 8 && x > 5) || (x < 20 && x > 15)) {
            System.out.println("Yes");
        } else System.out.println("No");
    }

    /**
     * Write a method that checks whether a given integer is divisible by 5 and 7
     *
     * @param x
     */
    public boolean isDividerIt(int x) {
        boolean b;
        if (x % 5 == 0 && x % 7 == 0) {
            b = true;
            System.out.println("Yes it is divisible by five and seven");
        } else {
            b = false;
            System.out.println("No it is not divisible by five and seven");
        }
        return b;
    }

    /**
     * Write a method that checks whether the second digit of a given three-digit number is 7 or not.
     *
     * @param x
     */
    public void isSecondNumberSeven(int x) {
        if (x / 10 % 10 == 7) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    /**
     * Write a method that checks if the point with coordinates (x,y) is located in K(0,5)
     * in the district or not?
     */
    public void circle(int x, int y) {
        int r = 5;
        if (((x - 0) * (x - 0) + (y - 0) * (y - 0)) <= r * r) {
            System.out.println("Կետը գտնվում է");
        } else {
            System.out.println("Չի գտնվում");
        }
    }

    /**
     * Write a method that finds the largest of the given 3 numbers.
     *
     * @param x
     * @param y
     * @param z
     */
    public int maximumNumber(int x, int y, int z) {
        int max = 0;
        if (x > y & ((y > z) || y == z)) {
            System.out.println("Max number is " + x);
            max = x;
        }
        if (y > x & ((x > z) || x == z)) {
            System.out.println("Max number is " + y);
            max = y;
        }
        if (z > x & ((x > y) || x == z)) {
            System.out.println("Max number is " + z);
            max = z;
        }
        if (x == y & y == z) {
            System.out.println("There is not maximum value");
        }
        return max;
    }


    /**
     * Write a method that checks whether the given year is considered a leap year. (a year that is divisible by 4 and 400 but
     * not at the same time is considered a leap year divisible by 100)
     *
     * @param year
     */
    public boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if ((year % 4 == 0 & year % 400 == 0) | (year % 4 == 0 & year % 100 != 0)) {
            System.out.println("Yes it is leap year");
            isLeapYear = true;
        } else System.out.println("No it is not leap year");
        return isLeapYear;
    }

    public void whatToDo() {
        int x = 0;
        while (x++ < 10) {
            x++;
        }
        System.out.println(x);
    }

    public void correctTheMistake() {
        int x = 2;
        int y = 5;
        while (x < 10) {
            y++;
            x++; // Եթե չլինի այս պայմանը անվերջ ցիկլ կլինի
        }

        int k = 15;
        while (k > 10) {
            k = --k;
        }
        System.out.println(k);
    }

    /**
     * Write a method that prints the numbers 1 to 200 to the console.
     */
    public void printNumbers() {
        for (int i = 1; i <= 200; i++) {
            System.out.print(i + " ");
        }
    }

    /**
     * Write a method that prints the first digit of the given number in the console.
     *
     * @param x
     */
    public void firstDigit(long x) {
        while (x > 9) {
            x /= 10;
        }
        System.out.println("The first digit is " + x);
    }

    /**
     * Given int x = 1, int y = 0. As long as x < 5 and y < 10 print the expression x+y:
     */
    public void until() {
        int x = 1, y = 0;
        while (x++ < 5 && y++ < 10) {
            System.out.println(x + y);
        }
    }

    /**
     * To write a method that prints a square in the console, use the * symbol.
     *
     * @param n
     */
    public void printSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Write a method that receives the number N from the console and counts [1-N] all divisible by 5
     * the sum of the numbers.
     *
     * @param n
     */
    public int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
        return sum;
    }

    /**
     * Write a method that calculates the product of all two-digit even numbers [1-N].
     *
     * @param n
     */
    public double multiple(int n) {
        double multiple = 1;

            for (int i = 10; i <= n; i += 2) {
                multiple *= i;
            }
            System.out.println("multiple = " + multiple);
        return multiple;
    }

    /**
     * Write a method that finds the largest and smallest number in [1-N] sequences
     * elements and calculates their arithmetic mean.
     *
     * @param n
     */
    public double sumOfTheBiggestAndTheSmallest(double n) {
        double sum = (n + 1) / 2;
        System.out.println("Sum = " + sum);
        return sum;
    }

    /**
     * Write a method that receives a 5-digit integer and counts the digits of that number sum.
     *
     * @param n
     */
    public int sumOfDigits(int n) {
        int sumOfDigits = 0;

        if (n > 9999 && n < 100000) {
            sumOfDigits += n / 10000 + n / 1000 % 10 + n / 100 % 10 + n / 10 % 10 + n % 10;
            System.out.println("Sum of digits = " + sumOfDigits);
        } else System.out.println("Please enter valid number (five digit number)");
        return sumOfDigits;
    }
}