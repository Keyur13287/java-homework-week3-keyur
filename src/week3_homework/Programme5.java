package week3_homework;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
public class Programme5 {

    public void salaryslip(int id, String name, double salary){
      double HRA = salary*0.10;
       double DA = salary*0.08;
        //System.out.printlnDA;
       double TA = salary*0.09;
       double PF = salary*0.20;

       double grossSalary= ((salary+HRA+TA+DA)-PF);

        System.out.println("| Salary Slip |");

        System.out.println("|______________________________|");
        System.out.println("| Employee Id :  "+id+"        |");
        System.out.println("| Employee Name : "+name+"     |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary : "+salary+"    |");
        System.out.println("| HRA 10% : "+HRA+"            |");
        System.out.println("| TA 8% : "+TA+"               |");
        System.out.println("| DA 9% : "+DA+"               |");
        System.out.println("| PF - 20%: "+PF+"             |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary : "+grossSalary+" |");
        System.out.println("|================================|");

    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Programme5 obj =  new Programme5();
        System.out.println("Enter the Employee id");
        int id= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the employee name");
        String name= scan.nextLine();
        System.out.println("");
        System.out.println("Enter the basic salary");
        double basicSalary= scan.nextDouble();


        obj.salaryslip(id,name,basicSalary);
    }
}
