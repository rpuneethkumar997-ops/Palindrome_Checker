/**
 * UseCase8PalindromeChecker
 *
 * Description: Checks whether a string is a palindrome
 * using a LinkedList to demonstrate sequential node access
 * and removal from both ends.
 *
 * - Converts the string into a LinkedList of characters
 * - Removes first and last characters iteratively
 * - Compares characters to validate palindrome
 *
 * Key Concepts:
 * - LinkedList (Singly/Doubly)
 * - Node traversal
 * - removeFirst() & removeLast() operations
 * - Logical comparison for palindrome
 *
 * UC8: Linked List Based Palindrome Checker
 * Goal: Check palindrome using singly linked list.
 *
 * Flow:
 * 1. Convert string to LinkedList
 * 2. Remove first and last nodes
 * 3. Compare characters
 * 4. Print result
 *
 * @author Ananya
 * @version 1.0
 */
import java.util.LinkedList;

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     * JVM starts execution from this method.
     *
     * @param args command line arguments (optional)
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        // Create LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character from string into the LinkedList
        for(char c : input.toCharArray()) {
            list.add(c);
        }

        // Assume the string is a palindrome initially
        boolean isPalindrome = true;

        // Compare first and last elements until 0 or 1 element remains
        while(list.size() > 1) {
            if(list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}