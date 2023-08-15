package main.java.com.georgescuconstantin.exercises.javaAdvanced.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(3, 6, 78, 54, 2, 21);
        List<String> names = Arrays.asList("Ion", "Vasile", "Ana", "Rares", "Costi", "Ioana", "Carmen", "Adrian");

        returnStringsStartingWithA(names);
        System.out.println("-------------");
        convertStringToUpperCase(names);
        System.out.println("--------------");
        System.out.println(convertStringToUpperCaseWithCollectors(names));
        System.out.println("----------------");
        System.out.println(returnStringsStartingWithAWithCollectors(names));
        System.out.println("----------------");
        System.out.println(returnCommaSeparatedString(integers));
        System.out.println("----------------");
        System.out.println(average(integers));
        System.out.println("-----------------");
        System.out.println(sortArrayAscending(integers));
        System.out.println("-----------------");
        System.out.println(sortArrayDescending(integers));


    }


    public static Double average(List<Integer> list) {
        return list.stream().mapToInt(i -> i)
                .average()
                .getAsDouble();
    }

    public static List<Integer> sortArrayAscending(List<Integer> integerList) {
        return integerList.stream().sorted().collect(Collectors.toList());
    }

    public static List<Integer> sortArrayDescending(List<Integer> integerList) {
        return integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static void convertStringToUpperCase(List<String> strings) {
        strings.stream()
                .map(e -> e.toUpperCase(Locale.ROOT))
                .forEach((name) -> System.out.println(name));
    }

    public static List<String> convertStringToUpperCaseWithCollectors(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void returnStringsStartingWithA(List<String> strings) {
        strings.stream()
                .filter(s -> s.startsWith("A"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));
    }

    public static List<String> returnStringsStartingWithAWithCollectors(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("A"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }

    public static String returnCommaSeparatedString(List<Integer> integers) {
        return integers.stream()
                .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
                .collect(Collectors.joining(","));
    }
}
