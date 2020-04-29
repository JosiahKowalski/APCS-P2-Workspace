import java.util.Scanner;
/**
 * Tests the RecursivePalindrome class with user input.
 *
 * @author Josiah Kowalski
 * @version 03/03/20
 */
public class RecursivePalindromeTester {

    public static void main(String[] args) {
        RecursivePalindrome palindrome = new RecursivePalindrome();
        Scanner in = new Scanner(System.in);
        boolean Continue = true;
        while (Continue) {
            System.out.println("Enter a word or phrase to check if it is a palindrome (enter q to quit)");
            String input = in.nextLine();
            if (input.equals("q")) {
                Continue = false;
            }
            else {
                boolean isPalindrome = palindrome.checkIfPalindrome(input);
                if (isPalindrome) {
                    System.out.println("Your input was a palindrome.");
                }
                else {
                    System.out.println("Your input was not a palindrome.");
                }
            }
        }
    }
}