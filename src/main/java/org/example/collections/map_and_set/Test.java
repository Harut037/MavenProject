package org.example.collections.map_and_set;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        MapAndSet mas = new MapAndSet();


//  1. HashSet:

//    A. Write a program that takes two HashSets of integers and finds the common elements between them.

//        System.out.println("Common elements between HashSets = " + mas.common());


//    B. Create a HashSet of custom objects with a name and age field. Then, write a
//       comparator to sort the objects by age and print out the objects in order of increasing age

//      mas.orderByIncreasingAge(new HashSet<>());


//    C. Write a program that takes a HashSet of strings and returns a new HashSet
//       containing only the unique words in the original set, ignoring case.

        mas.ignoreCase();


//   2. LinkedHashSet:

//    A. Write a program that takes in a LinkedHashSet of integers and removes any
//       even numbers from the set.

//       mas.removeEvenNumbers();

//    B. Create a LinkedHashSet of custom objects with a name and age field. Then,
//       write a comparator to sort the objects by age and print out the objects in
//       order of increasing age.

//        mas.orderByIncreasingAge(new LinkedHashSet<>());


//    C. Write a program that takes in a LinkedHashSet of custom objects and
//       removes any objects that have a duplicate name field.

//        mas.removeDuplicateNames();


//   3. TreeSet:

//    A. Create a TreeSet of custom objects with a name and age field. Then, write a
//       comparator to sort the objects by age and print out the objects in order of
//       increasing age.

//        mas.orderByIncreasingAge(new TreeSet<>());


//    B. Write a program that takes in two TreeSets of integers and returns a new set
//       containing only the elements that are in the first set but not in the second set.

//       mas.containsOnlyTheFirstList();


//    C. Write a program that takes in a TreeSet of strings and returns a new set
//       containing only the unique words in the original set, ignoring case.

//        mas.ignoreCases();


//   4. HashMap:

//    A. Write a program that takes in an array of integers and returns the length of
//       the longest consecutive subsequence of integers in the array using a
//       HashMap. For example, if the array is [1, 3, 2, 4, 7, 5, 6], then the longest
//       consecutive subsequence is [1, 2, 3, 4, 5, 6], and the program should return 6.


//    B. Write a program that takes in an array of strings and returns the number of
//       anagram pairs in the array using a HashMap. For example, if the array is
//       ["dog", "god", "cat", "act", "mice"], then the program should return 4 (dog
//       and god, god and dog, cat and act, act and cat).

//        System.out.println("Count of anagram pairs in the array = " + mas.anagramPairs());


//    C. Write a program that takes in a string s and an integer k and returns the k
//       most frequent substrings of s using a HashMap. For example, if s is
//       "abcabcab" and k is 2, then the program should return ["ab", "bc"]. If there
//       are ties, return the lexicographically smallest substrings.



//   6. TreeMap:

//    A. Write a program that takes in a list of intervals and returns a list of intervals
//       with all overlapping intervals merged using a TreeMap. For example, if the
//       input list is [(1, 3), (2, 6), (8, 10), (15, 18)], then the program should return
//       [(1, 6), (8, 10), (15, 18)].

//        mas.mergedIntervals();


//    B. Write a program that takes in a list of strings and returns the k most frequent
//       strings in the list using a TreeMap. For example, if the input list is ["apple",
//       "banana", "apple", "cherry", "banana", "apple", "date"] and k is 2, then the
//       program should return ["apple", "banana"].

//        mas.mostFrequent();



    }

}







