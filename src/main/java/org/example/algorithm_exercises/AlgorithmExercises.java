package org.example.algorithm_exercises;

import java.util.Random;
import java.util.Scanner;

public class AlgorithmExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlgorithmExercises ae = new AlgorithmExercises();


//         1. Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number
//        System.out.println("Enter number and capacity:  ");
//        ae.multiplicationTable(sc.nextInt(), sc.nextInt());

        /*        2. Two numbers are entered through the keyboard. Write a program to find the
         *        value of one number raised to the power of another. (Do not use Java built-in method)
         */
//        ae.degree();

//        3. Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed. For example, if the input is 12345, the output
//        should be 54321.
//        System.out.print("Enter number = ");
//      ae.reverse(sc.nextInt());


        /*        4. Write a program that prompts the user to input a positive integer. It should then
         *      output a message indicating whether the number is a prime number.
         */
//        System.out.print("Enter number ");
//        ae.isPrime(sc.nextInt());

/*        5. Write a do-while loop that asks the user to enter two numbers. The numbers
        should be added and the sum displayed. The loop should ask the user whether
        he or she wishes to perform the operation again. If so, the loop should repeat;
        otherwise it should terminate.
*/
//        System.out.println("Enter x and y ");
//        ae.sum(sc.nextInt(), sc.nextInt());

//        6. Write a program to enter the numbers till the user wants and at the end it
//        should display the count of positive, negative and zeros entered.
        System.out.println("Enter numbers: ");
      ae.positiveNegativeZero(sc.nextInt());


//        7. Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered
//       System.out.print("Enter seize:  ");
//        ae.smallestAndBiggestNumber(sc.nextInt());


//        8. Write a program to print out all Armstrong numbers between 1 and 500. If sum
//        of cubes of each digit of the number is equal to the number itself, then the
//        number is called an Armstrong number.
//       ae.armstrongNumber();


//        9. Write a program to calculate the sum of following series where n is input by user.
//        1 + 1/2 + 1/3 + 1/4 + 1/5 +............1/n
//        System.out.print("Enter n = ");
//        ae.harmonic(sc.nextInt());

//        10. Compute the natural logarithm of 2, by adding up to n terms in the series
//        System.out.print("Enter n = ");
//        ae.harmonic1(sc.nextInt());

//        11. Write a program that generates a random number and asks the user to guess
//        what the number is. If the user's guess is higher than the random number, the
//        program should display "Too high, try again." If the user's guess is lower than
//        the random number, the program should display "Too low, try again." The
//        program should use a loop that repeats until the user correctly guesses the
//        random number.
//        System.out.print("Enter number ");
//        ae.guessTheNumber(sc.nextInt());


//        12. Write a program to print following :
//        ae.print();

//        13. Write a program to compute sin for given x. The user should supply x and a
//        positive integer n. We compute the sine of x using the series and the
//        computation should use all terms in the series up through the term involving xn
//        sin x = x - x3/3! + x5/5! - x7/7! + x9/9! .......

//        System.out.print("Enter number and power: = ");
//        System.out.println(ae.mySin(sc.nextInt(), sc.nextInt()));

//        14. Write a program to compute the cosine of x. The user should supply x and a
//        positive integer n. We compute the cosine of x using the series and the
//        computation should use all terms in the series up through the term involving xn
//        cos x = 1 - x2/2! + x4/4! - x6/6!

//        System.out.println("Enter number and power: = ");
//        System.out.println(ae.myCos(sc.nextInt(), sc.nextInt()));


  }


    public void multiplicationTable(int num, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

    public void degree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = sc.nextInt();
        System.out.print("Enter power = ");
        int power = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println("Result = " + result);
    }


    public void reverse(int n) {
        System.out.println("\nNumber = "+ n);
        int r;
        System.out.println();
        System.out.print("Reverse number = " );
        while (n > 0){
            r = n % 10;
            System.out.print(r);
            n /= 10;
        }
    }

    boolean b = false;

    public void isPrime(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("is prime number");
        } else {
            System.out.println("Is not prime");
        }
    }

    int k, i = 1;
    int sum = 0;

    public void sum(int x, int y) {
        do {
            sum = x + y;
            if (k == 0) {
                System.out.println("sum = " + sum);
            }
            System.out.println("If you want continue enter number 1");
            if (k > 0) {
                for (int j = 0; j < 1; j++) {
                    sum += i * sum;
                    i++;
                    System.out.println("sum = " + sum);
                }
            }
            Scanner sc = new Scanner(System.in);
            k = sc.nextInt();
        } while (k == 1);
    }

    int counterZero, counterNegative, counterPositive;

    public void  positiveNegativeZero(int number) {
        Scanner sc = new Scanner(System.in);
        while (number != 987654321) {
            System.out.print(number + ":                       ");
            if (number > 0) {
                counterPositive++;
            } else if (number == 0) {
                counterZero++;
            } else counterNegative++;
            number = sc.nextInt();
        }
        System.out.println("\nNegative numbers = " + counterNegative);
        System.out.println("\nZero  = " + counterZero);
        System.out.println("\nPositive numbers = " + counterPositive);
        }



        Random rand = new Random();
    public void smallestAndBiggestNumber(int size){
        int smallest = 100;
        int biggest = 0;
        int random;

        for (int i = 0; i < size; i++) {
            random = rand.nextInt(100);
            System.out.print(random + "  ");
            if (random < smallest){
                smallest = random;
            }
            if (random > biggest){
                biggest = random;
            }
        }
        System.out.println("\n\nSmallest = "+ smallest);
        System.out.println("\nBiggest = " + biggest);
    }

    public void armstrongNumber() {
        int r = 0, sum = 0;
        for (int i = 1; i <= 500; i++) {
            r = i % 10;
            sum += r * r * r;
            r = i / 10 % 10;
            sum += r * r * r;
            r = i / 100;
            sum += r * r * r;
            if (sum == i) {
                System.out.println(sum + " is armstrong number ");
            }
            sum = 0;
        }
    }





    public void harmonic(int n) {
        float result = 0;

        if (n > 0) {
            for (int j = 1; j <= n; j++) {
                result += (1 / (float) j);
            }
            System.out.println("Result = " + result);
        } else System.out.println("Please enter positive number: ");
    }

    public void harmonic1(int n) {
        float result = 0;

        if (n > 0) {
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 1) {
                    result += (1 / (float) j);
                } else result += (-1 / (float) j);
            }
            System.out.println("Result = " + result);
        } else System.out.println("Please enter positive number: ");
    }


    public void guessTheNumber(int search) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        Random rand = new Random();
        int number = rand.nextInt(100);
        while (search != number) {
            if (search > number) {
                System.out.println("Too high, try again.");
                counter++;
                System.out.println("Enter number again ");
                search = sc.nextInt();
            }
            if (search < number) {
                System.out.println("Too low, try again.");
                counter++;
                System.out.println("Enter number again ");
                search = sc.nextInt();
            }
        }
        System.out.println(" Congrats! You you guessed it, number is = " + number);
        System.out.println("Your experience = " + counter);
    }


    public void print() {
        for (int j = 0; j < 4; j++) {
            for (int l = 0; l < 10; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n-----------------------------------------");
        for (int j = 0; j <= 5; j++) {
            for (int l = 0; l < j; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n----------------------------------------");
        for (int j = 1; j <= 5; j++) {
            for (int l = j; l < 5; l++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n-------------------------------------");
        int ll = 0;
        for (int i = 1; i <= 9; i += 2) {
            ll++;
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(ll + " ");

            }
            System.out.println();
        }

        System.out.println("\n-----------------------");
        for (int i = 1; i <= 5; i++) {
            int n = 5;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }







    public double mySin(double number, int n){
        double radian = number * Math.PI/180;
        double sin =0;
        for (int i = 0; i<=n ; i++){
            sin += Math.pow(-1,i) * Math.pow(radian ,(i*2+1))/factorialOf(i*2+1);
        }
        return sin;
    }

    public double myCos(double number, int n){
        double radian = number * Math.PI/180;
        double sin =0;
        for (int i = 0; i<=n ; i++){
            sin += Math.pow(-1,i) * Math.pow(radian ,(i*2))/factorialOf(i*2);
        }
        return sin;
    }

    public long factorialOf(int number) {
        int result = 1;
        if (number < 0 && number % 2 != 0) {
            for (int i = 2; i <= -number; i++) {
                result *= i;
            }
            return -result;
        }
        if (number < 0) {
            for (int i = 2; i <= -number; i++) {
                result *= i;
            }
            return -result;
        }
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}




