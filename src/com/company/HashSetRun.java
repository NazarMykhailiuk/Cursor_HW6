package com.company;

import java.util.*;

public class HashSetRun {
    public static void main(String[] args) {
//1. Write a Java program to append the specified element to the end of a hash set.
        HashSet<String> colorsSet = new HashSet<String>();
        // use add() method to add values in the hash set
        colorsSet.add("Red");
        colorsSet.add("White");
        colorsSet.add("Yellow");
        colorsSet.add("Black");
        colorsSet.add("Green");
        colorsSet.add("Pink");

        System.out.println("\n1. Java program to append the specified element to the end of a hash set:\n" + colorsSet);

//2. Write a Java program to iterate through all elements in a hash list.
        System.out.println("\n2. Write a Java program to iterate through all elements in a hash list.");
        Iterator<String> p = colorsSet.iterator();
        while (p.hasNext()) {
            System.out.print(p.next() + ", ");
        }

//3. Write a Java program to get the number of elements in a hash set.
        System.out.println("\n\n3. Java program to get the number of elements in a hash set:\n" + colorsSet);

//4. Write a Java program to empty an hash set.
        colorsSet.removeAll(colorsSet);
        System.out.println("\n4. Java program to empty an hash set.\n" + colorsSet);

//5. Write a Java program to test a hash set is empty or not.
        System.out.println("\n5. Java program to test a hash set is empty or not.");
        if (colorsSet.isEmpty()) {
            System.out.println("Array list is empty!");
        } else {
            System.out.println("Array list isn't empty!");
        }

//6. Write a Java program to clone a hash set to another hash set.
        System.out.println("\n6. Java program to clone a hash set to another hash set.");
        HashSet<String> colorSet2 = new HashSet<String>();
        colorSet2.add("Red");
        colorSet2.add("Green");
        colorSet2.add("Black");
        colorSet2.add("White");
        colorSet2.add("Pink");
        colorSet2.add("Yellow");
        System.out.println("Original Hash Set: " + colorSet2);
        HashSet<String> newColorSet2 = new HashSet<String>();
        newColorSet2 = (HashSet) colorSet2.clone();
        System.out.println("Cloned Hash Set: " + newColorSet2);

//7. Write a Java program to convert a hash set to an array.
        String[] newArray = new String[colorSet2.size()];
        colorSet2.toArray(newArray);
        System.out.println("\n7. Java program to convert a hash set to an array.");
        for (String element : newArray) {
            System.out.print(element + ", ");
        }

//8. Write a Java program to convert a hash set to a tree set.
        Set<String> TreeSet = new TreeSet<String>(colorSet2);
        System.out.println("\n\n8. Java program to convert a hash set to a tree set.");
        for (String element : TreeSet) {
            System.out.print(element + ", ");
        }
//9. Write a Java program to convert a hash set to a List/ArrayList.
        List<String> List = new ArrayList<String>(colorSet2);

        // Display ArrayList elements
        System.out.println("\n\n9. Java program to convert a hash set to a List\n" + colorSet2);

//10. Write a Java program to compare two hash set.
        HashSet<String> compareSet = new HashSet<String>();
        for (String element : colorSet2) {
            System.out.println(newColorSet2.contains(element) ? "Yes" : "No");
        }

//11. Write a Java program to compare two sets and retain elements which are same on both sets.
        HashSet<String> colorsSet3 = new HashSet<String>();
        colorsSet3.add("Red");
        colorsSet3.add("Pink");
        colorsSet3.add("Black");
        colorsSet3.add("Orange");

        colorSet2.retainAll(colorsSet3);
        System.out.println("\n11. Java program to compare two sets and retain elements which are same on both sets");
        System.out.println(colorSet2);

//12. Write a Java program to remove all of the elements from a hash set.
        colorSet2.clear();
        System.out.println("\n12. Java program to remove all of the elements from a hash set.\n" + colorSet2);
    }
}