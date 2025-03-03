import java.util.Scanner;
import java.time.Year;

public class AgeCalculator {
    public static String calculateAge(int birthYear) {
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;
        
        if (age > 16) {
            return "You are " + age + " years old.";
        } else if (age < 16) {
            int yearsRemaining = 16 - age;
            return "You are " + age + " years old. You will turn 16 in " + yearsRemaining + " years.";
        } else {
            return "You are 16 years old.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        System.out.println(calculateAge(birthYear));
        scanner.close();
    }
}