package main.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 1, 7, 11};
        System.out.println("Original array is:");
        System.out.println(Arrays.toString(numbers));
        Integer[] newNumbers = convertArray(numbers);
        Arrays.sort(newNumbers, Collections.reverseOrder());
        System.out.println("Sorted by desc array is:");
        System.out.println(Arrays.toString(newNumbers));

        int[] numbersToSum = {13, 23, 50, -2, 153, -5, -16};
        System.out.println("\nOriginal array to find a sum of positive elements is:");
        System.out.println(Arrays.toString(numbersToSum));
        System.out.println("The sum of all positive numbers is:");
        System.out.println(sumOfArrayElements(numbersToSum, true));

        int[] numbersToFindAverage = {132, 15, 67, 22};
        System.out.println("\nOriginal array to find an average value is:");
        System.out.println(Arrays.toString(numbersToFindAverage));
        System.out.println("The average value of all numbers is:");
        System.out.println((float) sumOfArrayElements(numbersToSum, false) / numbersToSum.length);

        ArrayList<String> numbersArrayList = new ArrayList<>(Arrays.asList("One", "Two", "Tree", "Four"));
        System.out.println("\nOriginal ArrayList is:");
        System.out.println(numbersArrayList);
        numbersArrayList.set(numbersArrayList.indexOf("Tree"), "Three");
        System.out.println("Corrected ArrayList is:");
        System.out.println(numbersArrayList);

        ArrayList<Integer> newNumbersArrayList = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));
        System.out.println("\nOriginal ArrayList is:");
        System.out.println(newNumbersArrayList);
        removeUnnecessaryElements(newNumbersArrayList);
        System.out.println("Updated ArrayList (removed all numbers that are divisible by 3) is:");
        System.out.println(newNumbersArrayList);
    }

    static Integer[] convertArray(int[] oldArray) {
        Integer[] newArray = new Integer[oldArray.length];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    static int sumOfArrayElements(int[] array, boolean onlyPositives) {
        int result = 0;
        for (int el : array) {
            if (onlyPositives && el <= 0) {
                continue;
            }
            result += el;
        }
        return result;
    }

    static void removeUnnecessaryElements(ArrayList<Integer> arrayList) {
        arrayList.removeIf(el -> el % 3 == 0);
    }
}
