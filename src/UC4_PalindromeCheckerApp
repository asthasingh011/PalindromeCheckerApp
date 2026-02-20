public class UC4_PalindromeCheckerApp {
    public static void check() {
        String word = "level";
        char[] chars = word.toCharArray();
        boolean isPalindrome = true;
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome (Using Character Array).");
        } else {
            System.out.println(word + " is NOT a Palindrome (Using Character Array).");
        }
    }
}
