package week3_homework;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Programme10 obj = new Programme10();
        System.out.println("Enter the first value");
        int num1 = scan.nextInt();
        System.out.println("Enter the second value");
        int num2 = scan.nextInt();
        System.out.println("Enter the arithmatic operator (+ , - , * , / ):");
        char operator = scan.next().charAt(0);
        int result = obj.operation(num1, num2, operator);
        System.out.println(result);

    }

    public int operation(int num1, int num2, char operator) {
        int result;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                return 0;

            }
        } else {

            return 0;
        }
    return result;
    }
}

