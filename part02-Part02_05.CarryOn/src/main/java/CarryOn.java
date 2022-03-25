
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        while (true) {
            System.out.println("Shall we carry on? (type 'no' to stop)");
            String ans = scan.nextLine();
            
            if (ans.equals("no")) {
                break;
            }
        }
    }

}