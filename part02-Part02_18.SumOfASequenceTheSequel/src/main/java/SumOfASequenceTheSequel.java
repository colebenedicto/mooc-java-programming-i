
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number? ");
        int i = Integer.valueOf(scanner.nextLine());
        System.out.println("Last Number? ");
        int lastNum = Integer.valueOf(scanner.nextLine());
        
        int sequence = 0;
        while (i <= lastNum) {
            sequence += i;
            i++; 
        }
        
        System.out.println(sequence);
    }
}
