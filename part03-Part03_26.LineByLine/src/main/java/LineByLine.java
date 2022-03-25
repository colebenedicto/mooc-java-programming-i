
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            String phrase = scanner.nextLine();
            String[] pieces = phrase.split(" ");
            for (String parts: pieces) {
                System.out.println(parts);
                
            }
            
            if (phrase.equals("")) {
                break;
            }
        }
        
    }
}
