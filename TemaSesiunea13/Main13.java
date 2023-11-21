package TemaSesiunea13;

import javax.swing.*;

public class Main13 {

    public static void main(String[] args) {

        //1. Define a generic class called Box that can hold an object of any type. Implement methods to set and get the value inside the box.

        Box<Integer>integerBox= new Box<>();
        integerBox.setValue(42);
        System.out.println("Value inside the box: " + integerBox.getValue());

        Box<String>stringBox=new Box<>();
        stringBox.setValue("The value inside the box is 42");
        System.out.println("String inside the box is: " + stringBox.getValue());

        //2. Write a Java program to create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order (pass different types).

       ArrayComparator intArrayComparator = new ArrayComparator();

        Integer[]intArray1 = {1,2,3,4,5,6};
        Integer[]intArray2 = {1,2,3,4,5,6};

        System.out.println("Arrays are equal: " + intArrayComparator.<Integer>areArraysEqual(intArray1,intArray2));

        Integer[]intArray3={1,3,4,5,6};
        Integer[]intArray4={1,8,4,7,6};

        System.out.println("Arrays are equal: " + intArrayComparator.<Integer>areArraysEqual(intArray3,intArray4));

        //3. Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.





    }
}
