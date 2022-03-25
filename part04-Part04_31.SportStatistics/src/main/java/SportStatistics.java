
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String filename = scan.nextLine();
        
        System.out.println("Team: ");
        String teamname = scan.nextLine();
        
        ArrayList<String> games = new ArrayList<>();
        
        int i = 0;
        int wins = 0;
        int losses = 0;
        
        try (Scanner scanner = new Scanner(Paths.get(filename))) {
            
            while (scanner.hasNextLine()) {
                String rows = scanner.nextLine();
                String[] gameInfo = rows.split(",");
                
                String team1 = gameInfo[0];
                String team2 = gameInfo[1];
                int team1Score = Integer.valueOf(gameInfo[2]);
                int team2Score = Integer.valueOf(gameInfo[3]);
                
                if (team1.equals(teamname)) {
                    if (team1Score > team2Score) {
                        wins++;
                    } else {
                        losses++;
                    }
                    i++;
                } 
                
                if (team2.equals(teamname)) {
                    if (team2Score > team1Score) {
                        wins++;
                    } else {
                        losses++;
                    }
                    i++;
                }
                
            }
            
            System.out.println("Games: " + i);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        
        } catch (Exception e) {
            System.out.println("Errors: " + e.getMessage());
        }
        
        
    }

}
