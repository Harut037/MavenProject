package org.example.collections.map_and_set;

import java.util.*;

public class MapAndSet {


    /**
     * Method finds common elements between HashSets.
     *
     * @return
     */
    public int common() {
        int counter = 0;
        HashSet<Integer> hashSet = new HashSet<>(List.of(25, 98, 4, -13, 0, 87, 11));
        HashSet<Integer> hs = new HashSet<>(List.of(9, 25, -15, 87, 11, 87, 98, 0));

        for (Integer integer : hashSet) {
            for (Integer integer1 : hs) {
                if (integer.equals(integer1)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    /**
     * Method sorts the list items in ascending order of age
     */
    public void orderByIncreasingAge(HashSet<Person> hashSet) {

        hashSet.add(new Person(23, "Aram"));
        hashSet.add(new Person(35, "John"));
        hashSet.add(new Person(20, "Harut"));

        ArrayList arrayList = new ArrayList(hashSet);

        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }


    /**
     * Method does not add unique words in the new list.
     */
    public HashSet ignoreCase() {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Pear");
        hashSet.add("class");
        hashSet.add("Apple");
        hashSet.add("cherry");

        HashSet<String> uniqueHashSet = new HashSet<>();
        for (String str : hashSet) {
            String lowerCaseStr = str.toLowerCase();
            if (!uniqueHashSet.contains(lowerCaseStr)) {
                uniqueHashSet.add(lowerCaseStr);
            }
        }

        System.out.println("Original Set: " + hashSet);
        System.out.println("Unique Set: " + uniqueHashSet);
        return uniqueHashSet;
    }

    /**
     * Method removes even numbers from thr list.
     */
    public void removeEvenNumbers() {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(-45);
        lhs.add(0);
        lhs.add(4);
        lhs.add(11);
        lhs.add(24);
        lhs.add(-8);
        lhs.add(37);
        lhs.add(23);

        LinkedHashSet linkedHashSet = new LinkedHashSet<>();

        System.out.println("List`s elements` " + lhs);

        for (Integer integer : lhs) {
            if (integer % 2 != 0) {
                linkedHashSet.add(integer);
            }
        }
        System.out.println("List`s elements without even numbers " + linkedHashSet);

    }

    /**
     * Method sorts the list items in ascending order of age
     */
    public void orderByIncreasingAge(LinkedHashSet<Person> linkedHashSet) {

        linkedHashSet.add(new Person(23, "Aram"));
        linkedHashSet.add(new Person(35, "John"));
        linkedHashSet.add(new Person(20, "Harut"));

        ArrayList<Person> arrayList = new ArrayList<>(linkedHashSet);
        Collections.sort(arrayList);
        for (Object o : arrayList) {
            System.out.println(o + "  ");
        }
    }

    /**
     * Method removes from list duplicate names.
     */
    public void removeDuplicateNames() {
        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Person(23, "Aram"));
        linkedHashSet.add(new Person(35, "John"));
        linkedHashSet.add(new Person(20, "Harut"));
        linkedHashSet.add(new Person(56, "Aram"));

        LinkedHashSet<String> names = new LinkedHashSet<>();
        LinkedHashSet<Person> uniqueSet = new LinkedHashSet<>();
        for (Person person : linkedHashSet) {
            if (!names.contains(person.getName())) {
                uniqueSet.add(person);
                names.add(person.getName());
            }
        }

        System.out.print("\nOriginal Set: \n");
        for (Person person : linkedHashSet) {
            System.out.println("      " + person);
        }

        System.out.print("\nUnique Set: \n");

        for (Person person : uniqueSet) {
            System.out.println("      " + person);
        }
    }

    /**
     * Method sorts the list items in ascending order of age
     */
    public void orderByIncreasingAge(TreeSet<Person> treeSet) {

        treeSet.add(new Person(23, "Aram"));
        treeSet.add(new Person(35, "John"));
        treeSet.add(new Person(20, "Harut"));

        ArrayList<Person> arrayList = new ArrayList<>(treeSet);
        Collections.sort(arrayList);
        for (Object o : arrayList) {
            System.out.println(o + "  ");
        }
    }


    /**
     * Method creat new list which contains only the elements that are in the first set but not in the second  set.
     */
    public void containsOnlyTheFirstList() {

        TreeSet<Integer> treeSet = new TreeSet<>(List.of(1, 3, 7, 21, -11, 33));
        TreeSet<Integer> treeSet1 = new TreeSet<>(List.of(0, 3, 7, 25, -16, 33));

        TreeSet<Integer> uniqueSet = new TreeSet<>();

        System.out.println("\nOriginal list one` " + treeSet);
        System.out.println("\nOriginal list two` " + treeSet1);

        for (Integer integer : treeSet) {
            Integer tmp = integer;
            if (!treeSet1.contains(tmp)) {
                uniqueSet.add(tmp);
            }
        }

        System.out.println("\nUnique set` " + uniqueSet);

    }

    /**
     * Method does not add unique words in the new list.
     */
    public void ignoreCases() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("blue");
        treeSet.add("Yellow");
        treeSet.add("red");
        treeSet.add("Black");
        treeSet.add("white");
        System.out.println("\nOriginal list` " + treeSet);
        TreeSet<String> uniqueTreeSet = new TreeSet<>();
        for (String color : treeSet) {
            String tmp = color.toLowerCase();
            if (treeSet.contains(tmp)) {
                uniqueTreeSet.add(tmp);
            }
        }
        System.out.println("\nUnique list` " + uniqueTreeSet);
    }


    /**
     * Method finds anagram paints int the array
     *
     * @return count of them.
     */
    public int anagramPairs() {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "dog");
        hashMap.put(1, "act");
        hashMap.put(2, "mice");
        hashMap.put(3, "god");
        hashMap.put(4, "cat");
        hashMap.put(5, "odg");

        int tmp1 = 0;
        int tmp2 = 0;
        int counter = 0;
        for (int i = 0; i < hashMap.size() - 1; i++) {
            for (int k = 0; k < hashMap.get(i).length(); k++) {
                tmp1 += hashMap.get(i).charAt(k);
            }
            for (int j = i + 1; j < hashMap.size(); j++) {
                for (int k = 0; k < hashMap.get(j).length(); k++) {
                    tmp2 += hashMap.get(j).charAt(k);
                }
                if (tmp1 == tmp2) {
                    counter++;
                }
                tmp2 = 0;
            }
            tmp1 = 0;
        }
        return counter * 2;
    }


    /**
     * Method find the most frequent string.
     */
    public void mostFrequent() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(0, "peach");
        treeMap.put(1, "apple");
        treeMap.put(2, "banana");
        treeMap.put(3, "apple");
        treeMap.put(4, "cherry");
        treeMap.put(5, "banana");
        treeMap.put(6, "apple");
        treeMap.put(7, "peach");
        treeMap.put(8, "banana");
        treeMap.put(9, "banana");
        treeMap.put(10, "peach");
        treeMap.put(11, "peach");
        treeMap.put(12, "peach");


        Map<Integer, Integer> map = new HashMap<>();
        int counter;

        for (int i = 0; i < treeMap.size(); i++) {
            counter = 0;
            for (int j = i; j < treeMap.size(); j++) {
                if (treeMap.get(i).equals(treeMap.get(j))) {
                    counter++;
                }
            }
            map.put(i, counter);
        }
        int index = 0;
        int tmp = 0;
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i) > tmp) {
                tmp = map.get(i);
                index = i;
            }
        }
        System.out.println("\nThe most frequent strings` " + treeMap.getOrDefault(index, "a"));
    }


    /**
     * Method merged intervals.
     */
    public void mergedIntervals() {
        TreeMap<Integer, Integer[]> treeMap = new TreeMap<>();
        Integer[] array = new Integer[]{1, 3};
        Integer[] array1 = new Integer[]{2, 6};
        Integer[] array2 = new Integer[]{15, 18};
        Integer[] array3 = new Integer[]{11, 13};
        Integer[] array4 = new Integer[]{5, 9};
        Integer[] array5 = new Integer[]{9, 10};

        ArrayList<Integer[]> arrayList = new ArrayList<>(List.of(array, array1, array2, array3, array4, array5));

        Integer tmp1;
        Integer tmp2;

        Integer forArray;
        Integer forArray1;
        Integer forArray2;
        Integer forArray3;
        Integer[] zero = new Integer[]{0, 0};
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)[0] > arrayList.get(i)[1]){
                throw new ArithmeticException();
            }
            for (int j = i; j < arrayList.size(); j++) {
                forArray = arrayList.get(i)[1];
                forArray1 = arrayList.get(j)[0];
                if (((forArray >= forArray1) && arrayList.get(i)[1] <= arrayList.get(j)[1])) {
                    tmp1 = arrayList.get(i)[0];
                    tmp2 = arrayList.get(j)[1];
                    Integer[] integer = new Integer[]{tmp1, tmp2};
                    arrayList.set(j, zero);
                    arrayList.set(i, integer);
                }
                if ((arrayList.get(i)[0] > arrayList.get(j)[0] && (arrayList.get(i)[1] > arrayList.get(j)[1]) && arrayList.get(j)[1] > arrayList.get(i)[0])) {
                    tmp1 = arrayList.get(j)[0];
                    tmp2 = arrayList.get(i)[1];
                    Integer[] integer = new Integer[]{tmp1, tmp2};
                    arrayList.set(j, zero);
                    arrayList.set(i, integer);
                }

            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i; j < arrayList.size(); j++) {
                forArray = arrayList.get(i)[1];
                forArray1 = arrayList.get(j)[0];
                if ((forArray.equals(forArray1 - 1)) || (forArray.equals(forArray1))) {
                    tmp1 = arrayList.get(i)[0];
                    tmp2 = arrayList.get(j)[1];
                    Integer[] integer = new Integer[]{tmp1, tmp2};
                    arrayList.set(j, zero);
                    arrayList.set(i, integer);
                }
            }
        }

        ArrayList<Integer[]> uniqueList = new ArrayList<>();
        int index = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                if (!(arrayList.get(i)[0] == 0 && arrayList.get(i)[1] == 0)) {
                    uniqueList.add(index,arrayList.get(i));
                    index++;
                }
            }


        for (int i = 0; i < uniqueList.size(); i++) {
            treeMap.put(i, uniqueList.get(i));
        }

        for (int i = 0; i < treeMap.size(); i++) {
            System.out.println( "[" + treeMap.get(i)[0] + "  " + treeMap.get(i)[1] + "]");
        }
    }
}


