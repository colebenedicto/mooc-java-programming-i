import java.util.Scanner;
import java.util.ArrayList;

public class LastInList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scan.nextLine();
            if (input.equals("")) {
                break;
            }
            
            list.add(input);
        }
        
        int index = list.size() - 1; // first identify the index
        String lastValue = list.get(index); // then, use that index as the parameter to the .get() command
        System.out.println(lastValue);
        
        /* the process in line 19 to line 21 can be summarized below
        System.out.println(list.get(list.size() - 1));
        */
        
    }
    
}
