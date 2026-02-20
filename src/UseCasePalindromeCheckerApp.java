/**
 * PalindromeChecker App
 * Version: 1.0
 * A console-based application to check whether a string is a palindrome.
 */

public class PalindromeChecker {

    // Application constants
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "1.0";

    /**
     * Main method - Entry point of the application
     * JVM invokes this method automatically.
     */
    public static void main(String[] args) {

        displayWelcomeMessage();

        // Placeholder for next use case (Palindrome validation logic)
        System.out.println("\nApplication is ready to check palindromes...");
    }

    /**
     * Displays application welcome message
     */
    private static void displayWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println(" Welcome to " + APP_NAME);
        System.out.println(" Version: " + VERSION);
        System.out.println("=====================================");
        System.out.println("This application checks whether a given string is a palindrome.");
    }
}