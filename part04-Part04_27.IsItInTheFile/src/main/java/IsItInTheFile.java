
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        boolean isFound = false;
        
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String fileName = scan.nextLine();
            
            if (fileName.contains(searchedFor)) {
                isFound = true;
            }
        
            }
            if (isFound) {
                System.out.println("Found!"); 
            } else {
                System.out.println("Not found.");
            }
            
        }    
        
        catch (Exception e) {
            System.out.println("Reading the file " + file + "failed.");
        }

    }
}
