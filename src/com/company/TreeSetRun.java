package com.company;

import java.util.*;

public class TreeSetRun {
    public static void main(String[] args) {
//1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String> colorsTreeSet = new TreeSet<String>();
        colorsTreeSet.add("Red");
        colorsTreeSet.add("White");
        colorsTreeSet.add("Yellow");
        colorsTreeSet.add("Black");
        colorsTreeSet.add("Green");
        colorsTreeSet.add("Pink");

        System.out.println("\n1. Java program to create a new tree set, add some colors (string) and print out the tree set\n" + colorsTreeSet);

//2. Write a Java program to iterate through all elements in a tree set.
        System.out.println("\n2. Java program to iterate through all elements in a tree set");
        for (String element : colorsTreeSet) {
            System.out.print(element + ", ");
        }
//3. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> colorsTreeSet2 = new TreeSet<String>();
        colorsTreeSet2.addAll(colorsTreeSet);
        System.out.println("\n\n3. Java program to add all the elements of a specified tree set to another tree set.\n" + colorsTreeSet2);

//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        Iterator it = colorsTreeSet.descendingIterator();
        System.out.println("\n4. Java program to create a reverse order view of the elements contained in a given tree set.");
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

//5. Write a Java program to get the first and last elements in a tree set.
        System.out.println("\n\n5. Java program to get the first and last elements in a tree set.");
        Object first_element = colorsTreeSet.first();
        System.out.println("The first element is: " + first_element);

        // Find last element of the tree set
        Object last_element = colorsTreeSet.last();
        System.out.println("The last element is: " + last_element);

//6. Write a Java program to clone a tree set list to another tree set.
        TreeSet<String> cloneColors = (TreeSet<String>) colorsTreeSet.clone();
        System.out.println("\nJava program to clone a tree set list to another tree set.\n" + cloneColors);

//7. Write a Java program to get the number of elements in a tree set.
        System.out.println("\nJava program to get the number of elements in a tree set.\n" + cloneColors.size());

//8. Write a Java program to compare two tree sets.
        System.out.println("\n8. Java program to compare two tree sets.");
        TreeSet<String> compareColors = new TreeSet<String>();
        for (String element : colorsTreeSet) {
            System.out.println(cloneColors.contains(element) ? "Yes" : "No");
        }

        //9. Write a Java program to find the numbers less than 7 in a tree set.
        System.out.println("\n9. Java program to find the numbers less than 7 in a tree set.");

        TreeSet<Integer> treeSetNum = new TreeSet<Integer>();
        TreeSet<Integer> treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        treeSetNum.add(1);
        treeSetNum.add(2);
        treeSetNum.add(3);
        treeSetNum.add(5);
        treeSetNum.add(6);
        treeSetNum.add(7);
        treeSetNum.add(8);
        treeSetNum.add(9);
        treeSetNum.add(10);

        treeheadset = (TreeSet) treeSetNum.headSet(7);

        Iterator iterator;
        iterator = treeheadset.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

//10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        System.out.println("\n\n10. Java program to get the element in a tree set which is greater than or equal to the given element.");
        int element = 5;
        int i = treeSetNum.ceiling(element);

        System.out.println("Greater than or equal " + element + " is: " + i);

//11. Write a Java program to get the element in a tree set which is less than or equal to the given element.
        System.out.println("\n11. Java program to get the element in a tree set which is less than or equal to the given element.");
        int element2 = 6;
        int j = treeSetNum.floor(element2);

        System.out.println("GLess than or equal to " + element2 + " is: " + j);

//12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.
        System.out.println("\n12. Java program to get the element in a tree set which is strictly greater than or equal to the given element.");
        int element3 = 4;
        int a = treeSetNum.higher(element3);

        System.out.println("Strictly greater than " + element3 + " is: " + a);

//13. Write a Java program to get an element in a tree set which is strictly less than the given element.
        System.out.println("\n13. Java program to get an element in a tree set which is strictly less than the given element.");
        int element4 = 4;
        int b = treeSetNum.lower(element4);

        System.out.println("Strictly less than " + element4 + " is: " + b);

//14. Write a Java program to retrieve and remove the first element of a tree set.
        System.out.println("\n14. Removes the first element:\n" + colorsTreeSet.pollFirst());

//15. Write a Java program to retrieve and remove the last element of a tree set.
        System.out.println("\n15. Removes the last element:\n" + colorsTreeSet.pollLast());

//16. Write a Java program to remove a given element from a tree set.
        if (treeSetNum.remove(8)) {
            System.out.println("\n16. Java program to remove a given element from a tree set.\n" + treeSetNum);
        } else {
            System.out.println("\n16. Java program to remove a given element from a tree set.\n" + "Element isn't correct");
        }
    }
}
