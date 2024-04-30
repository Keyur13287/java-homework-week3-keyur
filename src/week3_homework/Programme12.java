package week3_homework;
/**
 *  Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class Programme12 {
    static void charCheck(char input_char) {

        if ((input_char >= 65 && input_char <= 90)
                || (input_char >= 97 && input_char <= 122))
            System.out.println(" Alphabet ");

        else if (input_char >= 48 && input_char <= 57)
            System.out.println(" Digit ");

        else
            System.out.println(" Special Character ");
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char value=in.next().charAt(0);

        //char input_char = '$';
        charCheck(value);
    }
}
