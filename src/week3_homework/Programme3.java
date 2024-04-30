package week3_homework;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________
 */

public class Programme3 {

    public int total(int a, int b, int c) {
        int total = a + b + c;
        return total;
    }

    public int percentage(int a, int b, int c) {
        int percentage = total(a, b, c) / 3;
        return percentage;
    }

    public String result(int a, int b, int c) {
        if (percentage(a, b, c) >= 35 || percentage(a, b, c) <= 100) {
            return "pass";
        } else {
            return "fail";
        }

        // return total;
    }

    public String grade(int a, int b, int c) {
        if (percentage(a, b, c) >= 80 && percentage(a, b, c) <= 100) {
            return "A+";
        } else if (percentage(a, b, c) >= 60 && percentage(a, b, c) < 80) {
            return "A";
        } else if (percentage(a, b, c) >= 50 && percentage(a, b, c) < 60) {
            return "B";
        } else if (percentage(a, b, c) >= 35 && percentage(a, b, c) < 50) {
            return "A";
        } else {
            return "F";
        }
    }

    public void display(int a, int b, int c, String name, int roll) {
        System.out.println("_______________________________");
        System.out.println(" | |");
        System.out.println("| Mark Sheet |");
        System.out.println("|_______________________________|");
        System.out.println("| Name :  |" + name);
        System.out.println(" | Roll No:   |" + roll);
        System.out.println("|_______________________________|");
        System.out.println("| Subjects : Marks              |");
        System.out.println("|_______________________________|");
        System.out.println("| Math :       |" + a);
        System.out.println("| Science :     |" + b);
        System.out.println("| English :     |" + c);
        System.out.println("|_______________________________|");
        System.out.println("| Total :       |" + total(a, b, c));
        System.out.println("|_______________________________|");
        System.out.println(" | Percentage : |" + percentage(a, b, c));
        System.out.println("| Result :      |" + result(a, b, c));
        System.out.println(" | Grade :      |" + grade(a, b, c));
        System.out.println("|_______________________________");


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Student Name :");
        String name = in.nextLine();
        System.out.println("Enter the ROll No:");
        int roll = in.nextInt();
        System.out.println("Enter the marks of Maths");
        int math = in.nextInt();
        System.out.println("Enter the marks of Science");
        int science = in.nextInt();
        System.out.println("Enter the marks of English");
        int english = in.nextInt();
        Programme3 obj = new Programme3();
        if ((math >= 0 && math <= 100) && (science >= 0 && science <= 100) && (english >= 0 && english <= 100)) {
            obj.total(math, science, english);
            obj.percentage(math, science, english);
            obj.result(math, science, english);
            obj.grade(math, science, english);
            obj.display(math, science, english, name, roll);

        } else {
            System.out.println("Its invalid Input !!!  Enter the Valid Marks ");
        }
    }

}
