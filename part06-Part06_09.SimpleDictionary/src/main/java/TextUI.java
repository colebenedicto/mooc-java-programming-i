
import java.util.Scanner;


public class TextUI {
    private Scanner scan;
    private SimpleDictionary words;
    
    public TextUI(Scanner scan, SimpleDictionary words) {
        this.scan = scan;
        this.words = words;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("Command:");
            String input = scan.nextLine();
            
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (input.equals("add")) {
                System.out.println("Word:");
                String word = scan.nextLine();
                System.out.println("Translation:");
                String translation = scan.nextLine();
                
                words.add(word, translation);
                continue;
            }
            
            if (input.equals("search")) {
                System.out.println("To be translated:");
                String findTranslation = scan.nextLine();
                
                if (words.translate(findTranslation) == null) {
                    System.out.println("Word " + findTranslation + " is not found");
                } else {
                    System.out.println("Translation: " + words.translate(findTranslation));
                }
            }
            
            else {
                System.out.println("Unknown command");
            }
        }
    }
}
