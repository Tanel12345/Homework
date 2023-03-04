package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainForPractice {
    public static void main(String[] args) {
//        Using streams, for a given lists:
//        - [„John", „Sarah", „Mark", „Tyla", „Ellisha", „Eamonn"]
//        - [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
//        a) Sort the list.
//                b) Print only those names, that start with „E” letter.
//                c) Print values greater than 30 and lower than 200.
//        d) Print names uppercase.
//                e) Remove first and last letter, sort and print names.
//                f) *Sort backwards by implementing reverse Comparator and using lambda
//        expression.
        List<String> names = List.of("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> numbers = List.of(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);

        List<String> collect = names.stream()
                .sorted()
                .collect(Collectors.toList());//sorted names list

        System.out.println(collect);
        System.out.println();
        System.out.println("-----------Names start with E----------------------------------------------------");
        System.out.println();



        names.stream()
                .filter(str -> str.startsWith("E"))
                .forEach(str -> System.out.println(str));
        System.out.println();

        System.out.println("---------------Values greater than 30 and lower than 200------------------------------------------------");
        System.out.println();

        Predicate<Integer> p = number -> number > 30;
        numbers.stream()
                .filter(number -> number > 30)
                .filter(number -> number <= 200 )
                .forEach(x -> System.out.println(x));

        System.out.println("---------------Values greater than 30 and lower than 200, with method reference in forEach and one filter method with &&-----------------------------------------------");


        numbers.stream().filter( number -> number > 30 && number <=200 ).forEach(System.out::println);

        System.out.println();

        System.out.println("---------------Print names to uppecase.------------------------------------------------");

        names.stream().forEach(str -> {
            System.out.println(str.toUpperCase());
        });

        System.out.println();

        System.out.println("---------------Remove first and last letter, sort and print names.------------------------------------------------");

        names.stream().sorted()

                .map(str -> str.substring(1, str.length() - 1))
                .forEach(System.out::println);

        System.out.println();

        System.out.println("---------------*Sort backwards by implementing reverse Comparator and using lambda------------------------------------------------");

        names.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
//        names.stream().sorted(Comparator.comparing(Comparator.comparing(String::toString)));

//        Given the code above and your knowledge
//        Create an object Ship with fields: name, color, engineType, age
//        Create a stream of 5 instances of the Ship object
//        a) Sort ship by name.
//                b) Print only ships of orange color
//                c) Print all ship names

        System.out.println();

        System.out.println("---------------Create a stream of 5 instances of the Ship object------------------------------------------------");

        List<Ship> ships = new ArrayList<>();
                ships.add(new Ship("Titanic","Black","Waterheat",100));
                ships.add(new Ship("Atomic","White","Waterheat",100));
                ships.add(new Ship("Estonia","Blue","Waterheat",40));
                ships.add(new Ship("Atlantic","Green","Waterheat",78));
                ships.add(new Ship("Longship","Red","Waterheat",150));

        System.out.println();

        System.out.println("---------------Unsorted ship list------------------------------------------------");

        ships.forEach(System.out::println);

        System.out.println();

        System.out.println("---------------sorted ship list------------------------------------------------");

        ships.stream().sorted((a,b) -> a.getName().compareTo(b.getName())).forEach(System.out::println);

        System.out.println();

        System.out.println("---------------sorted ship list-with comparator class-----------------------------------------------");

        ships.stream().sorted(Comparator.comparing(Ship::getName)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println();

        System.out.println("---------------sorted ships with blue color-----------------------------------------------");

        ships.stream().sorted(Comparator.comparing(Ship::getName)).filter(ship -> ship.getColor() == "Blue").collect(Collectors.toList()).forEach(System.out::println);
        System.out.println();

        System.out.println("---------------print ship names-----------------------------------------------");

        ships.stream().sorted(Comparator.comparing(Ship::getName)).collect(Collectors.toList()).forEach(ship -> {
            System.out.println(ship.getName());
        });
    }
}
