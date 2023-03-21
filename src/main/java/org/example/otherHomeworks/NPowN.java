package org.example.otherHomeworks;

import java.util.Scanner;

public class NPowN {
    Scanner sc = new Scanner(System.in);

    int n =sc.nextInt();
    public static void main(String[] args) {
    NPowN nPowN = new NPowN();
    nPowN.nPowNTimesRepeat(nPowN.n);

    }

    int m = n;
    int count = 0;
    int i = 0;

    /**
     * This includes n power n cycle.
     * @param n
     * @return
     */
    public int nPowNTimesRepeat(int n) {
        i++;
        while (i < n) {
            m *= n;
            while (i <= m) {
                count++;
                System.out.println("Ես դուրս չեմ մնացել։");
                nPowNTimesRepeat(n);
            }
        }
        return count;
    }
}
