/**
 * UC3: Palindrome Check Using String Reverse
 *
 * Goal:
 * Reverse a string and compare with original.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Check if user provided input
        if (args.length == 0) {
            System.out.println("Please provide input string");
            return;
        }

        String input = args[0];
        String reversed = "";

        // Reverse using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Compare strings
        if (input.equals(reversed)) {
            System.out.println("Input: " + input);
            System.out.println("Palindrome: true");
        } else {
            System.out.println("Input: " + input);
            System.out.println("Palindrome: false");
        }
    }
}