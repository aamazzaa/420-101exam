import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        // Create an ArrayList to store bird colors
        ArrayList<String> birdColors = new ArrayList<>();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to add bird colors to the zoo
        System.out.println("Add bird colors to the zoo (type 'done' to finish):");
        while (true) {
            System.out.print("Enter the bird's color: ");
            String color = scanner.nextLine();

            // Exit the loop if the user types 'done'
            if (color.equalsIgnoreCase("done")) {
                break;
            }

            // Add the color to the ArrayList
            birdColors.add(color);
        }

        // Count the number of blue birds
        int blueBirdCount = 0;
        for (String color : birdColors) {
            if (color.equalsIgnoreCase("blue")) {
                blueBirdCount++;
            }
        }

        // Output the number of blue birds
        System.out.println("Number of blue birds in the zoo: " + blueBirdCount);

        // Close the scanner
        scanner.close();
    }
}