package Homeworks.exercisesSession16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//
// 1. Create a functional interface that takes a list of integers and returns a list of integers. Use a lambda expression to implement this interface, such that it returns a list containing only the odd numbers from the original list.
@FunctionalInterface
interface FilterInterface{
    List< Integer> filter (List<Integer> numbers);
}
//2. Create a functional interface with a method that takes a List<String> representing first names and returns a List<String> of those names formatted in uppercase. Implement it using a lambda expression.

@FunctionalInterface
interface FirstName {
    List<String>firstName(List<String>names);
}
public class Main16 {
    public static void main(String[] args) {

        //1-------------------------------------------------------------------------------------------------------------

        List<Integer>originalList = List.of(1,2,3,4,5,6,7,8,9,10);
        FilterInterface oddFilter = numbers -> {
            return numbers.stream().filter(n->n%2!=0)
                    .toList();
        };

        List<Integer>filteredList = oddFilter.filter(originalList);
        System.out.println("Original list: "+ originalList);
        System.out.println( "Filtered List(Odd numbers): " + filteredList);

        //2--------------------------------------------------------------------------------------------------------------

        List<String>originalNames = new ArrayList<>();
        originalNames.add("BOGDAN IONESCU");
        originalNames.add("IIANCU DRAGOS");
        originalNames.add("Ionescu popescu");
        originalNames.add("Bogdan popescu");


        for (int i = 0; i < originalNames.size(); i++) {
            System.out.println(originalNames.get(i));
        }
        FirstName capitalNames = names -> {
            for(int i=0; i<names.size();i++){
                names.set(i,names.get(i).toUpperCase());
            }
            return names;
        };

        List<String> upperCaseNames = capitalNames.firstName(originalNames);

        System.out.println("Uppercase Names: " + upperCaseNames);
    }
}
