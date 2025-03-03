import java.util.Scanner;

public class Bird {
    // Attributes
    private String breed;
    private int age;
    private String color;

    // Constructor to initialize the bird's attributes
    public Bird(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // Method to make the bird sing
    public void sing() {
        System.out.println("The " + breed + " bird is singing!");
    }

    // Method to return the bird's color
    public String getColor() {
        return color;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the bird's breed
        System.out.print("Enter the bird's breed: ");
        String breed = scanner.nextLine();

        // Prompt the user for the bird's age
        System.out.print("Enter the bird's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Prompt the user for the bird's color
        System.out.print("Enter the bird's color: ");
        String color = scanner.nextLine();

        // Create a Bird object
        Bird bird = new Bird(breed, age, color);

        // Make the bird sing
        bird.sing();

        // Get and display the bird's color
        System.out.println("The bird's color is: " + bird.getColor());

        // Close the scanner
        scanner.close();
    }
}