/**
 * UseCase9PalindromeChecker
 *
 * Description: Checks whether a string is a palindrome
 * using recursion to compare characters from start and end indices.
 *
 * Key Concepts:
 * - Recursion
 * - Base condition to terminate recursion
 * - Call stack for method calls
 *
 * UC9: Recursive Palindrome Checker
 * Goal: Check palindrome using recursion.
 *
 * Flow:
 * 1. Recursive call compares start and end characters
 * 2. Base condition stops recursion
 * 3. Return true if all comparisons match
 * 4. Print result
 *
 * @author Ananya
 * @version 1.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point.
     * JVM starts execution from this method.
     *
     * @param args command line arguments (optional)
     */
    public static void main(String[] args) {

        // Define input string
        String input = "madam";

        // Call recursive function to check palindrome
        boolean isPalindrome = isPalindromeRecursive(input, 0, input.length() - 1);

        // Print the result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }

    /**
     * Recursive function to check palindrome
     *
     * @param str The input string
     * @param start The starting index
     * @param end The ending index
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base condition: if start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // If characters at start and end are not equal, not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recur for next inner pair
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}