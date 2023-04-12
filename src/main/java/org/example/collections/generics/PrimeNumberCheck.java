package org.example.collections.generics;


import java.util.ArrayList;

public class PrimeNumberCheck extends CheckNumber{
    public <T> int checkPrimesNumber(ArrayList<Integer> arrayList) {

        int counter = 0;
        int temp = 0;
        boolean isPrime = false;
        while (temp != arrayList.size()) {
            isPrime = true;
            if (arrayList.get(temp) % 2 == 0){
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(arrayList.get(temp)); i++) {
                    if (arrayList.get(temp) % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                counter++;
            }
            temp++;
        }
        return counter;
    }
}


