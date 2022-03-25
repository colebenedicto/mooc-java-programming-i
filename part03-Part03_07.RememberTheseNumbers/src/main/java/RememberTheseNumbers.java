
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            numbers.add(input);

        }
        
        // make a variable for the indices
        // set the condition 
        // increment the variable for index
        // code the instructions
        
        for(int i = 0; i < numbers.size(); i++) {
            int value = numbers.get(i);
            System.out.println(value);
        }        

    }
}
