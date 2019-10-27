
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String reversed_text = "";
        for (int i = text.length() - 1; i > -1; i--) {
            reversed_text += text.charAt(i);
        }
        return reversed_text.equals(text);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
