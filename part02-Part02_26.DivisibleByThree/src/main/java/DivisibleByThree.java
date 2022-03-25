

public class DivisibleByThree {

    public static void main(String[] args) {
        
        divisibleByThreeInRange(2, 15);

    }
    
    public static void divisibleByThreeInRange(int beginning, int end) { 
        
        while (end >= beginning) {
            if (beginning % 3 == 0) {
                System.out.println(beginning);
            }
            
            beginning++;
        }
  
    }

}
