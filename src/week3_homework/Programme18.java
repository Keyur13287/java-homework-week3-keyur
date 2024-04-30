package week3_homework;

import java.util.Arrays;

/**
 *  Write a Java program to calculate the average value of array elements
 */
public class Programme18 {
    public static void main(String[] args) {
        int[] array = {5, 20, 8, 10, 9, 4};
        sum(array);

    }
    public static void sum(int array[]){
        int sum = Arrays.stream(array).sum();
        System.out.println("Sum of the arrays: " + sum);
    }
}
