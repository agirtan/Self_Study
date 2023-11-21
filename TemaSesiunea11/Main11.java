package TemaSesiunea11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class Main11 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");
        System.out.println();

//  1. Write a Java program to iterate through all elements in a array list.

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Exercise 2");
        System.out.println();
//  2.Write a Java program to insert an element into the array list at the first position.

        String elementToInsert = "Orange";


        arrayList.add(0, elementToInsert);


        System.out.println("New array list:");
        for (String fruit : arrayList) {        // = for (int i =0; i<arrayList.size(); i++){
            System.out.println(fruit);          //    String fruit = arrayList.get(i)
        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Exercise 3");
        System.out.println();


//3. Write a Java program to sort a given array list.

        Collections.sort(arrayList);

        System.out.println("Sorted array list");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Exercise 4");
        System.out.println();
//4. Write a Java program to copy one array list into another.

        ArrayList<String> destinationArrayList = new ArrayList<>(arrayList);
        System.out.println("Copied array list");
        for (String fruit : destinationArrayList) {
            System.out.println(fruit);
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Exercise 5");
        System.out.println();

        //5. Write a Java program of swap two elements in an array list.

        int element1 = 1;
        int element2 = 2;

        if (element1 >= 0 && element1 < arrayList.size() && element2 >= 0 && element2 < arrayList.size()) {
            Collections.swap(arrayList, element1, element2);
            System.out.println("swapped elements at index " + element1 + " and at index " + element2);
            for (String fruit : arrayList) {
                System.out.println(fruit);
            }
            System.out.println("-------------------------------------------------------");
            System.out.println("Exercise 6");
            System.out.println();
        }
        //  6. Write a Java program to trim the capacity of an array list the current list size.

        ArrayList<String> arrayToBeTrimmed = new ArrayList<>(arrayList);
        arrayToBeTrimmed.add("Mango");

        System.out.println("Original array list: ");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        System.out.println();

        System.out.println("Trimmed array list: ");
        for (String fruit : arrayToBeTrimmed) {
            System.out.println(fruit);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Exercise 7");
        System.out.println();

//7. Write a Java program to empty an array list.
        arrayToBeTrimmed.clear();
        if (arrayToBeTrimmed.isEmpty()) {
            System.out.println("The array is empty");
        } else {
            System.out.println("The array is not empty");
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("Exercise 8");
        System.out.println();

//8. Write a Java program to iterate through all elements in a linked list starting at the specified position.

        int startIndex = 2;//Banana
        ListIterator<String> iterator = arrayList.listIterator(startIndex);
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Exercise 9");
        System.out.println();


//9.Write a Java program to iterate a linked list in reverse order.

        ListIterator<String> reverseIterator = arrayList.listIterator(arrayList.size());

        System.out.println("Reverse iterating through list: ");
        while (reverseIterator.hasPrevious()){
            String element= reverseIterator.previous();
            System.out.println(element);
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Exercise 10");
        System.out.println();

//10.Write a Java program to insert some elements at the specified position into a linked list.

        LinkedList< String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Mango");
        linkedList.add("Banana");

        int position =2; //Cherry

        String el1 ="Grapes";
        String el2 = "Kiwi";

        linkedList.add(position,el1);
        linkedList.add(position,el2);

        System.out.println(" New position of elements: ");
        for (String fruit: linkedList){
            System.out.println(fruit);

        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Exercise 11");
        System.out.println();

        // 11.Write a Java program to get the first and last occurrence of the specified elements in a linked list.

//        String targetElement = "Banana";
//
//        int firstOccurence = -1;
//        int lastOccurence = -1;
//
//        ListIterator<String> iterator1 = linkedList.listIterator();
//        int index =0;
//
//        while( iterator1.hasNext()){
//            String element = iterator1.next();
//            if (element.equals(targetElement)){
//                if(firstOccurence==-1){
//                    firstOccurence=index;
//                }
//                lastOccurence=index;
//            }
//            index++;
//        }
//    if (firstOccurence !=-1){
//        System.out.println(" First occurrence of "+ targetElement + " at index " + firstOccurence);
//        System.out.println(" Last occurrence of "+ targetElement + " at index " + lastOccurence);
//    }
//
//        System.out.println("--------------------------------------------------------------------------");
//        System.out.println("Exercise 12");
//        System.out.println();

// 12. Write a Java program to join two linked lists.

//        LinkedList<String>list2= new LinkedList<>();
//        list2.add("Kiwi");
//        list2.add("Orange");
//        list2.add("Grapes");
//
//        linkedList.addAll(list2);
//
//        System.out.println("Joined linked lists:");
//        System.out.println();
//        for(String fruit:linkedList){
//            System.out.println(fruit);
//        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Exercise 13");
        System.out.println();

//13.Write a Java program to clone a linked list to another linked list.

        LinkedList<String> clonedList = new LinkedList<>(arrayList);

        System.out.println("Original list ");
        System.out.println();
        for( String fruit:arrayList){
            System.out.println(fruit);
        }
        System.out.println("Cloned list");
        System.out.println();
        for (String fruit:clonedList){
            System.out.println(fruit);
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Exercise 14");
        System.out.println();

        // 14.Write a Java program to remove and return the first element of a linked list.

        String firstElement = arrayList.remove(0);

        if( firstElement != null){
            System.out.println("Removed and returned the first element :" + firstElement);
        }else{
            System.out.println("The list is empty");
        }

        System.out.println("New list:");
        for(String fruit : arrayList){
            System.out.println(fruit);
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Exercise 15");
        System.out.println();

// 15. Write a Java program to retrieve but does not remove, the first element of a linked list.

        String firstElement1;
        if(!linkedList.isEmpty()){
            firstElement1 = linkedList.pop();

            System.out.println("Retrieved the first element withour removing it: " + firstElement1);
        }else{
            System.out.println("The list is empty");
        }
        System.out.println();
        System.out.println("Initial list:");
        for(String fruit:linkedList){
            System.out.println(fruit);
        }

    }

}
