package org.example.exceptions;

public class StringChange {


    /**
     * This method your entered string was doing uppercase, reversed and counted vowels in that string.
     * @param text
     */
    public void stringChanges(String text) {

        try {
            text = text.toUpperCase();
            System.out.println("Uppercase: " + text);
            String reverseText = new StringBuilder(text).reverse().toString();
            System.out.println("Reverse: " + reverseText);
            char ch;
            int vowelCounter = 0;
            for (int i = 0; i < reverseText.length(); i++) {
                ch = reverseText.toLowerCase().charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCounter++;
                }
            }
            System.out.println("Number of vowels: " + vowelCounter);
        } catch (NullPointerException e) {
            System.out.println("Error: Input string is null");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid input");
        }
    }
}