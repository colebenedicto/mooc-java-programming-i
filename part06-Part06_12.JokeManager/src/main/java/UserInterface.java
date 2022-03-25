
import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.scanner = scanner;
        this.jokes = jokes;
    }
    
    public void start() {
        System.out.println("What a joke!");
        
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
        
            switch (command) {
                case "1" :
                    System.out.println("Write the joke to be added:");
                    String joke = scanner.nextLine();
                    jokes.addJoke(joke);
                    continue;
                    
                case "2" :
                    System.out.println("Drawing a joke.");
                    System.out.println(jokes.drawJoke());
                    continue;
            
                case "3" :
                    System.out.println("Printing the jokes.");
                    jokes.printJokes();
                    continue;
            
                case "X" :
                    isTrue = false;
                    break;
                    
                default :
                    System.out.println("Unknown Command");
            }
        }    
    }
}
