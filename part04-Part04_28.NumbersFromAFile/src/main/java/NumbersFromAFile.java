
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int count = 0; //what we wish to print
        
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                int number = Integer.valueOf(scan.nextLine());
                
                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
            }
        }
        
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
            
        System.out.println("Numbers: " + count);
            
    }

}
