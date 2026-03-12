/**
 * ================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 13: Performance Comparison of Palindrome Algorithm
 *
 * Objective:
 * Design a console-based Java program that checks if a string
 * is a palindrome and measures the execution time of the algorithm.
 *
 * Key Concepts:
 * - System.nanoTime() for measuring execution time
 * - Stack data structure for palindrome logic
 * - String normalization (ignoring case and non-alphanumeric chars)
 */

import java.util.Stack;
import java.util.Scanner;

// Define a common interface for palindrome algorithms
interface PalindromeStrategy {
    // Method to check if a string is palindrome
    boolean check(String input);
}

// Implementation using Stack
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        // Normalize the string: remove non-alphanumeric characters and convert to lower case
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters to the stack
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from stack
        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false; // Not a palindrome
            }
        }

        return true; // Palindrome
    }
}

// Main class containing program entry point
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input from user
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Step 2: Create an instance of StackStrategy (our algorithm)
        PalindromeStrategy strategy = new StackStrategy();

        // Step 3: Measure execution time
        long startTime = System.nanoTime();
        boolean result = strategy.check(input); // Check palindrome
        long endTime = System.nanoTime();

        // Step 4: Display results
        // Line 1: Palindrome result
        System.out.println("Is Palindrome : " + result);

        // Line 2: Execution time in nanoseconds
        System.out.println("Execution time : " + (endTime - startTime) + " ns");

        // Close scanner
        scanner.close();
    }
}