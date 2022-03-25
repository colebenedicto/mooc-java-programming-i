
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // part 1: reading
        System.out.println("Give numbers:");
              
        int input = 0;
        // part 2: sum of numbers
        int sum = 0;
        // part 3: number count
        int count = 0;
        // part 4: average
        double ave = 0;
        // part 5: even and odd number count
        int even = 0;
        int odd = 0;

        while (true) {
            input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            // inserted for part 5
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            // inserted for part 2
            sum += input;
            // inserted for part 3
            count++;
            // inserted for part 4
            ave = (double) sum / count;
 
        }
        
        // inserted for part 2
        System.out.println("Sum: " + sum);
        // inserted for part 3
        System.out.println("Numbers: " + count);
        // inserted for part 4
        System.out.println("Average: " + ave);
        // inserted for part 5
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
