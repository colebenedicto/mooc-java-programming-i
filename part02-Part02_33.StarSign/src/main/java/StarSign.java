
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        printSquare(4);
        printRectangle(11, 2);
        printTriangle(4);
    }

    public static void printStars(int number) {
        // first part of the exercise
        int repeat = 1;
        while (repeat <= number) {
            System.out.print("*");       
            repeat++;
        }
        
        System.out.println("");
        
    }

    public static void printSquare(int size) {
        
        int newLine = 1;
        while (newLine <= size) {
            printStars(size);
            newLine++;
        }
    }

    public static void printRectangle(int width, int height) {
        
        int nextLine = 1;       
        while (nextLine <= height) {
            printStars(width);
            nextLine++;
        }

    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int nextDescent = 1;
        int width = 1;
        while (nextDescent <= size) {
            printStars(width);
            nextDescent++;
            width++;
        }
    }
}
