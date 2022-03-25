
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> list = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Archive file = new Archive(identifier, name);
            
            if (list.contains(file)) {
                continue;
            }
            
            else {
                list.add(file);
            }
        }
        
        System.out.println("==items==");
        for (Archive files : list) {
            System.out.println(files);
        }

    }
}
