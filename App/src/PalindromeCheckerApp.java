/**
 * PalindromeCheckerApp
 *
 * Description:
 * Checks whether a predefined string is a palindrome
 * using the two-pointer technique.
 *
 * - Compares characters from both ends
 * - Stops immediately if mismatch found
 *
 * @author Student
 * @version 2.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Predefined string
        String str = "madam";

        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Output
        System.out.println("Input text: " + str);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}

