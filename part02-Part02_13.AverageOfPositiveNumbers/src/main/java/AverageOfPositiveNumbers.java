
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            
            if (number > 0) {
                numCount++;
                sum = sum + number;
                continue;
            }
            
        }
        
        if (numCount == 0) {
            System.out.println("Cannot calculate the average");
        }
        
        System.out.println( (double)sum / numCount );
    }
    
}