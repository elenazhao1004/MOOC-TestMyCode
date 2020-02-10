
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        //printWithSmileys("87.");
        //printWithSmileys("Beerbottle");
        printWithSmileys("Interface");

    }

    private static void printWithSmileys(String characterString) {
        if (characterString.length() % 2 == 1) {
            characterString += " ";
        }
        int length = characterString.length();// String变化完再定义length长度。
        int time = (length) / 2 + 3;

        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                System.out.println(":) " + characterString + " :)");
            } else {
                for (int j = 0; j < time; j++) {
                    System.out.print(":)");
                }
                System.out.println("");//for loop外，换行的作用
            }
        }
    }

}
