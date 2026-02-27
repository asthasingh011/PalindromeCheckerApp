import java.util.Scanner;
class PalindromeChecker {
    
    public boolean checkPalindrome(String input) {
        
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        char[] chars = normalized.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
public class UC11_PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Object-Oriented Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);
        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}
