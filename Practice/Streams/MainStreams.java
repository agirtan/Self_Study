package Practice.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainStreams {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6);
//        List<String> strings = List.of("Jon","Joe","Bogdan");
        numbers.stream()
                .filter(x->x % 2 ==1)
                .forEach(System.out::println);

        Stream<Integer> integerStream = numbers.stream()
                .peek(System.out::println)
                .filter(x->x%2==1)
                .peek(System.out::println)
                .filter(x->x<3)
                .peek(System.out::println);

        System.out.println(integerStream.toList());


        List<String> names = List.of("John", "Joe","Bogdan");
        names.stream()
                .sorted(Comparator.comparing(String :: length));

//filter out the strings whose length is greater than 3 from a list of strings

        List<String> list = List.of("Alex","Andrei","Jon","Bianca","Ion");
        list.stream()
                .filter(s -> s.length()>3)
                .forEach(System.out::println);


    }
}
