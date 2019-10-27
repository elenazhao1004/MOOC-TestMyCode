
public class PrintingLikeBoss {
    
    public static void printStars(int amount) {
        for(int i = 0; i< amount; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
            
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            printWhitespaces(size - i - 1);
            printStars(i + 1);
            
        }
    }

    public static void xmasTree(int height) {
        for(int i = 0; i < height; i++) {
            printWhitespaces(height - i - 1);
            printStars(2 * i + 1); // base largest size
            //printWhitespaces(height - i - 1); // no need to print the rest blank in the line
            
        }
        for (int i = 0; i < 2; i++){
                printWhitespaces(height-2); // [(2i+1)-3]/2; tip: i=height-1
                printStars(3);
                //printWhitespaces(height - 2);// no need
            }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
