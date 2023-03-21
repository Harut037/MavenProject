package org.example.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {
    Methods methods = new Methods();

    @Test
    void main() {
    }

    @Test
    void twoInputParams() {

        assertEquals(0,methods.twoInputParams(10,11));
        System.out.println("This method always return 0");
    }

    @Test
    void hasNotInputParams() {
    }

    @Test
    void helloWorld() {
    }

    @Test
    void thisInputParam() {
        assertEquals('"',methods.thisInputParam('"'));
        System.out.println("Please do not it empty");
    }

    @Test
    void returnOneOfThem() {
    }

    @Test
    void recursion() {
    }
}