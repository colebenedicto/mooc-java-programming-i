
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static void sort(int[] array) {
        System.out.println("SELECTION SORT");
        System.out.println(Arrays.toString(array) + "\n");
        
        for (int i = 0; i < array.length; i++) {
            int currentIndex = MainProgram.indexOfSmallestFrom(array, i);
            
            MainProgram.swap(array, currentIndex, i);
            
            System.out.println("Iteration " + (i + 1) + ": ");
            System.out.println(Arrays.toString(array));
        }
    }
    
    public static int smallest(int[] array) {  
        int smallest = 1000;
        for (Integer num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int i = 0;
        while (i < array.length) {
            if (MainProgram.smallest(array) == array[i]) {
                return i;
            }
            i++;
        }
        return i;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestNum = 1000;
        int index = -1;
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallestNum) {
                smallestNum = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
