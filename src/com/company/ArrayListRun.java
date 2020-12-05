package com.company;

import java.util.*;

public class ArrayListRun {

    public static void main(String[] args) {
//1. Write a Java program to create a new array list, add some colors (string) and print out the collection
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("White");
        colors.add("Red");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Green");
        System.out.println("1. Create a new array list, add some colors (string): \n" + colors);

//2. Write a Java program to iterate through all elements in a array list.
        System.out.print("\n2. Write a Java program to iterate through all elements in a array list: \n");
        for (String color : colors) {

            System.out.print(color + " ");
        }

//3. Write a Java program to insert an element into the array list at the first position.
        colors.add(0, "Brown");
        System.out.println("\n\n3. Write a Java program to insert an element into the array list at the first position: \n" + colors);

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println("\n4. Write a Java program to retrieve an element (at a specified index) from a given array list: " + "\nThird element: " + colors.get(2));

//5. Write a Java program to update specific array element by given element.
        colors.set(1, "Blue");
        System.out.println("\n5. Updated specific array second element by element Blue: " + colors);

//6. Write a Java program to remove the third element from a array list.
        colors.remove(2);
        System.out.println("\n6. Java program to remove the third element from a array list: \n" + colors);

//7. Write a Java program to search an element in a array list.
        System.out.print("\n7. Result of searching an element \"Green\" in the array list: \n");
        if (colors.contains("Green")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
//8. Write a Java program to sort a given array list.
        Collections.sort(colors);
        System.out.println("\n8. Write a Java program to sort a given array list." + "\nList after sort: " + colors);

//9. Write a Java program to copy one array list into another.
        List<String> colorsNum = new ArrayList<String>();
        colorsNum.add("1");
        colorsNum.add("2");
        colorsNum.add("3");

        Collections.copy(colors, colorsNum);
        System.out.println("\n8. Copy one array list into another.\nAfter copy:");
        System.out.println("Colors: " + colors);
        System.out.println("ColorsNum: " + colorsNum);

//10. Write a Java program to shuffle elements in a array list.
        Collections.shuffle(colors);
        System.out.println("\n10. List after shuffling:\n" + colors);

//11. Write a Java program to reverse elements in a array list.
        Collections.reverse(colors);
        System.out.println("\n11. List after reversing:\n" + colors);

//12. Write a Java program to extract a portion of a array list.
        List<String> extract = colors.subList(0, 3);
        System.out.println("\n12. List of first four elements:\n" + extract);

//13. Write a Java program to compare two array lists.
        ArrayList<String> colors1 = new ArrayList<String>();
        colors1.add("White");
        colors1.add("Red");
        colors1.add("Black");
        colors1.add("Yellow");
        colors1.add("Green");

        ArrayList<String> colors2 = new ArrayList<String>();
        colors2.add("White");
        colors2.add("Black");
        colors2.add("Red");

        ArrayList<String> colors3 = new ArrayList<String>();
        for (String e : colors1)
            colors3.add(colors2.contains(e) ? "Yes" : "No");
        System.out.println("\n13. compare two array lists.\n" + colors3);

//14. Write a Java program of swap two elements in an array list.
        Collections.swap(colors1, 0, 2);
        System.out.println("\n14. Array list after swap:\n" + colors1);

//15. Write a Java program to join two array lists.
        ArrayList<String> colorsJoin = new ArrayList<String>();
        colorsJoin.addAll(colors1);
        colorsJoin.addAll(colors2);
        System.out.println("\n15. New array:\n" + colorsJoin);

//16. Write a Java program to clone an array list to another array list.
        ArrayList<String> newColors1 = (ArrayList<String>) colors1.clone();
        System.out.println("\n16. Cloned array list:\n" + newColors1);

//17. Write a Java program to empty an array list.
        colors1.removeAll(colors1);
        System.out.println("\n17. Array list after remove all elements:\n" + colors1);

//18. Write a Java program to test an array list is empty or not.
        System.out.println("\n18. Checking the above array list is empty or not");
        if (colors1.isEmpty()) {
            System.out.println("Array list is empty!");
        } else {
            System.out.println("Array list is not empty!");
        }

//19. Write a Java program to trim the capacity of an array list the current list size.
        colorsJoin.trimToSize();
        System.out.println("\n19. Trim the capacity of an array list the current list size.\n" + colors2);

//20. Write a Java program to increase the size of an array list.
        colors2.ensureCapacity(6);
        colors2.add("Green");
        colors2.add("Pink");
        colors2.add("Yellow");
        System.out.println("\n20. Array list Colors2 after increase:\n" + colors2);

//21. Write a Java program to replace the second element of a ArrayList with the specified element.
        String new_color = "White";
        colors2.set(1, new_color);
        System.out.println("\n21. List after replacing second element:\n" + colors2);

//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
        System.out.println("\n22. Printed all the elements of an ArrayList using the position of the elements:");
        int numElements = colors2.size();
        for (int index = 0; index < numElements; index++)
            System.out.print(colors2.get(index) + ", ");

    }
}
