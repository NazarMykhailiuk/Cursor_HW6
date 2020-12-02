package com.company;

import java.util.*;

public class LinkedListRun {
    public static void main(String[] args) {
//1. Write a Java program to append the specified element to the end of a linked list.
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("White");
        colors.add("Red");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Green");
        System.out.println("1. Java program to append the specified element to the end of a linked list:\n" + colors);

//2. Write a Java program to iterate through all elements in a linked list.
        System.out.println("\n2. Java program to iterate through all elements in a linked list:");
        for (String element : colors) {
            System.out.print(element + ", ");
        }

//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        System.out.println("\n\n3. Java program to iterate through all elements in a linked list starting at the specified position.");
        Iterator p = colors.listIterator(3);
        while (p.hasNext()) {
            System.out.print(p.next() + ", ");
        }

//4. Write a Java program to iterate a linked list in reverse order.
        Iterator it = colors.descendingIterator();
        System.out.println("\n\n4. Java program to iterate a linked list in reverse order:");
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
//5. Write a Java program to insert the specified element at the specified position in the linked list.
        colors.add(2, "Pink");
        System.out.println("\n\n5. Java program to insert the specified element at the specified position in the linked list:\n" + colors);

//6. Write a Java program to insert elements into the linked list at the first and last position.
        colors.addFirst("Blue");
        colors.addLast("Brown");
        System.out.println("\n6. Java program to insert elements into the linked list at the first and last position:\n" + colors);

//7. Write a Java program to insert the specified element at the front of a linked list.
        colors.offerFirst("Silver");
        System.out.println("\n7. Java program to insert the specified element at the front of a linked list:\n" + colors);

//8. Write a Java program to insert the specified element at the end of a linked list.
        colors.offerLast("Red");
        System.out.println("\n8. Java program to insert the specified element at the end of a linked list:\n" + colors);

//9. Write a Java program to insert some elements at the specified position into a linked list.
        LinkedList<String> newColors = new LinkedList<String>();
        newColors.add("Violet");
        newColors.add("Orange");
        colors.addAll(1, newColors);
        System.out.println("\n9. Java program to insert some elements at the specified position into a linked list:\n" + colors);

//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        System.out.println("\n10. Java program to get the first and last occurrence of the specified elements in a linked list.");
        System.out.println("First Element is: " + colors.getFirst());
        System.out.println("Last Element is: " + colors.getLast());

//11. Write a Java program to display the elements and their positions in a linked list.
        System.out.println("\n11. Java program to display the elements and their positions in a linked list.");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element " + i + ": " + colors.get(i));
        }

//12. Write a Java program to remove a specified element from a linked list.
        colors.remove(1);
        System.out.println("\n12. Java program to remove a second element from a linked list:\n" + colors);

//13. Write a Java program to remove first and last element from a linked list.
        System.out.println("\n13. Java program to remove first and last element from a linked list.");
        System.out.println("First element removed: " + colors.removeFirst());
        System.out.println("Last element removed: " + colors.removeLast());

//14. Write a Java program to remove all the elements from a linked list.
        colors.clear();
        System.out.println("\n14. Java program to remove all the elements from a linked list:\n" + colors);

//15. Write a Java program of swap two elements in an linked list.
        LinkedList<String> colors3 = new LinkedList<String>();
        colors3.add("Red");
        colors3.add("Green");
        colors3.add("Black");
        colors3.add("Pink");
        colors3.add("Orange");

        Collections.swap(colors3, 1, 3);
        System.out.println("\n15. Java program of swap two elements in an linked list:\n" + colors3);

//16. Write a Java program to shuffle the elements in a linked list.
        Collections.shuffle(colors3);
        System.out.println("\n16. Java program to shuffle the elements in a linked list:\n" + colors3);

//17. Write a Java program to join two linked lists.
        LinkedList<String> colors2 = new LinkedList<String>();
        colors2.addAll(colors3);
        colors2.addAll(newColors);
        System.out.println("\n17. Java program to join two linked lists:\n" + colors2);

//18. Write a Java program to clone an linked list to another linked list.
        LinkedList<String> cloneColors2 = new LinkedList<String>();
        cloneColors2 = (LinkedList) colors2.clone();
        System.out.println("\n18. Java program to clone an linked list to another linked list:\n" + cloneColors2);

//19. Write a Java program to remove and return the first element of a linked list.
        System.out.println("\n19. Java program to remove and return the first element of a linked list:\n" +
                "Removed element: " + cloneColors2.pop() +
                "\nLinked list after pop operation: " + cloneColors2);

//20. Write a Java program to retrieve but does not remove, the first element of a linked list.
        String x = colors2.peekFirst();
        System.out.println("\n20. Java program to retrieve but does not remove, the first element of a linked list" +
                "\nFirst element in the list: " + x + "\nOriginal linked list: " + colors2);

//21. Write a Java program to retrieve but does not remove, the last element of a linked list.
        System.out.println("\n21. Java program to retrieve but does not remove, the last element of a linked list:\n" + colors2.peekLast());

//22. Write a Java program to check if a particular element exists in a linked list.
        System.out.println("\n22. Java program to check if a Orange exists in a linked list.");
        if (colors2.contains("Orange")) {
            System.out.println("Color Orange is present in the linked list.");
        } else {
            System.out.println("Color Orange is not present in the linked list.");
        }

//23. Write a Java program to convert a linked list to array list.
        List<String> list = new ArrayList<String>(colors2);
        System.out.println("\n23. Java program to convert a linked list to array list:\n" + list);

//24. Write a Java program to compare two linked lists.
        LinkedList<String> compare = new LinkedList<String>();
        for (String e : colors2)
            compare.add(colors3.contains(e) ? "Yes" : "No");
        System.out.println("\n24. Java program to compare two linked lists:\n" + compare);

//25. Write a Java program to test an linked list is empty or not.
        System.out.println("\n25. Java program to test an linked list is empty or not");
        if (colors2.isEmpty()) {
            System.out.println("Linked list is empty!");
        } else {
            System.out.println("Linked list isn't empty!");
        }

//26. Write a Java program to replace an element in a linked list.
        System.out.println("\n26. Write a Java program to replace an element in a linked list." + "\nOriginal linked list:\n" + colors2);
        colors2.set(1, "Pink");
        System.out.println("The value of second element changed.");
        System.out.println("New linked list: " + colors2);
    }
}
