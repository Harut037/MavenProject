package org.example.collections.generics;

import org.example.abstract_class_and_interface.homework_7.A;

import java.util.ArrayList;
import java.util.Collections;

public class Palindromes extends PrimeNumberCheck{

    ArrayList<String[]> arrayList = new ArrayList<>(Collections.singleton(new String[]{"aba", "aca", "akk"}));
    public <T> int palindrome() {
        int counter = 0;
        String tmp;

        for (int i = arrayList.size() - 1; i >= 0; i--) {

            for (int j = arrayList.get(i).length - 1; j >= 0; j--) {
                tmp = "";
                for (int k = arrayList.get(i)[j].length() - 1; k >= 0 ; k--) {
                    tmp += arrayList.get(i)[j].charAt(k);
                }
                if (tmp.equals(arrayList.get(i)[j])) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
