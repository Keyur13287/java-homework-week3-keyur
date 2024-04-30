package week3_homework;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Year");
        int a = scan.nextInt();
        leapYear(a);

        scan.close();
    }

    public static void leapYear(int year) {
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            System.out.println("The given year " + year + " is : Leap Year");
        } else {
            System.out.println("The given year " + year + " is not a Leap Year");
        }

    }
}
