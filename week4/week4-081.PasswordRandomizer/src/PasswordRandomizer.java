import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String pw = "";
        for (int i = 0; i < this.length; i++){
            char alpa = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
            pw += alpa;
        }
        return pw;
    }
}
