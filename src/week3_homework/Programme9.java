package week3_homework;

import java.util.Scanner;

/**
 * Same as above program-8 using switch statement.
 */
public class Programme9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Programme9 obj = new Programme9();
        System.out.println("Enter the alphabet from A to F");
        String input = scan.nextLine().toUpperCase();
        String result = obj.city(input);
        System.out.println("The selected alphabet " + input + " corresponds to the city: " + result);

    }

    public String city(String input) {
        String city;
        switch (input) {
            case "A":
                city = "New York";
                break;
            case "B":
                city = "Argentina";
                break;
            case "C":
                city = "Chicago";
                break;
            case "D":
                city = "Miami";
                break;
            case "E":
                city = "Ahmedabad";
                break;
            default:
                city = "Invalid Entry";
                break;
        }
        return city;
    }
}
