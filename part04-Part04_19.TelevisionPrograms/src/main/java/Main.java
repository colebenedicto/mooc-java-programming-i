import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name: ");
            String progName = scanner.nextLine();
            if (progName.isEmpty()) {
                break;
            }
            
            System.out.println("Duration: ");
            int progDuration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(progName, progDuration));
        }
        
        System.out.println("Program's maximum duration? ");
        int limit = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram prog: programs) {
            if (prog.getDuration() <= limit) {
                System.out.println(prog);
            }
        }

    }
}
