import java.util.*;
public class UC13_PalindromeCheckerApp {
    public static boolean twoPointer(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = normalized.length() - 1;
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean stackMethod(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }
        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
    public static boolean reverseMethod(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Performance Comparison of Palindrome Algorithms ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        long start1 = System.nanoTime();
        boolean result1 = twoPointer(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;
        long start3 = System.nanoTime();
        boolean result3 = reverseMethod(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;
        System.out.println("\nResults:");
        System.out.println("Two Pointer Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Method Result: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Reverse Method Result: " + result3 + " | Time: " + time3 + " ns");
        sc.close();
    }
}
