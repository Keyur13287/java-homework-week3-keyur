package week3_homework;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = scan.nextInt();
        Programme1 obj = new Programme1();
        String result = obj.evenOdd(a);
        System.out.println("The given number " + a + " is " + result);
        scan.close();
    }

    public String evenOdd(int a) {
        String answer = (a % 2 == 0) ? "Even" : "Odd";
        return answer;
    }
}
