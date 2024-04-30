package week3_homework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Programme8 obj= new Programme8();
        System.out.println("Enter the alphabet from A to F");
        String input= scan.nextLine().toUpperCase();
        String result= obj.cityname(input);
        System.out.println("The selected alphabet"+input+" and selected city :"+result);

    }
    public String cityname(String input){
        String cityname;
        if (input.equals("A")){
           return cityname="New york";
        } else if (input.equals("B")){
            return cityname="Argentina";
        } else if (input.equals("C")){
            return cityname="Chicago";
        } else if (input.equals("D")){
            return cityname="Miami";
        } else if (input.equals("E")) {
            return cityname="Ahmedabad";
        }
        else {
            return cityname="Invalid Entry";
        }


        }
    }

