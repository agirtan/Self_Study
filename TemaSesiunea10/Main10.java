package TemaSesiunea10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main10 {

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
    public static void main(String[] args) {
//
//        ArrayList<String> colorList = new ArrayList<>();
//        colorList.add("Red");
//        colorList.add("Green");
//        colorList.add("Blue");
//
//        Iterator<String> iterator = colorList.iterator();
//
//        System.out.println("Colors using Iterator:");
//        while (iterator.hasNext()) {
//            String color = iterator.next();
//            System.out.println(color);
//        }
//2. Write a Java program to insert an element into the array list at the first position.

        ArrayList<String> colorList =new ArrayList<>();

        colorList.add ("Green");
        colorList.add("Blue");
        colorList.add("Yellow");

        System.out.println("Original ArrayList: "+ colorList);

        String newColor = "Red";
        colorList.add(1, newColor);

        System.out.println("ArrayList after adding element at the second position: "+ colorList);
//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
        int indexToRetrieve = 2;

        if (indexToRetrieve>=0 && indexToRetrieve<colorList.size()){

            String retrievedColor = colorList.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve +": " +retrievedColor);
        }else{
            System.out.println("Index out of bonds");
        }
//4. Write a Java program to update specific array element by given element.
        colorList.set(3, "Black");
        System.out.println("The updated list is : "+ colorList +" and the updated color is " + colorList.get(3));
//5. 5. Write a Java program to remove the third element from a array list.

        colorList.remove((colorList.size()-2));

        System.out.println("New list is :"+ colorList);
//10. Write a Java program to append the specified element to the end of a hash set.

        Set<String>setList= new HashSet<>(colorList);

        String newElement = "Purple";

        setList.add(newElement);

        System.out.println("HashSet with new element: " + setList);






    }
}

