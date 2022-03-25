
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName = "";
        int sum = 0;
        int quantity = 0;
        
        while (true) {
            String data = scanner.nextLine();
            
            
            if (data.equals("")) {
                break;
            }
            
            String[] namesAndBirth = data.split(",");
                String name = namesAndBirth[0];
                    if (name.length() > longestName.length()) {
                        longestName = name;
                    }
                double birthYear = Double.parseDouble(namesAndBirth[1]);
                sum += birthYear;
                quantity++;
                    
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of birth years: " + 1.0 * sum / quantity);

    }
}
