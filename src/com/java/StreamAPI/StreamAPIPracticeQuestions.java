package com.java.StreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPIPracticeQuestions {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "John", "Doe", "Jane");
        Set<String> set = new HashSet<>();
        Set<String> duplicates = names.stream().filter(n -> !set.add(n)).collect(Collectors.toSet());
        System.out.println(duplicates);

        // Q. Convert list of strings to map and count them
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Long> frequencyMap = words.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(frequencyMap);

        // Q. Get the longest String in a list
        List<String> stringList3 = Arrays.asList("apple", "banana", "pear");
        Optional<String> longestString = stringList3.stream().max(Comparator.comparingInt(String::length));
        System.out.println(longestString);

        // Q. flatten the list
        List<List<String>> nested = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d")
        );

        List<String> collect = nested.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);

        List<String> names1 = Arrays.asList("Alice", "Bob", "Anna", "alex", "Ankit");
        List<String> listStartsWithA = names1.stream().filter(a -> a.startsWith("A")).collect(Collectors.toList());
        System.out.println(listStartsWithA);

        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 3);
        List<Integer> reverseOrderedList = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseOrderedList);

        List<String> duplicateList = Arrays.asList("Tom", "Jerry", "Tom", "Spike");
        List<String> duplicateList1 = duplicateList.stream().distinct().collect(Collectors.toList());
        System.out.println(duplicateList1);

        List<String> list = Arrays.asList("", "", "Hello", "World");
        String s1 = list.stream().filter(s -> s != "").findFirst().get();
        System.out.println(s1);

        // Find Element that appears more than once in lists
        /*
          groupingBy(Function.identity(), counting()): counts how many times each name appears.
          filter(entry -> entry.getValue() > 1): keeps only names with a count > 1.
          map(Map.Entry::getKey): extracts the name.
          collect(...): gathers the result into a list.
         */
        List<String> namesList2 = Arrays.asList("Tom", "Jerry", "Tom", "Spike", "Jerry", "Tom");
        List<String> collect1 = namesList2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(s -> s.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect1);

        List<String> wordsList = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> frequencyMap2 = wordsList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap2);

        String name = "hello world";
        Map<Character, Long> frequencyMap3 = name.chars().filter(c -> c != ' ').mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap3);
    }

}
