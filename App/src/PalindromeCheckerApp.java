/**
 * UseCasePalindromeChecker
 *
 * Description: Checks whether a string is a palindrome
 * using a Stack data structure.
 *
 * - Pushes characters into a stack
 * - Pops characters to reverse order
 * - Compares with original characters
 *
 * Key Concepts:
 * - Stack (LIFO)
 * - Push and Pop operations
 * - Boolean flag logic
 *
 * UC5: Stack-Based Palindrome Checker
 * Goal: Use stack to reverse characters and validate palindrome.
 *
 * Flow:
 * 1. Push characters into stack
 * 2. Pop and compare with original string
 * 3. Print result
 *
 * @author Ananya
 * @version 1.0
 */
import java.util.Stack;

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     * JVM starts execution from this method.
     *
     * @param args command line arguments (optional)
     */
    public static void main(String[] args) {

        // Input string to check (hardcoded for now)
        String input = "noon";

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character from input into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume the string is a palindrome
        boolean isPalindrome = true;

        // Compare original string with stack reversed characters
        for (char c : input.toCharArray()) {
            if (stack.pop() != c) {
                isPalindrome = false;
                break; // Stop early if mismatch found
            }
        }

        // Print the result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}