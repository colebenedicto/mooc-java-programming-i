
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numCount = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scan.nextLine());
            
            if (number == 0) {
                break;
            }
            
            numCount++;
            sum = sum + number;
        
        }

        System.out.println("Average of the numbers: " + ((double)sum / numCount));
    }
    
}