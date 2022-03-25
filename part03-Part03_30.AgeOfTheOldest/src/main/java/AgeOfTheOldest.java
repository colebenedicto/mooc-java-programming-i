
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = -1;
        
        while (true) {
            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            }
            
            String[] parts = data.split(",");
            int age = Integer.valueOf(parts[1]);
            if (age > oldest) {
                oldest = age;
            }
        }
        
        System.out.println("The oldest is: " + oldest);

    }
}
