
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last Number? ");
        int lastNum = Integer.valueOf(scanner.nextLine());
        int sequence = 0;

        int i = 0;
        while (i <= lastNum) {
            sequence += i;
            i++; 
        }

        System.out.println(sequence);
    }
}
