public class Printing {

    public static void printStars(int amount) {
        int i = 0;
        while(i < amount){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        for(int i = 0; i < sideSize; i++){
            printStars(sideSize);
        }
    }

    public static void printRectangle(int width, int height) {
        for(int i = 0; i < height; i++){            
            printStars(width);  
        }
    }

    public static void printTriangle(int size) {
        for(int i = 0; i < size; i++){
            printStars(i+1);
        } 
    }

    public static void main(String[] args) {
        printStars(3);
        printStars(5);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }
}
