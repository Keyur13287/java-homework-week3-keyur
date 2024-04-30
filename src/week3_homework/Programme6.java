package week3_homework;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Programme6 obj = new Programme6();
        System.out.println("Enter the number: ");
        int number=in.nextInt();
        obj.oddEven(number);
        in.close();
    }
    public void oddEven(int num){
        if (num/2==0){
            System.out.println("The given number is even");
        }
        else {
            System.out.println("The given number is odd");
        }
    }
}
