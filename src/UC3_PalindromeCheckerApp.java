public class UC3_PalindromeCheckerApp {
    public static void check() {
        String word = "racecar";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome (Using String Reverse).");
        } else {
            System.out.println(word + " is NOT a Palindrome (Using String Reverse).");
        }
    }
}
