import java.util.Stack;
public class UC5_PalindromeCheckerApp {
    public static void check() {
        String word = "radar";
        Stack<Character> stack = new Stack<>();
        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome (Using Stack).");
        } else {
            System.out.println(word + " is NOT a Palindrome (Using Stack).");
        }
    }
}
