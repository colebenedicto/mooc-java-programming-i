import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            String phrase = scan.nextLine();
            if (phrase.equals("")) {
                break;
            }
            
            String[] words = phrase.split(" ");
            System.out.println(words[words.length - 1]);
        }
        
    }

}
