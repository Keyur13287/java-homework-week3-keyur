package week3_homework;

import java.util.Arrays;

/**
 *  Write a Java program to sort a numeric array and a string array.
 */
public class Programme17 {
    public static void main(String[] args) {
        // Numeric array
        int numericArray[] = {5, 2, 8, 1, 9, 4};
        // String array
        String stringArray[] = {"apple", "banana", "orange", "grape", "kiwi"};
        sort(numericArray,stringArray);
    }
    public static void sort(int numericArray[],String stringArray[]){
        // Sorting numeric array
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

        // Sorting string array
        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    }
    }

