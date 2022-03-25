
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);
        
        System.out.println("Give a string: ");
            String text = scanned.nextLine();
        System.out.println("Give an integer: ");
            int number = Integer.valueOf(scanned.nextLine());
        System.out.println("Give a double: ");
            double floating = Double.valueOf(scanned.nextLine());
        System.out.println("Give a boolean: ");
            boolean bool = Boolean.valueOf(scanned.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + floating);
        System.out.println("You gave the boolean " + bool);
    }
}
