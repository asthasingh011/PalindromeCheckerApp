import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Deque;
public class UseCasePalindromeCheckerApp {
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "1.0";

    public static void main(String[] args) {

        // ===== UC1: Welcome Message =====

            System.out.println("=====================================");
            System.out.println(" Welcome to Palindrome Checker App ");
            System.out.println(" Version: 1.0 ");
            System.out.println("=====================================");
            System.out.println("This application checks whether a given string is a palindrome.");
        // ===== UC2: Hardcoded Palindrome Check =====

        // Hardcoded string
        String word = "madam";

        // Reverse string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome condition
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
        // ===== UC3: Palindrome Check Using String Reverse =====
        String wordUC3 = "racecar";  // Example string
        String reversedUC3 = "";

// Reverse the string using loop
        for (int i = wordUC3.length() - 1; i >= 0; i--) {
            reversedUC3 = reversedUC3 + wordUC3.charAt(i);
        }

// Compare original and reversed
        if (wordUC3.equals(reversedUC3)) {
            System.out.println(wordUC3 + " is a Palindrome (Using String Reverse).");
        } else {
            System.out.println(wordUC3 + " is NOT a Palindrome (Using String Reverse).");
        }
        // ===== UC4: Character Array Based Palindrome Check =====
        String wordUC4 = "level";  // Example string
        char[] charsUC4 = wordUC4.toCharArray();  // Convert to char array

        boolean isPalindromeUC4 = true;
        int start = 0;
        int end = charsUC4.length - 1;

// Two-pointer comparison
        while (start < end) {
            if (charsUC4[start] != charsUC4[end]) {
                isPalindromeUC4 = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindromeUC4) {
            System.out.println(wordUC4 + " is a Palindrome (Using Character Array).");
        } else {
            System.out.println(wordUC4 + " is NOT a Palindrome (Using Character Array).");
        }
        // ===== UC5: Stack-Based Palindrome Checker =====import java.util.Stack;

        String wordUC5 = "radar";  // Example string
        Stack<Character> stack = new Stack<>();

// Push all characters onto stack
        for (int i = 0; i < wordUC5.length(); i++) {
            stack.push(wordUC5.charAt(i));
        }

// Pop characters to form reversed string
        String reversedUC5 = "";
        while (!stack.isEmpty()) {
            reversedUC5 += stack.pop();
        }

// Compare original and reversed
        if (wordUC5.equals(reversedUC5)) {
            System.out.println(wordUC5 + " is a Palindrome (Using Stack).");
        } else {
            System.out.println(wordUC5 + " is NOT a Palindrome (Using Stack).");
        }
        String wordUC6 = "deed";  // Example string

        Queue<Character> queue = new LinkedList<>();  // FIFO
        Stack<Character> stackUC6 = new Stack<>();    // LIFO

// Enqueue and push characters
        for (int i = 0; i < wordUC6.length(); i++) {
            char ch = wordUC6.charAt(i);
            queue.add(ch);      // Enqueue
            stackUC6.push(ch);  // Push
        }

// Compare dequeue vs pop
        boolean isPalindromeUC6 = true;
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stackUC6.pop();  // Pop
            if (fromQueue != fromStack) {
                isPalindromeUC6 = false;
                break;
            }
        }

        if (isPalindromeUC6) {
            System.out.println(wordUC6 + " is a Palindrome (Using Queue + Stack).");
        } else {
            System.out.println(wordUC6 + " is NOT a Palindrome (Using Queue + Stack).");
        }
        String wordUC7 = "rotor";  // Example string
        Deque<Character> deque = new LinkedList<>();

// Insert characters into deque
        for (int i = 0; i < wordUC7.length(); i++) {
            deque.addLast(wordUC7.charAt(i));  // Add to rear
        }

// Compare front and rear until deque is empty or mismatch found
        boolean isPalindromeUC7 = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear) {
                isPalindromeUC7 = false;
                break;
            }
        }

        if (isPalindromeUC7) {
            System.out.println(wordUC7 + " is a Palindrome (Using Deque).");
        } else {
            System.out.println(wordUC7 + " is NOT a Palindrome (Using Deque).");
        }
    }
}