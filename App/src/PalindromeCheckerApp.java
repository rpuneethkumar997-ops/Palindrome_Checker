/**
 * ================================================================
 * MAIN CLASS - PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms (Advanced)
 *
 * Description:
 * Checks if a string is palindrome using Stack strategy internally.
 */

import java.util.Scanner;
import java.util.Stack;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        // Normalize input
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) return false;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    private PalindromeStrategy strategy;

    public PalindromeCheckerApp() {
        // Use StackStrategy internally
        this.strategy = new StackStrategy();
    }

    public boolean check(String input) {
        return strategy.check(input);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        PalindromeCheckerApp app = new PalindromeCheckerApp();

        boolean result = app.check(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}