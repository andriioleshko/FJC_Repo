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

        int[] numbersToFindAverage = {132, 15, -2, 67, 22};
        System.out.println("\nOriginal array to find an average value is:");
        System.out.println(Arrays.toString(numbersToFindAverage));
        System.out.println("The average value of all numbers is:");
        System.out.println((float) sumOfArrayElements(numbersToFindAverage, false) / numbersToFindAverage.length);

        ArrayList<String> numbersArrayList = new ArrayList<>(Arrays.asList("One", "Two", "Tree", "Four"));
        System.out.println("\nOriginal ArrayList is:");
        System.out.println(numbersArrayList);
        numbersArrayList.set(numbersArrayList.indexOf("Tree"), "Three");
        System.out.println("Corrected ArrayList is:");
        System.out.println(numbersArrayList);

        ArrayList<Integer> newNumbersArrayList = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));
        System.out.println("\nOriginal ArrayList is:");
        System.out.println(newNumbersArrayList);
        int divider = 3;
        removeUnnecessaryElements(newNumbersArrayList, divider);
        System.out.printf("Updated ArrayList (removed all numbers that are divisible by %d) is:\n", divider);
        System.out.println(newNumbersArrayList);

        String objMethods = "Here is a method summary for Object in Java:";
        objMethods += "\n-> clone()\n-> equals(Object obj)\n-> finalize()\n-> getClass()\n-> hashCode()\n-> notify()";
        objMethods += "\n-> notifyAll()\n-> toString()\n-> wait()\n-> wait(long timeout)\n-> wait(long timeout, int nanos)";
        System.out.printf("\n%s", objMethods);

        System.out.println("\n\n");
        System.out.println("""
                Arrays in Java have fixed size because they are implemented as a contiguous block of memory and need specified amount of memory to be reserved when it's initialized.
                Because of that JVM can directly access needed element of array by calculating in the easy form the exact memory address where it's stored (using memory address of the first element, using the size of the declared type of data stored in this array and multiplying by the index of the element).
                It is quicker than the same operation for ArrayList or LinkedList.\s""");
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
            if (el > 0 || (el < 0 && !onlyPositives)) {
                result += el;
            }
        }
        return result;
    }

    static void removeUnnecessaryElements(ArrayList<Integer> arrayList, int divider) {
        arrayList.removeIf(el -> el % divider == 0);
    }
}
