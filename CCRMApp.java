package edu.ccrm.cli;

import java.util.Scanner;

/**
 * The main application class for the Campus Course & Records Manager (CCRM).
 * This class provides a menu-driven command-line interface for the user.
 */
public class CCRMApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            printMenu();
            int choice = 0;
            try {
                choice = scanner.nextInt();
                // Consume the rest of the line to avoid issues with next input
                scanner.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input from the scanner
                continue; // Continue to the next loop iteration
            }

            switch (choice) {
                case 1:
                    // TODO: Call the method for student management
                    System.out.println("Student Management selected.");
                    break;
                case 2:
                    // TODO: Call the method for course management
                    System.out.println("Course Management selected.");
                    break;
                case 3:
                    // TODO: Call the method for enrollment and grades
                    System.out.println("Enrollment & Grades selected.");
                    break;
                case 4:
                    // TODO: Call the method for file operations
                    System.out.println("File Operations selected.");
                    break;
                case 5:
                    // TODO: Call the method for reports
                    System.out.println("Reports selected.");
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    /**
     * Prints the main menu options to the console.
     */
    private static void printMenu() {
        System.out.println("\n--- Campus Course & Records Manager ---");
        System.out.println("1. Manage Students");
        System.out.println("2. Manage Courses");
        System.out.println("3. Manage Enrollment & Grades");
        System.out.println("4. File Operations (Import/Export/Backup)");
        System.out.println("5. Reports");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
}

