package week3_homework;
/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

import java.util.Scanner;

public class Programme11 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter 1 for divisible by 3 and enter 2 for divisible by 5");
        int a= in.nextInt();
        if (a==3){
            divisibleBy3();
        }
        else if(a==5) {
            divisibleBy5();
        } else {
            //System.out.println("Enter correct number");
        }
    }
    // Method to print numbers divisible by 3
    public static void divisibleBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to print numbers divisible by 5
    public static void divisibleBy5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
