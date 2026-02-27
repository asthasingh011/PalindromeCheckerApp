import java.util.Scanner;
public class UC9_PalindromeCheckerApp{
    public static boolean isPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Recursive Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        input = input.replaceAll("\\s+", "").toLowerCase();
        boolean result = isPalindrome(input, 0, input.length() - 1);
        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }
        sc.close();
    }
}