/**
 * PalindromeCheckerApp
 *
 * Description: Checks whether a string is a palindrome
 * using character array comparison with two-pointer technique.
 *
 * - Converts string to char array
 * - Compares characters from both ends
 * - Stops early if mismatch found
 *
 * Key Concepts:
 * - Arrays
 * - Two-pointer technique
 * - Boolean flag logic
 *
 * @author Student
 * @version 1.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point.
     * JVM starts execution from this method.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize the input string
        String input = "radar";

        // Convert the string into a character array
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning of the array
        int start = 0;

        // Initialize pointer at the end of the array
        int end = chars.length - 1;

        // Assume the string is palindrome initially
        boolean isPalindrome = true;

        // Compare characters from both ends moving inward
        while (start < end) {

            // If mismatch found, it is not a palindrome
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            // Move pointers toward center
            start++;
            end--;
        }

        // Display input and result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}