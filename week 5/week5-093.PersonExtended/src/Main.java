public class Main {
  public static void main(String[] args) {
    // write test code here
    Person jing = new Person("Jing", 4, 10, 1947);
    Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
    Person steve = new Person("Steve");
    
    System.out.println( jing.getName() + " age " + jing.age() + " years");
    System.out.println( pekka );
    System.out.println( steve );
  }
}
