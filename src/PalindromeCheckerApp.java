import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     WELCOME TO PALINDROME APP   ");
        System.out.println("=================================");

        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        // Remove spaces and special characters
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Check palindrome
        if (cleaned.equals(reversed)) {
            System.out.println("It is a Palindrome ✅");
        } else {
            System.out.println("It is NOT a Palindrome ❌");
        }

        scanner.close();
    }
}