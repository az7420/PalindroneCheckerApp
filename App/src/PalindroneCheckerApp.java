public class PalindroneCheckerApp{
    public class UseCase2PalindromeCheckerApp {

        public static void main(String[] args) {

            // Hardcoded string
            String word = "madam";

            // Check palindrome
            String reversed = "";
            for(int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }

            // Print result
            if(word.equals(reversed)) {
                System.out.println(word + " is a Palindrome");
            } else {
                System.out.println(word + " is not a Palindrome");
            }

        }
    }
}
