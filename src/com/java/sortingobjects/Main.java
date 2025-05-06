package com.java.sortingobjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // Simple Comparable Sorting
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(5, "Prathamesh", 24);
        empArr[1] = new Employee(1, "Bhavesh", 20);
        empArr[2] = new Employee(2, "Ram", 21);
        empArr[3] = new Employee(9, "Nilesh", 25);
        Arrays.sort(empArr);
        System.out.println("sorted: " + Arrays.toString(empArr));

        // Sorting using Comparator
        Employee[] empArr1 = new Employee[4];
        empArr1[0] = new Employee(5, "Prathamesh", 24);
        empArr1[1] = new Employee(1, "Bhavesh", 20);
        empArr1[2] = new Employee(2, "Ram", 21);
        empArr1[3] = new Employee(9, "Nilesh", 25);
        Arrays.sort(empArr1, Employee.nameComparator);
        System.out.println("sorted: " + Arrays.toString(empArr1));

        // Sorting using Comparator based on age
        Employee[] empArr2 = new Employee[4];
        empArr2[0] = new Employee(5, "Prathamesh", 24);
        empArr2[1] = new Employee(1, "Bhavesh", 20);
        empArr2[2] = new Employee(2, "Ram", 21);
        empArr2[3] = new Employee(9, "Nilesh", 25);
        Arrays.sort(empArr2, Employee.ageComparator);
        System.out.println("sorted: " + Arrays.toString(empArr2));
    }
}
