package com.java.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIQuestions {
    public static void main(String[] args) {
        // Q1. Count frequency of strings in an array
        String[] strs = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Map<String, Long> collect = Arrays.stream(strs).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(collect);

        // Q2. Find the maximum number in a list
        List<Integer> list = Arrays.asList(5, 2, 9, 1, 6);
        // here we have used method referencing
        // max method returns optional result
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println(max.get());

        // Q3 Remove duplicates from a list
        List<Integer> list1 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinct = list1.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);

        // Q4 Convert list of Strings to Integers
        List<String> stringList = Arrays.asList("1", "2", "3", "4");
        List<Integer> collect1 = stringList.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(collect1);

        // Q5 Filter even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 50, 60, 80);
        List<Integer> collect2 = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(collect2);

        // Q6 Concatenate all strings in a list
        // Collectors.joining is used for join the strings in a list
        List<String> stringList1 = Arrays.asList("Java", "Stream", "API");
        String collect3 = stringList1.stream().collect(Collectors.joining());
        System.out.println(collect3);
        String[] strs1 = new String[]{"Java", "Stream", "API"};
        String collect4 = Arrays.stream(strs1).collect(Collectors.joining());
        System.out.println("String array list Joined: " + collect4);

        // Q7 Sort a list of strings
        List<String> stringList2 = Arrays.asList("banana", "apple", "orange");
        String comparingbasedOnCharacter = stringList2.stream().filter(s -> s.equals("apple")).findAny().orElse(null);
        System.out.println(comparingbasedOnCharacter);
        List<String> sortedList = stringList2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        // Q8 Find Sum and Average
        List<Integer> numberList = Arrays.asList(10, 20, 30, 40);
        int sum = numberList.stream().mapToInt(n -> n).sum();
        OptionalDouble average = numberList.stream().mapToInt(i -> i).average();
        System.out.println("sum: " + sum + " " + average);

        // Q9 Find Second-Highest Salary
        List<Integer> numberList1 = Arrays.asList(5000, 6000, 7000, 8000);
        Integer numberList2 = numberList1.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(numberList2);

        // Q10 Flatten list of lists
        List<List<Integer>> numberedList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
        List<Integer> flatList = numberedList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(flatList);

        // Q11 Find Duplicates
        List<Integer> numberList3 = Arrays.asList(1, 2, 3, 2, 4, 1);
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = numberList3.stream().filter(n -> !set.add(n)).collect(Collectors.toSet());
        System.out.println(duplicates);

        // Q12 Find Longest String
        List<String> stringList3 = Arrays.asList("apple", "banana", "pear");
        String longestString = stringList3.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(longestString);

        // Q13 Filter top 3 max numbers
        List<Integer> maxNumbersList = Arrays.asList(5, 1, 9, 2, 7);
        List<Integer> sortedListNumbers = maxNumbersList.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(sortedListNumbers);
    }
}
