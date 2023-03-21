package org.example.string_and_stringbuilder;


import java.util.Scanner;

public class StringUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringUtil su = new StringUtil();


//        1.Գրել method,  որը  կատարում է String concatenation  տվյալ պարամետրով.
//        Նույնը  խնդիրը  StringBuilder-ով
//        su.concatenation();
//        su.concatenationStringBuilder();

//        2.Գրել method,  որը  ստանում է String պարամետր եւ տպում է ամեն դատարկ  սիվոլից
//        նոր տողում օգտագործելով  String Literal ( \t, \b ....)
//        su.result("We are learning java now");

//        3. Գրել method (reverse), որը  շուռ է տալիս String
        su.reverse("sample");

//        4. Գրել method, որը ստուգում է թե քանի անգամ է տրված տեքստում հանդիպել token
//        ենթատողը
//        System.out.println(su.countOfToken("We are living in an yellow submarine. We don't have anything.","in"));

//        5. Գրել method, որը տեքստը սարքում է մեծատառերով գրված օգտագործելով String.
//        System.out.print("Enter text: ");
//        su.capitalLetters(sc.nextLine());
//        su.capitalLetters1(sc.nextLine());

//            6. Գրել method, որը console - ից կարդում է 20 երկարությամբ սիմվոլների տեղ, տպում այն, եթե տողի երկարությունը
//        պակաս է 20 ից ապա պետք է տողը լրացնենք պակաս սիմվոլների փոխարեն գրելով << * >> սիմվոլը․
//        System.out.print("Enter text:  ");
//       System.out.println("result:  " + su.concatAsterisk(sc.nextLine()));

//        7. Գրել method,« a », որը տրված տեքստից հեռացնում է բոլոր սիմվոլները. Նույնը խնդիրը StringBuilder-ով
//        System.out.println("Enter text: ");
//        System.out.println("result:  " + su.removeString(sc.nextLine()));
//        System.out.println("result:  " + su.removeStringBuilder(sc.nextLine()));

//        8.Գրել method,որը տրված տեքստում բոլոր « a » սիմվոլները փոխարինվում է « * » , օգտագործելով String․
//        System.out.print("Enter text: ");
//        System.out.println("result:  " + su.replaceString(sc.nextLine()));
//        System.out.println("result:  " + su.replaceStringBuilder(sc.nextLine()));

//        9. Գրել method, որը գտնում է տեքստում ամենաերկար բառը տեքստում բառերը անջատված են իրարից պռոբելով․
//        System.out.print("Enter text: ");
//        System.out.println("result:  " + su.theLongestWorld(sc.nextLine()));

//        10. Գրել method, որը գտնում է թե որերորդ ինդեքսում է առաջին անգամ հանդիպել String c սիմվոլը․
//        System.out.print("Enter text & symbol:   ");
///       System.out.println("Index of the first meet our symbol:  " + su.whichIndex(sc.nextLine(), sc.nextLine()));

//        11. Գրել method, որը գտնում և տպում է տրված տողի սկզբից մինչև n - րդ ինդեքսը պարունակող,
//        ենթատողը օգտագործելով String.Նույնը խնդիրը StringBuilder - ով.
//        System.out.print("Enter text & n:   ");
//       su.printSubLine(sc.nextLine(), sc.nextInt());
//        su.printSubLine(sc.nextLine(),sc.nextInt());

//        12. Գրել method, որը ստուգում է թե արդյոք տրված String պարամետրը դատարկ և null չէ.
//        System.out.println("If String is empty or null?  " + su.checkString(""));

//        13. Գրել method, որը տրոհում է նախադսությունը ըստ "," և գտում ամեներկար բառը․
//        System.out.print("Enter text: ");
//      System.out.println("result:  " + su.theLongestWorldSecondMethod(sc.nextLine()));

    }
    /**
     * This method doing concatenation.
     * @param s
     * @param ss
     */
    public String concatenation(String s, String ss) {
        System.out.println(s + ss);
        return s + ss;
    }

    /**
     * This method doing concatenation.
     * @param number1
     * @param number2
     * @param s
     */
    public void concatenation(int number1, int number2, String s) {
        System.out.println(number1 + number2 + s);
    }

    /**
     * This method doing concatenation.
     * @param s
     * @param number
     * @param ss
     */
    public void concatenation(String s, int number, String ss) {

        System.out.println(s + number + ss);
    }

    /**
     * This method doing concatenation.
     * @param s
     * @param number1
     * @param number2
     * @param ss
     */
    public void concatenation(String s, int number1, int number2, String ss) {
        System.out.println(s + number1 + number2 + ss);
    }


    /**
     * This method doing concatenation.
     * @param s
     * @param ss
     */

    public void concatenationStringBuilder(String s, String ss) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(ss);
        System.out.println(sb);
    }

    /**
     * This method doing concatenation.
     * @param number1
     * @param number2
     * @param s
     */
    public void concatenationStringBuilder(int number1, int number2, String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(number1);
        sb.append(number2);
        sb.append(s);
        System.out.println(sb);
    }

    /**
     * This method doing concatenation.
     * @param ss
     * @param number2
     * @param s
     */
    public void concatenationStringBuilder(String ss, int number2, String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(ss);
        sb.append(number2);
        sb.append(s);
        System.out.println(sb);
    }

    /**
     * This method doing concatenation.
     * @param s
     * @param number1
     * @param number2
     * @param ss
     */
    public int concatenationStringBuilder(String s, int number1, int number2, String ss) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(number1);
        sb.append(number2);
        sb.append(ss);
        System.out.println(sb);
        return sb.length();
    }

    /**
     * This method printed text using "\n\t...".
     * @param text
     * @return changed text.
     */
    public String result(String text) {
        System.out.print("actual:  " + text + "\n\n");
        System.out.print("result:  ");
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            if (text.charAt(i) == ' ') {
                System.out.print("\n\t\t ");
            }
        }
        return text;
    }

    /**
     * This method reversed text.
     * @param text
     * @return reversed text.
     */
    public String reverse(String text) {
        System.out.print("actual:  " + text + "\n");
        String reverseText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText += text.charAt(i);
        }
        System.out.println("result:  " + reverseText);
        return reverseText;
    }

    /**
     * This give how many times token with in our text.
     * @param line
     * @param token
     * @return how many times it met.
     */
    public int countOfToken(String line, String token) {
//        String subString;
//        int count = 0;
//        int size = 0;
//        for (int i = 0; i < line.length(); i++) {
//            if (line.charAt(i) == ' ' || line.charAt(i) == '.'){
//                subString = line.substring(size,i);
//                size = i + 1;
//                if (subString.contains(token)){
//                    count++;
//                }
//            }
//        }
//        return count;

//        Another solution
        return line.split(token).length - 1;
    }

    /**
     * This method doing all letters upper case.
     * @param text
     * @return changed text.
     */

    public String capitalLetters(String text) {
        System.out.print("actual:   " + text + "\n\n");
        System.out.print("result:   " + text.toUpperCase());
        return text;
    }

    /**
     * This method doing all letters upper case.
     * @param text
     * @return changed text.
     */
    public StringBuilder capitalLetters1(String text) {
        System.out.print("actual:   " + text + "\n\n");
        StringBuilder builder = new StringBuilder(text);
        for (int i = 0; i < builder.length(); i++) {
            if (Character.isLowerCase(builder.charAt(i))) {
                builder.setCharAt(i, Character.toUpperCase(builder.charAt(i)));
            }
        }
        System.out.print("result:   " + builder);
        return builder;
    }

    /**
     * If text length smaller than twenty, this method concat asterisks.
     * @param text
     * @return changed text with asterisk.
     */
    public String concatAsterisk(String text) {
        StringBuilder sb = new StringBuilder(text);
        System.out.print("\nactual:  " + text + "\n\n");
        while (text.length() != 20) {
            text = text.concat("*");
        }
        return text;
    }

    /**
     * This method removing "my symbol" from the text.
     * @param text
     * @return text without "my symbol".
     */
    public String removeString(String text) {
        System.out.print("\nactual:  " + text + "\n\n");
        text.replace('a', '"');
        return text;
    }

    /**
     * This method removing "my symbol" from the text.
     * @param text
     * @return text without "my symbol".
     */
    public StringBuilder removeStringBuilder(String text) {
        System.out.print("\nactual:  " + text + "\n\n");
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a') {
                sb.setCharAt(i, '"');
            }
        }
        return sb;
    }

    /**
     * This method replacing "a" with "*".
     * @param text
     * @return changed text.
     */
    public String replaceString(String text) {
        System.out.print("\nactual:  " + text + "\n\n");
        text = text.replace("a", "*");
        return text;
    }

    /**
     * This method replacing "a" with "*".
     * @param text
     * @return changed text.
     */
    public StringBuilder replaceStringBuilder(String text) {
        System.out.print("\nactual:  " + text + "\n\n");
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a') {
                sb.setCharAt(i, '*');
            }
        }
        return sb;
    }

    /**
     * This method find the longest world from the text.
     * @param text
     * @return the longest world.
     */
    public String theLongestWorld(String text){
        System.out.print("\nactual:  " + text + "\n\n");
        String[] subString = text.split(" ");
        String result = subString[0];
        for (int i = 1; i < subString.length; i++) {
            if (subString[i].length() > result.length()) {
                result = subString[i];
            }
        }
  return result;
    }

    /**
     * This method give us index of the first meeting index.
     * @param text
     * @param c
     * @return index.
     */
    public int whichIndex(String text, String c){
        System.out.print("\nactual:  " + text + "\n\n" + "symbol is: " + c + "\n\n");
        int index = 0;
        index = text.indexOf(c);
            return index;
        }

    /**
     * This method print our subLine from beginning of text to "n".
     * @param line
     * @param n
     */
        public void printSubLine(String line, int n){
                    System.out.println("\n\nresult:  " + line.substring(0,n));
                }
    /**
     * This method print our sub line from beginning of text to "n".
     * @param line
     * @param n
     */
    public void printSubLine(StringBuilder line, int n){
                System.out.println("\n\nresult:  " + line.substring(0,n).toString());
            }

    /**
     * This method check is our String null or empty.
     * @param s
     * @return true or false.
     */
    public boolean checkString(String s){
        System.out.print("\nactual:  " + s + "\n\n");
        boolean check = false;
        if (s == null || s.isEmpty() == true){
            check = true;
        }
        return check;
    }

    /**
     * This method doing split with "," and find the longest world.
     * @param text
     * @return the longest world.
     */
    public String theLongestWorldSecondMethod(String text){
        System.out.print("\nactual:  " + text + "\n\n");
        String[] subString = text.split(",");
        String result = subString[0];
        for (int i = 1; i < subString.length; i++) {
            if (subString[i].length() > result.length()) {
                result = subString[i];
            }
        }
        return result;
    }


   public StringBuilder appendStar(String string) {
        int counter = 0;
        StringBuilder sb = new StringBuilder (20);
        sb.append(string);
        if(sb.length() < sb.capacity()) {
            for(int i = sb.length(); i <sb.capacity(); i++) {
                sb.append("*");
            }
        }
        else
            return sb;
        return sb;
    }
}


