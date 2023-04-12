package org.example.collections.generics;

import java.util.ArrayList;

public class CheckNumber{

    public <N> int checkNumber(ArrayList<Integer> arrayList) {
        int counter = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }
}
