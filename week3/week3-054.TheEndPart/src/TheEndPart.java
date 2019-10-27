import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());
        System.out.print("Result: " + word.substring(word.length()-length,word.length()));
        //Tip!!! 总个数-后半部分个数= 前半部分个数（这个个数也就是后半部分第一个数的index!!)
    }
}
