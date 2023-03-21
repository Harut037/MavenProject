package org.example.string_and_stringbuilder2;

import java.util.ArrayList;
import java.util.Scanner;

public class StringUtil_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringUtil_2 su = new StringUtil_2();

        System.out.print("Enter text:  ");

//    1. Given a string, return a string made of the first 2 chars (if present), however
//    include first char only if it is 'o' and include the second only if it is 'z', so
//    "ozymandias" yields "oz".
//     System.out.print("\nThat chars: " + su.includeChar(sc.nextLine()));


//    2. Count the number of "xx" in the given string. We'll say that overlapping is
//    allowed, so "xxx" contains 2 "xx".
//        System.out.println("\nNumber of substring = " +su.countOfSubString(sc.nextLine(),sc.nextLine()));


//    3. A palindrome is a word which reads the same backward or forward. 'abcba' is
//    a palindrome. Write a method that detects if a string is a palindrome.
//        System.out.println("\nIs it palindrome world: " + su.isPalindrome(sc.nextLine()));


//    4. Given a list of strings, write a method that returns a list of all strings that
//    start with the letter 'a' (lower case) and have exactly 3 letters.
//        System.out.print("List of words:  " + su.listOfWords(sc.nextLine()).toString());


//    5. Write a method that returns a comma-separated string based on a given list
//    of integers. Each element should be preceded by the letter 'e' if the number
//    is even, and preceded by the letter 'o' if the number is odd. For example, if
//    the input list is (3,44), the output should be 'o3,e44'.
//           System.out.println("\nResult: " + su.add(sc.nextLine()).toString());


//    6. Шифр Цезаря — это базовая техника шифрования, которую Юлий
//    Цезарь использовал для безопасного общения со своими генералами.
//    Каждая буква заменяется другой буквой на N позиций вниз в
//    английском алфавите. Например, для поворота на 5 буква «с» будет
//    заменена на «h». В случае «z» алфавит вращается, и он превращается в
//    «d». Реализуйте декодер для шифра Цезаря, где N = 5.
//        System.out.print("Enter text and key:  ");
        System.out.println("\nResult:  " + su.algorithmCesar(sc.nextLine(), sc.nextInt()).toString());


//    7. A palindrome is a word which reads the same backward or forward. 'abcba' is
//    a palindrome. Write a method that returns the longest palindrome substring
//    of a given string.
//        System.out.println("The longest substring palindrome:  " + su.theLongestPalindrome(sc.nextLine()));


//    8. Given two strings, write a method that finds the longest common sub-sequence.
//       System.out.print("\nCommon the longest sub string:  " + su.theLongestCommonSubStrings(sc.nextLine(), sc.nextLine()));


//    9. Given two strings, find the number of common characters between them.
//        System.out.print("Number of common characters = " + su.commonCharacterCount(sc.nextLine(), sc.nextLine()));


//        10.Write a function that reverses characters in (possibly nested) parentheses in
//        the input string. Input strings will always be well-formed with matching ()s.
        

    }

    /**
     * Method  include first char only if it is 'o' and include the second only if it is 'z', so.
     * @param text return that chars.
     */
    public StringBuilder includeChar(String text) {
        StringBuilder sb = new StringBuilder();
        if (text.charAt(0) == 'o' && text.charAt(1) == 'z') {
            sb.append(text.charAt(0));
            sb.append(text.charAt(1));
        }
        return sb;
    }

    /**
     * Method counting substrings in given string.
     *
     * @param text
     * @param subString
     * @return countOfSubString
     */
    public int countOfSubString(String text, String subString) {
        String[] split = text.split("");
        String tmp;
        int counter = 0;
        for (int i = 0; i < split.length - 1; i++) {
            tmp = (split[i] + split[i + 1]);
            if (tmp.equals(subString)) {
                counter++;
            }
        }
        return counter;
    }


    /**
     * Method checked, string is palindrome or not.
     * @param text
     * @return boolean
     */
    public boolean isPalindrome(String text) {
        boolean isPalindrome = false;
        String tmp = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            tmp += text.charAt(i);
        }
        if (tmp.equals(text)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    /**
     * This method find words (which started with 'a'(lower case) and length that words equals 3).
     * @param text
     * @return list of words
     */

    public ArrayList listOfWords(String text) {
        StringBuilder sb = new StringBuilder(text);
        if (sb.charAt(sb.length() - 1) == '.' || sb.charAt(sb.length() - 1) == '?') {
            sb.deleteCharAt(sb.length() - 1);
        }
        String s = sb.toString();
        ArrayList<String> arrayList = new ArrayList<>();
        int start = 0;
        String substring = "";
        for (int i = 0; i < s.length(); i++) {
            substring = "";
            if (s.charAt(i) == ' ') {
                substring = s.substring(start, i);
                start = i + 1;
                if (substring.charAt(0) == 'a' && substring.length() == 3) {
                    arrayList.add(substring);
                }
            }
            boolean b = false;
            while (i >= s.length() - 3 && i != s.length()) {
                if (s.charAt(i) == 'a' || b) {
                    substring += s.charAt(i);
                    b = true;
                    i++;
                }
            }
        }
        arrayList.add(substring);
        return arrayList;
    }

    /**
     * This method check if number is odd each number preceded 'o', if number is even, each number preceded 'e'.
     * @param text
     * @return
     */
    public StringBuilder add(String text) {
        String tmp;
        StringBuilder substring = new StringBuilder(text);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ',') {
                tmp = text.substring(0, i);
                if (Integer.parseInt(tmp) % 2 == 0) {
                    substring.insert(0, 'e');
                    count = i + 2;
                    break;
                } else {
                    substring.insert(0, 'o');
                    count = i + 2;
                    break;
                }
            }
        }
        tmp = substring.substring(count, substring.length());
        if (Integer.parseInt(tmp) % 2 == 0) {
            substring.insert(count, 'e');
        } else {
            substring.insert(count, 'o');
        }
        return substring;
    }


    /**
     * This method find the longest substring palindrome.
     * @param text
     * @return the longest palindrome.
     */
    public StringBuilder theLongestPalindrome(String text) {
        String tmp;
        String tmp2;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            for ( int j = text.length() - 1; j > i; j--) {
                if (text.charAt(i) == text.charAt(j)){
                    tmp = text.substring(i, j+1);
                    StringBuilder sb = new StringBuilder(tmp);
                    tmp2 = sb.reverse().toString();
                    if (tmp.equals(tmp2) & (tmp.length() > result.length())){
                        result = new StringBuilder(tmp);
                    }
                }
            }
        }
        return result;
    }

    /**
     * This method find common characters between two strings.
     *
     * @param s1
     * @param s2
     * @return number of common characters.
     */
    public int commonCharacterCount(String s1, String s2) {
        int counter = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s2.contains(String.valueOf(s1.charAt(i)))) {
                counter++;
                s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
            }
        }
        return counter;
    }

    /**
     * This method transcribed with cesar algorithm.
     *
     * @param text
     * @param key
     * @return transcribed text
     */
    public StringBuilder algorithmCesar(String text, int key) {
        StringBuilder result = new StringBuilder();
        char[] symbol = new char[text.length()];
//        System.out.print("\nResult:  " );
        for (int i = 0; i < symbol.length; i++) {
            if (Character.isLetter(text.charAt(i)) && Character.isUpperCase(text.charAt(i))) {
                symbol[i] = (char) ((((int) ((text.charAt(i))) - 65 + key) % 26) + 65);
            } else if (Character.isLetter(text.charAt(i)) && Character.isLowerCase(text.charAt(i))) {
                symbol[i] = (char) ((((int) ((text.charAt(i))) - 97 + key) % 26) + 97);
            } else {
                symbol[i] = text.charAt(i);
            }
            result.append(symbol[i]);
        }
        return result;
    }

    /**
     * Method find the longest common substring.
     *
     * @param text1
     * @param text2
     * @return that substring
     */
    public String theLongestCommonSubStrings(String text1, String text2) {
        String[] split1 = text1.split(" ");
        String[] split2 = text2.split(" ");
        String tmp;
        String substring = "";
        for (int i = 0; i < split1.length; i++) {
            for (int j = 0; j < split2.length; j++) {
                if (split1[i].equals(split2[j])) {
                    tmp = split1[i];
                    if (tmp.length() > substring.length()) {
                        substring = tmp;
                    }
                }
            }
        }
        return substring;
    }
}
