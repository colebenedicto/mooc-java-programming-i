
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        int greatest = list.get(0); //set the default greates number to first index
        
        for (int i = 0; i < list.size(); i++) {
            int currentNum = list.get(i); //make a variable to compare the greatest to
            if (greatest < currentNum) {  //if the greatest is less than the current num, it means that it is not the greatest number...
                greatest = currentNum;    //so we set the value of currentNum as the greatest
            }                             //loop continues
        } 
        
        System.out.println("The greatest number: " + greatest);

    }
}
