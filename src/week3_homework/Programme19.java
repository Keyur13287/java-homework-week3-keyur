package week3_homework;

import java.util.Arrays;

public class Programme19 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 4};
        average(array);
    }
    public static void average(int array[]){
        double avg = Arrays.stream(array).average().orElse(Double.NaN);
        System.out.println("Sum of the arrays: " + avg);
    }
}
