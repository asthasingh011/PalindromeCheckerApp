import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class UC6_PalindromeCheckerApp{
    public static void check() {
        String word = "deed";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char ch : word.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome (Using Queue + Stack).");
        } else {
            System.out.println(word + " is NOT a Palindrome (Using Queue + Stack).");
        }
    }
}
