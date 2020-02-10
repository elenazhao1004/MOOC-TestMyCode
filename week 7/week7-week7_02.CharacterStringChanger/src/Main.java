public class Main {
    public static void main(String[] args) {
        Changer test = new Changer();
        test.addChange(new Change('a', '!'));
        test.addChange(new Change('c', '!'));
        System.out.println(test.change("ajdjcjk"));
    }
}
