
import java.util.Scanner;

public class InAHoleInTheGround {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        System.out.println("How many times? ");
        int repeatBy = Integer.valueOf(scanner.nextLine());
        
        while (count < repeatBy) {
            printText();
            count++;
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}