package org.example.string_and_stringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    StringUtil su = new StringUtil();

    @Test
    void main() {
    }

    @Test
    void concatenation() {
        assertEquals(null,su.concatenation(null,null));
    }

    @Test
    void testConcatenation() {
    }

    @Test
    void testConcatenation1() {
    }

    @Test
    void testConcatenation2() {
    }

    @Test
    void concatenationStringBuilder() {
        String a = "a";
        String b = "b";
        int x = 1;
        int y = 2;

    }

    @Test
    void testConcatenationStringBuilder() {
    }

    @Test
    void testConcatenationStringBuilder1() {
    }

    @Test
    void testConcatenationStringBuilder2() {
    }

    @Test
    void result() {
    }

    @Test
    void reverse() {
        String text = "Java basic";
        assertEquals(text.length(),su.reverse(text).length());
    }

    @Test
    void countOfToken() {
    }

    @Test
    void capitalLetters() {
    }

    @Test
    void capitalLetters1() {
    }

    @Test
    void concatAsterisk() {
    }

    @Test
    void removeString() {
    }

    @Test
    void removeStringBuilder() {
    }

    @Test
    void replaceString() {

    }

    @Test
    void replaceStringBuilder() {
    }

    @Test
    void theLongestWorld() {
        assertEquals(8,su.theLongestWorld("I am learning java now").length());
        System.out.println("Method works nicely");
    }

    @Test
    void whichIndex() {
    }

    @Test
    void printSubLine() {
    }

    @Test
    void testPrintSubLine() {

    }

    @Test
    void checkString(){
        assertEquals(true,su.checkString(null));
        assertEquals(true,su.checkString(""));
        System.out.println("Checking passed successfully");

    }

    @Test
    void theLongestWorldSecondMethod() {
        assertEquals(9,su.theLongestWorldSecondMethod("I, am, learning, java, now").length());
        System.out.println("Code works fine");
    }

    @Test
    void appendStar() {
        assertEquals(20,su.appendStar("MyString").length());
        System.out.println("The code nice, thank you");
    }
}