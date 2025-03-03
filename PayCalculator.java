import java.util.Scanner;

public class PayCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for hourly wage
        System.out.print("Enter your hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        // Prompt the user for hours worked
        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // Calculate the gross salary
        double grossSalary = hourlyWage * hoursWorked;

        // Calculate the tax (30% of gross salary)
        double tax = grossSalary * 0.30;

        // Calculate the net salary after tax deduction
        double netSalary = grossSalary - tax;

        // Output the results
        System.out.printf("Gross Salary: $%.2f%n", grossSalary);
        System.out.printf("Tax Deducted (30%%): $%.2f%n", tax);
        System.out.printf("Net Salary: $%.2f%n", netSalary);

        // Close the scanner
        scanner.close();
    }
}