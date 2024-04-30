package week3_homework;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2
 */
public class Programme7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Programme7 obj= new Programme7();
        System.out.println("Enter Sales ID:");
        int salesId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter Seller's Name:");
        String sellerName = scanner.nextLine();

        System.out.println("Enter Sales Amount:");
        double salesAmount = scanner.nextDouble();

        System.out.println("Enter Basic Salary:");
        double basicSalary = scanner.nextDouble();
        obj.commission(salesId,basicSalary,salesAmount,sellerName);

    }
    public void commission(double salesId,double basicSalary, double salesAmount, String sellerName ){
        double commissionRate;
        if (salesAmount >= 50000) {
            commissionRate = 0.35;
        } else if (salesAmount >= 30000) {
            commissionRate = 0.20;
        } else if (salesAmount >= 20000) {
            commissionRate = 0.10;
        } else if (salesAmount >= 10000) {
            commissionRate = 0.05;
        } else {
            commissionRate = 0.02;
        }

        // Calculate commission amount
        double commissionAmount = salesAmount * commissionRate;

        // Total salary including commission
        double totalSalary = basicSalary + commissionAmount;

        // Display results
        System.out.println("\nSales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: $" + salesAmount);
        System.out.println("Commission Rate: " + (commissionRate * 100) + "%");
        System.out.println("Commission Amount: $" + commissionAmount);
        System.out.println("Total Salary: $" + totalSalary);
    }
}
