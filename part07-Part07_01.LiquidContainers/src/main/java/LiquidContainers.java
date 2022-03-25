
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        
        Scanner scan = new Scanner(System.in);
                
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.println("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]); 
            
            if (command.equals("add")) {
                if (amount < 0) {
                    first += 0;
                } else if (first + amount < 100) {
                    first += amount;
                } else {
                    first = 100;
                }
                
            }
                    
            if (command.equals("move")) {
                if (first - amount < 0) {
                    second += first;
                    first -= 0;
                } else if (second + amount < 100) {
                    second += amount;
                    first -= amount;
                } else {
                    second = 100;
                    first -= amount;
                }
            } 
            
            if (command.equals("remove")) {
                if (second - amount > 0) {
                    second -= amount;
                } else {
                    second = 0;
                }
                
            }
            
        }
        
    }

}
