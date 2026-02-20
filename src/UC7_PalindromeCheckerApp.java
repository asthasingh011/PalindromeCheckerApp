import java.util.Deque;
import java.util.LinkedList;

public class UC7_PalindromeCheckerApp {
    public static void check() {
        String word = "rotor";
        Deque<Character> deque = new LinkedList<>();
        for (char ch : word.toCharArray()) {
            deque.addLast(ch);
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome (Using Deque).");
        } else {
            System.out.println(word + " is NOT a Palindrome (Using Deque).");
        }
    }
}
