import java.util.*;

/**
 * UseCase6PalindromeChecker
 *
 * Description: Checks whether a string is a palindrome
 * using both a Queue (FIFO) and a Stack (LIFO) to demonstrate
 * the behavioral difference between these data structures.
 *
 * - Enqueues characters into a queue
 * - Pushes characters into a stack
 * - Compares dequeue vs pop to validate palindrome
 *
 * Key Concepts:
 * - Queue (FIFO)
 * - Stack (LIFO)
 * - Enqueue & Dequeue operations
 * - Pop operation
 * - Logical comparison for palindrome
 *
 * UC6: Queue + Stack Based Palindrome Check
 * Goal: Demonstrate FIFO vs LIFO using Queue and Stack.
 *
 * Flow:
 * 1. Enqueue characters into queue
 * 2. Push characters into stack
 * 3. Compare dequeue vs pop
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

        // Input string to check
        String input = "civic";

        // Create a queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);   // Enqueue character
            stack.push(c);  // Push character
        }

        // Assume the string is a palindrome
        boolean isPalindrome = true;

        // Compare queue (FIFO) with stack (LIFO)
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break; // Stop early if mismatch found
            }
        }

        // Print input and result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}