import java.util.Scanner;
import java.util.ArrayList;

public class OnlyTheseNumbers {

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        ArrayList<Integer> number = new ArrayList<>();
        while(true) {
            int index = Integer.valueOf(scan.nextLine());
            if (index == -1) {
                break;
            }
            number.add(index);
        }
        
        System.out.println("From where? ");
        int beginningIndex = Integer.valueOf(scan.nextLine());
        System.out.println("To where? ");
        int endingIndex = Integer.valueOf(scan.nextLine());
           
        for (int i = beginningIndex; i <= endingIndex; i++) {
            System.out.println(number.get(i));
        }
    }

}