package week3_homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Write a Java program to test if an array contains a specific value.
 */
public class Programme20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        // Input the value to search for
        System.out.print("Enter the value to search for: ");
        int value = scanner.nextInt();
        containvalue(array,value);

    }
    public static void containvalue(int[] array, int value){
        boolean containsValue = Arrays.stream(array).anyMatch(x -> x == value);

        // Display the result
        if (containsValue) {
            System.out.println("The array contains the value " + value);
        } else {
            System.out.println("The array does not contain the value " + value);
        }
    }
}
