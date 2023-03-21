package org.example.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaArrays {
    public static void main(String[] args) {
        JavaArrays ja = new JavaArrays();
        Scanner sc = new Scanner(System.in);


//        1. Գրել method, որը տպում է int[] n  array-ի դրական տարրերը.
//        System.out.print("Enter size = ");
//        ja.print(sc.nextInt());

//        2. Գրել method, որը տպում է short[] s  array-ի էլեմենտները հակառակ
//        հերթականությամբ
//        ja.reverse(sc.nextInt());

//        3. Գրել method, որը գտնում եւ  տպում է  long[] l array-ի ամենամեծ տարրը.
//        ja.biggestNumberOfArray(sc.nextInt());

//        4. Գրել method, որը գտնում եւ տպում է  float[] f  array-ի ամենափոքր տարրը.
//        ja.theSmallestNumberOfArray(sc.nextInt());

//        5  .Գրել method, որը int[] n array-ի էլեմենտները եւ տեղափոխում  int[] m  array-ի մեջ։
//        ja.transfer(sc.nextInt());

//        6. Գրել method, որը ստեղծում է երկու նույն չափը ունեցող array-ներ գումարում է array
//                -ի համապատասխան էլեմենտները եւ գրում երրորդ array-ի մեջ։
//        ja.sumOfArrays(sc.nextInt());

//        7. Գրել method, որը հաշվում է թե քանի անգամ է  k թիվը հանդիպել array-ի
//        Էլեմենտների մեջ։
//        System.out.println("\nEnter number:  ");
//        ja.howManyTimes(sc.nextInt(), sc.nextInt());


//        8.Գրել method, որը  տպում է բոլոր չկրկնվող եռյակները array -ի։ Եռյակներում թվերի
//        դասավորությունը եական չէ.
//          ja.treeElementsArray(sc.nextInt());

//         9.Դասավորել տրված թվերի հաջորդականության անդամները նվազման կարգով:
//        ja.inDescendingOrder(sc.nextInt());

//        10  Դասավորել տրված ամբողջ թվերի հաջորդականության անդամներն անյպես, որ .
//                վերջում լինեն կենտերը:
//       ja.myArray(10);

//        11  Տրված իրական թվերի հաջորդականությունից հեռացնել բոլոր զրոները։
//        ja.removeZero(sc.nextInt());

//        12  Տպել տրված թվերի հաջորդականության ամենաերկար աճող ենթահաջորդականությունը:
//     ja.longestNonDecreasingSequence(new int[]{1,6,9,11,0,-3,6,11,98,-3});

//        13  Ներածել n բնական թիվը 2-ական տեսքով՝ ստանալով 0-ներից ու 1-երից կազմված .
//                զանգված եւ արտածել n  թվի 10-ական ներկայացումը:
//   ja.binaryToDecimal(sc.nextInt());

//        14  Տպել տրված մատրիցի գլխավորա անկյունագծից վերեւ բոլոր տարերը:
//      ja.mainDiagonal(sc.nextInt());

//        15  Շրջել տրված ամբողջ թվերի քառակուսային մատրիցը գլխավոր անկյունագծի նկատմամբ
//       ja.reverseMainDiagonal(sc.nextInt());


//        16  Տրված բնական թվերի քառակուսային մատրիցի համար արտածել YES, եթե նրա .
//                բոլոր տողերի տարրերի գումարը զույգ է։  NO հակառակ դեպքում
//        ja.sumOfLinesOfMatrix(sc.nextInt());

    }

    Random rand = new Random();


    /**
     * This method print array positive elements.
     * @param size
     */
    public  int[] printPositiveElements(int size) {
        int[] array = new int[size];
        System.out.print("\nArray:  ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(30);
            System.out.print(array[i] + " ");
        }
        System.out.print("\n\nOdder numbers of array:  ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + "  ");
            }
        }
        return array;
    }

    /**
     * This method reversed the elements of array.
     * @param size
     */
    public int[] reverse(int size) {
        int[] array = new int[size];
        System.out.print("\nArray:  ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(30);
            System.out.print(array[i] + " ");
        }
        System.out.print("\n\nReverse array:  ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    /**
     * This method find and print the biggest element of array.
     * @param size
     * @return
     */
    public long theBiggestNumberOfArray(int size) {
        long[] array = new long[size];
        long max = array[0];
        System.out.print("\nArray:  ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(500);
            if (array[i] > max || array[i] == max) {
                max = array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\nMax = " + max);
        return max;
    }

    /**
     * This method find and print the smallest element of array.
     * @param size
     * @return
     */
    public float theSmallestNumberOfArray(int size) {
        float[] array = new float[size];
        float min = 1000000;
        System.out.print("\nArray:  ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextFloat(100);
            if (array[i] < min || array[i] == min) {
                min = array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\nMin = " + min);
        return min;
    }

    /**
     * This method clone the first array elements in the second array.
     * @param size
     */
    public int transfer(int size) {
        int[] n = new int[size];
        int[] m = new int[size];
        System.out.print("\nArray:  ");
        for (int i = 0; i < n.length; i++) {
            n[i] = rand.nextInt(30);
            System.out.print(n[i] + " ");
            m[i] = n[i];
        }
        System.out.print("\n\nTransfer array:  ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(m[i] + " ");
        }
        return size;
    }

    /**
     * This method sum two arrays elements and write that elements int the third array.
     * @param size
     */
    public int sumOfArrays(int size) {
        int[] n = new int[size];
        int[] m = new int[size];
        int[] sum = new int[size];

        System.out.print("\narray1:  ");
        for (int i = 0; i < n.length; i++) {
            n[i] = rand.nextInt(30);
            m[i] = rand.nextInt(40);
            System.out.print(n[i] + " ");
        }
        System.out.print("\n\narray2:  ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(m[i] + " ");
        }


        System.out.print("\n\nSum of arrays:  ");
        for (int i = 0; i < size; i++) {
            sum[i] = n[i] + m[i];
            System.out.print(sum[i] + "  ");
        }
        return size;
    }

    /**
     * This method count how many times that element meet int the given array.
     * @param size
     * @param k
     * @return
     */
    public int howManyTimes(int size, int k) {
        int counter = 0;
        int[] array = new int[size];
        System.out.print("\nArray:  ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(30);
            if (array[i] == k) {
                counter++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\nCounter = " + counter);
        return counter;
    }

    /**
     * This method terms of the given array of numbers in descending order
     * @param size
     * @return
     */
    public int[] inDescendingOrder(int size) {
        int[] array = new int[size];

        System.out.print("\nArray:  ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\n");
        int tmp;
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] > array[i]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    b = true;
                }
            }
        }
        System.out.print("Sorted array:  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }


    /**
     * This method terms of the given array of integers such that .
     * be the odd ones at the end.
     * @param size
     */
    public void myArray(int size) {

        int k = 0;
        if (size <= 10) {
            int[] array = new int[size];
            System.out.print("\nArray:  ");
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(30);
                System.out.print(array[i] + "  ");
            }
            int tmp, counter = 0;

            boolean b = true;
            while (b && counter < 100) {
                b = false;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] % 2 != 0) {
                        tmp = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = tmp;
                        b = true;
                        counter++;
                    }
                }
            }
            System.out.print("\n\nResult:  ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "  ");
            }
        } else System.out.println("Error, ասեցինք չէ 11 ից փոքր ))");
    }

    /**
     * This method remove all zeros from the given array of real numbers.
     * @param size
     */
    public boolean removeZero(int size) {
        int[] array = new int[size];
        boolean check = false;
        int counter = 0;
        System.out.print("\nArray:  ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            if (array[i] == 0) {
                counter++;
                check = true;
            }
            System.out.print(array[i] + "  ");
        }

        System.out.print("\n\nResult:  ");
        int[] result = new int[array.length - counter];
        for (int i = 0, j = 0; i < array.length && j < array.length - counter; i++) {
            if (array[i] != 0) {
                result[j] = array[i];
                j++;
            }
        }

        for (int i = 0; i < array.length - counter; i++) {
            System.out.print(result[i] + "  ");
        }
        return check;
    }

    /**
     * This method finds the longest sequence in non-decreasing order of array.
     * @param array int[] array.
     * @return new array the of the longest sequence in non-decreasing order of array.
     */
    public int[] longestNonDecreasingSequence(int[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements:");
            return array;
        }
        int sb = 0;
        int longestSb = 0;
        int startIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                sb++;
            } else {
                sb = 0;
            }
            if (sb == 1 && longestSb <= sb) {
                startIndex = i;
            }
            if (longestSb <= sb) {
                longestSb = sb;
            }
        }
        int[] newArray = new int[longestSb + 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[startIndex];
            startIndex++;
        }
        System.out.println();
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "  ");
        }
        return newArray;
    }


    /**
     * This method represents a binary number in decimal form.
     * @param size
     */
    public void binaryToDecimal(int size) {
        System.out.println("You must enter 0 or 1, otherwise it is error");
        Scanner sc = new Scanner(System.in);
        int decimal = 0;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            if (array[i] == 0 || array[i] == 1) {
            } else {
                System.out.println("Error");
                return;
            }
        }
        System.out.print("\nBinary:  ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\n\nDecimal: ");
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 1) {
                decimal += Math.pow(2, array.length - 1 - i);
            }
        }

        System.out.println(decimal);
    }

    /**
     * This method print with respect to the main diagonal of the matrix.
     * @param size
     */
    public void mainDiagonal(int size) {
        int[][] matrix = new int[size][size];
        System.out.println("\n\nMatrix:  ");
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(50);
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i <= j) {
                    System.out.print(matrix[i][j] + "  ");
                }
            }
        }

    }

    /**
     * This method inverted the square matrix of the given integers on the main diagonal towards.
     * @param size
     */
    public void reverseMainDiagonal(int size) {
        int a;
        int[][] matrix = new int[size][size];
        System.out.println("\n\nMatrix:  ");
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(50);
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i > j) {
                    for (int k = 0; k < size; k++) {
                        a = matrix[j][i];
                        matrix[j][i] = matrix[i][j];
                        matrix[i][j] = a;
                    }
                }
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        int[] aaaa = new int[]{-0};
        System.out.println(aaaa[0]);
    }

    /**
     * This method checks whether the sum of the elements of the given matrix is even or odd
     * @param size
     */
    public void sumOfLinesOfMatrix(int size) {
        int sum = 0;
        int[] array = new int[size];
        int[][] matrix = new int[size][size];
        System.out.println("\nMatrix:  ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(47);
                array[i] += matrix[i][j];
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
            } else {
                System.out.println("\nNo");
                return;
            }
        }
        System.out.println("\nYes");
    }

    /**
     * This method prints all non-repeating triplets.
     * @param size
     */
    public void treeElementsArray(int size) {
        int[] n = new int[size];
        for (int i = 0; i < size; i++) {
            n[i] = rand.nextInt(100);
            System.out.print(n[i] + " ");
        }
        System.out.println("\n");
        int counter = 0;
        int[]sub;
        String intArray;
        for (int k : n) {
            for (int j = 0; j < n.length - 1; j++) {
                if (k != n[j] && k != n[j + 1]) {
                    counter++;
                    sub = new int[]{k, n[j], n[j + 1]};
                    intArray = Arrays.toString(sub);
                    System.out.println(intArray);
                }
            }
        }
    }
}

