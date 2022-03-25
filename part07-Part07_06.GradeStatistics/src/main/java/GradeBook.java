import java.util.ArrayList;
import java.lang.String;

public class GradeBook {

    private ArrayList<Integer> grades;

    public GradeBook() {
        this.grades = new ArrayList<>();
    }

    /**
     * Methods:
     * addGrade - adds grade inputted to the AttayList
     * averageOfPoints - (double) returns the average of all the valid points
     * averageOfPassedPoints - (double) returns the average of passed points
     * passPercentage - (double) returns the percentage of passed points
     * gradeDistribution - (void) shows the distribution of points
     * printGrades - (String) prints all the grades. 
     */
    
    public void addGrade(int gradeToAdd) {
        if (gradeToAdd >= 0 && gradeToAdd <= 100) {
            grades.add(gradeToAdd);
        }
    }
    
    public double averageOfPoints() {
        double sumOfPoints = 0.0;
        
        for (Integer points : grades) {
            sumOfPoints += points;
        }
        
        return sumOfPoints / grades.size();
    }
    
    public double averageOfPassedPoints() {
        double sumOfPassedPoints = 0.0;
        int countOfPassedPoints = 0;
        
        for (Integer points : grades) {
            if (points >= 50) {
                sumOfPassedPoints += points;
                countOfPassedPoints++;
            }
        }
        
        return sumOfPassedPoints / countOfPassedPoints;
    }

    public double passPercentage() {
        double countOfPassedPoints = 0;
        
        for (Integer points : grades) {
            if (points >= 50) {
                countOfPassedPoints++;
            }
        }
        
        return 100 * (countOfPassedPoints / grades.size());
    }
    
    public void gradeDistribution() {
        int[] gradeArr = new int[6];
        
        for (int grade : this.grades) {

            if (grade >= 90) {
                gradeArr[0]++;
            } else if (grade <= 89 && grade > 79) {
                gradeArr[1]++;
            } else if (grade <= 79 && grade > 69) {
                gradeArr[2]++;
            } else if (grade <= 69 && grade > 59) {
                gradeArr[3]++;
            } else if (grade <= 59 && grade > 49) {
                gradeArr[4]++;
            } else if (grade <= 49) {
                gradeArr[5]++;
            }

        }
        
        System.out.println("Grade distribution:");
        int gradDistIndex = 5;
        
        for (int e : gradeArr) {
            System.out.print(gradDistIndex + ":");
            
            for (int i = 0; i < e; i++) {
                System.out.print("*");
            }

            System.out.print("\n"); //line break
            gradDistIndex--;
        }
        
//        System.out.println("\nGrade Distribution:");
//        System.out.println("5:" + "*".repeat(five));
//        System.out.println("4:" + "*".repeat(four));
//        System.out.println("3:" + "*".repeat(three));
//        System.out.println("2:" + "*".repeat(two));
//        System.out.println("1:" + "*".repeat(one));
//        System.out.println("0:" + "*".repeat(zero));
    }
    
    public void print() {
        System.out.println("Point average (all): " + String.format("%.1f", averageOfPoints()));
        System.out.println("Point average (passing): " + String.format("%.1f", averageOfPassedPoints()));
        System.out.println("Pass percentage: " + passPercentage());
        
        gradeDistribution();
        
    }
}