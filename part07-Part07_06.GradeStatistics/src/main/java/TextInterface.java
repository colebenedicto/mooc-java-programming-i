import java.util.Scanner;

public class TextInterface {

    private Scanner scanner;
    private GradeBook gradeBook;

    public TextInterface(Scanner scanner, GradeBook gradeBook) {

        this.gradeBook = gradeBook;
        this.scanner = scanner;

    }
    
    /**
     * start - prompts the main to run. must show instructions of what to input.
     */

    public void start() {

        System.out.println("Enter point totals, -1 stops:");
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            
            if (value == -1) {
                gradeBook.print();
                break;
            } else {
                gradeBook.addGrade(value);
            }
            
        }

    }

}