

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(2);

    }
    
    public static void printFromNumberToOne(int number) {
        int count = 1;
        
        while (number >= count) {
            System.out.println(number);
            number--;
        }
    
    }

}
