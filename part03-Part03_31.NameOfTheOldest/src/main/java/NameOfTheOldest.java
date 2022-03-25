
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfOldest = "no one"; 
        int oldest = -1;
        
        while (true) {
            String data = scanner.nextLine();
            
            if (data.equals("")) {
                break;
            }
            
            String[] namesAndAges = data.split(",");
            
            String name = namesAndAges[0];
            int age = Integer.parseInt(namesAndAges[1]);
            
            if (age > oldest) {
                oldest = age;
                nameOfOldest = name;
            }
        }
        
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
