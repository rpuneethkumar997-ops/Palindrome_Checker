/**
 * ================================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This program checks whether a given string is a palindrome
 * using a separate PalindromeChecker service class.
 *
 * Key Concepts:
 * - Encapsulation
 * - Single Responsibility Principle
 */

import java.util.Scanner;

/**
 * PalindromeChecker class encapsulates palindrome logic.
 */
class PalindromeChecker {

    /**
     * Checks if the input string is a palindrome.
     * @param input The string to check
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        // Normalize input by removing non-alphanumeric and converting to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/**
 * Application entry point for UC11.
 */
public class rPalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Is Palindrome: " + result);

        scanner.close();
    }
}