public class PalindroneCheckerApp {
    public static void main(String[] args) {

        String word = "Madam";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        // Reverse the normalized string
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Check palindrome
        if (normalized.equals(reversed)) {
            System.out.println(word + " is a Palindrome (ignoring case and spaces)");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}