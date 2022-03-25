
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
        
            list.add(input);
        
        }
        
        int smallest = list.get(0);      
        for (int i = 0; i < list.size(); i++) {
            int currentNum = list.get(i);
            if (smallest > currentNum) {
                smallest = currentNum;
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        
        for (int index = 0; index < list.size(); index++)
            if (smallest == list.get(index)) {
                System.out.println("Found at index: " + index);    
        }         
        
    }
    
}
