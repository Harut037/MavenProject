package org.example.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaArraysTest {

    JavaArrays ja = new JavaArrays();

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void printPositiveElements() {

        int size = ja.printPositiveElements(0).length;
        Assert.assertEquals(0,size);
        System.out.println("\n\nMeaningless have array which length is zero");


    }

    @org.junit.jupiter.api.Test
    void reverse() {
        int size = ja.reverse(0).length;
        Assert.assertEquals(0,size);
        System.out.println("\n\nMeaningless have array which length is zero");
    }

    @org.junit.jupiter.api.Test
    void theBiggestNumberOfArray() {
        long max = ja.theBiggestNumberOfArray(5);
        if (max <= 0){
            assertEquals(0,ja.theBiggestNumberOfArray(5));
            System.out.println("\n\nArrays elements are not positive");
        }
    }

    @org.junit.jupiter.api.Test
    void theSmallestNumberOfArray() {
        float min = ja.theSmallestNumberOfArray(5);
        if (min >= 0) {
            assertEquals(0, ja.theSmallestNumberOfArray(5));
            System.out.println("\n\nArrays elements are not negative");
        }
    }
    @org.junit.jupiter.api.Test
    void transfer() {
        assertEquals(0,ja.transfer(0));
        System.out.println("\n\nMeaningless have array which length is zero. ");
    }

    @org.junit.jupiter.api.Test
    void sumOfArrays() {
        assertEquals(0,ja.sumOfArrays(0));
        System.out.println("\n\nMeaningless have array which length is zero. ");
    }

    @org.junit.jupiter.api.Test
    void howManyTimes() {
    }

    @org.junit.jupiter.api.Test
    void inDescendingOrder() {
    }

    @org.junit.jupiter.api.Test
    void myArray() {
    }

    @org.junit.jupiter.api.Test
    void removeZero() {

        assertEquals(false,ja.removeZero(10));
        System.out.println("\n\nThere is not zero element in array");
    }

    @org.junit.jupiter.api.Test
    void longestNonDecreasingSequence() {
    }

    @org.junit.jupiter.api.Test
    void binaryToDecimal() {
    }

    @org.junit.jupiter.api.Test
    void mainDiagonal() {
    }

    @org.junit.jupiter.api.Test
    void reverseMainDiagonal() {
    }

    @org.junit.jupiter.api.Test
    void sumOfLinesOfMatrix() {
    }

    @Test
    void treeElementsArray() {
    }
}