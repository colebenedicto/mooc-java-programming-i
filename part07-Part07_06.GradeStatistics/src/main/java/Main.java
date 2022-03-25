
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeBook gradeBook = new GradeBook();

        TextInterface txtInterface = new TextInterface(scanner, gradeBook);
        txtInterface.start();
    }
}

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> pointsList = new ArrayList<>();
//                
//        System.out.println("Enter point totals, -1 stops:");
//        
//        while (true) {
//            int points = Integer.valueOf(scanner.nextLine());
//            if (points == -1) {
//                break;
//            }
//            
//            if (points >= 0 && points <= 100) {
//                pointsList.add(points);
//            }
//        }
//        
//        double sumOfAllPoints = 0.0;
//        double sumOfPassedPoints = 0.0;
//        double passedPointsCount = 0.0;
//        int zero = 0, one = 0, two = 0, three = 0, four = 0, five = 0;
//        
//        for (Integer points : pointsList) {
//           sumOfAllPoints += points;
//           if (points >= 50) {
//               sumOfPassedPoints += points;
//               passedPointsCount++;
//           }
//           
//           if (points < 50) {
//               zero++;
//           } else if (points >= 50 && points < 60) {
//               one++;
//           } else if (points >= 60 && points < 70) {
//               two++;
//           } else if (points >= 70 && points < 80) {
//               three++;
//           } else if (points >= 80 && points < 90) {
//               four++;
//           } else {
//               five++;
//           }
//        }
//        
//        System.out.println("Point average (all): " + String.format("%.1f",sumOfPoints / grades.size()));
//        System.out.println("Point average (passing): " + String.format("%.1f", sumOfPassedPoints / passedPointsCount));
//        System.out.println("Pass percentage: " + String.format("%.1f",(100 * (passedPointsCount / grades.size()))));
//        
//        System.out.println("\nGrade Distribution:");
//        System.out.println("5:" + "*".repeat(five));
//        System.out.println("4:" + "*".repeat(four));
//        System.out.println("3:" + "*".repeat(three));
//        System.out.println("2:" + "*".repeat(two));
//        System.out.println("1:" + "*".repeat(one));
//        System.out.println("0:" + "*".repeat(zero));
//    }
//
//}
