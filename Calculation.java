package Calculator;

import java.util.Scanner;

public class Calculation {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Print a welcome message
        System.out.println("Welcome to the calculator!");
        
        // Prompt the user to enter the first number
        System.out.println("Please enter the first number:");
        int num1 = input.nextInt(); // Read the first number
        
        // Prompt the user to enter the second number
        System.out.println("Please enter the second number:");
        int num2 = input.nextInt(); // Read the second number
        
        // Prompt the user to select an arithmetic operation
        System.out.println("1. Enter 1 to find the sum");
        System.out.println("2. Enter 2 to find the multiplication");
        System.out.println("3. Enter 3 to find the division");
        System.out.println("4. Enter 4 to find the modulus");
        int choice = input.nextInt(); // Read the user's choice
        
        // Perform the selected arithmetic operation using a switch statement
        switch (choice) {
            case 1:
                System.out.println("The sum = " + (num1 + num2));
                break;
            case 2:
                System.out.println("The multiplication = " + (num1 * num2));
                break;
            case 3:
                System.out.println("The division = " + (num1 / num2));
                break;
            case 4:
                System.out.println("The modulus = " + (num1 % num2));
                break;
            default:
                // Display an error message for an invalid choice
                System.out.println("Please enter a correct number!");
        }
        
        input.close();
    }
}
