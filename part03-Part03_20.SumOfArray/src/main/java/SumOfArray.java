
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 7};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        
        /*
        we will use the for-each loop because we do not need to consider the index number
        when doing the task the program requires us. the int variable num is assigned by us
        to name the indices of the array named array.
        */
        
        int sum = 0;
        for (int num: array) { 
            sum += num;
        }
        return sum;
    
    }
}
