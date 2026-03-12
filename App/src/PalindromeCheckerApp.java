/**
 * UseCase7PalindromeChecker
 *
 * Description: Checks whether a string is a palindrome
 * using a Deque (Double-Ended Queue) to efficiently compare
 * characters from both front and rear.
 *
 * - Inserts characters into a deque
 * - Removes first and last characters iteratively
 * - Compares them to validate palindrome
 *
 * Key Concepts:
 * - Deque (Double-Ended Queue)
 * - Front & Rear access
 * - Optimized data handling without extra reversal structures
 *
 * UC7: Deque-Based Optimized Palindrome Checker
 * Goal: Use Deque to compare front and rear elements.
 *
 * Flow:
 * 1. Insert characters into deque
 * 2. Remove first & last characters
 * 3. Compare until deque is empty or mismatch found
 * 4. Print result
 *
 * @author Ananya
 * @version 1.0
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     * JVM starts execution from this method.
     *
     * @param args command line arguments (optional)
     */
    public static void main(String[] args) {

        // Step 1: Define the input string to check
        String input = "refer";

        // Step 2: Create a Deque (Double-Ended Queue) to store characters
        // Deque allows insertion and removal from both ends (front & rear)
        Deque<Character> deque = new ArrayDeque<>();

        // Step 3: Add each character of the input string into the deque
        for (char c : input.toCharArray()) {
            deque.add(c); // Adds to the rear by default
        }

        // Step 4: Assume the string is a palindrome initially
        boolean isPalindrome = true;

        // Step 5: Compare characters from front and rear until deque has 0 or 1 element
        while (deque.size() > 1) {
            // Remove and compare first and last characters
            if (deque.removeFirst() != deque.removeLast()) {
                // If mismatch found, it's not a palindrome
                isPalindrome = false;
                break; // Exit loop immediately on mismatch
            }
        }

        // Step 6: Print the input string
        System.out.println("Input: " + input);

        // Step 7: Print whether the string is a palindrome
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}