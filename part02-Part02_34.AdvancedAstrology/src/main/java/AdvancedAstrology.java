
public class AdvancedAstrology {

    public static void printStars(int number) {
        int repeat = 0;
        while (repeat < number) {
            System.out.print("*");       
            repeat++;
        } 
        
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int repeat = 1;
        while (repeat <= number) {
            System.out.print(" ");
            repeat++;
        }
    }

    public static void printTriangle(int size) {
        
        int i = 1;
        while (i <= size) {
            printSpaces(size - i);
            printStars(i);
            i++;
        }        
        
        /* 
         *the code enclosed in this paragra[h comment is the code I wrote
        
        int descent = 1;
        int width = size;
        
        while(descent <= size) {
            int space = width - 1;            
            
            printSpaces(space);
            width--;
            printStars(descent);
            descent++;           
        }
        */
    }

    public static void christmasTree(int height) {
        
        /*
        every descend; space = size - 1
        every width; stars = descend + (descend - 1)
        */
        int descent = 1;
        int width = height;
        
        while(descent <= height) {
            int space = width - 1;
            int nextLine = descent + (descent -1);
            
            printSpaces(space);
            width--;
            printStars(nextLine);
            descent++;           
        }

        printSpaces(height - 2);
        printStars(3);           
        printSpaces(height - 2);
        printStars(3);                   
        
        /* the code below is from mooc.fi tmc solutions
        
        int i = 1;
        while (i <= height) {
            printSpaces(height - i);
            printStars(i + (i - 1));
            i++;
        }
 
        // End then the bottom.
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);        
        */
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printTriangle(5);
        christmasTree(4);
        christmasTree(10);
        
    }
}
