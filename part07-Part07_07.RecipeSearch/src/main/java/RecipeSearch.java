
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    //class for handles the file io and creating the objs from the file. 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RecipeList recipeList = new RecipeList();

        System.out.println("File to read: ");

        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            ArrayList<String> fileLines = new ArrayList<>(); //create arraylist of the lines of the file
              //arraylist for the ingredneits of a Recipe 

            while (fileScanner.hasNextLine()) { //keeps looping entil end of the file

                String line = fileScanner.nextLine();

                if (line.trim().isEmpty() || !fileScanner.hasNextLine()) {  //when it comes to a blank line or the end of the file it 
                    // stops and and starts assign the lines/ArrayList to variables 
                    String name = fileLines.get(0);                         // simply the first two as Name and Time and then the rest to another list called ingredient list
                    int time = Integer.valueOf(fileLines.get(1));
                     ArrayList<String> ingredientList = new ArrayList<>();     //didn';t look into it too much but i had issues moving this else where and emptying the list beleow
                        
                    for (int i = 2; i < fileLines.size(); i++) {   //starts ingrendents after the first two lines
                        ingredientList.add(fileLines.get(i));

                    }
                    recipeList.addRecipe(new Recipe(name, time, ingredientList));     // creates an object and adds it to the Recipebook object which is an arrayList of object
                                                                                      
                    fileLines.removeAll(fileLines);                                   
                                             
                } else {

                    fileLines.add(line);
                }

            }

            fileScanner.close();

        } catch (Exception e) {

            System.out.println("Error reading file " + e.getMessage());
        }

        TextInterface txtInterface = new TextInterface(scanner, recipeList);

        txtInterface.start();

    }

}


//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.nio.file.Paths;
//import java.util.Scanner;
//
//public class RecipeSearch {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        RecipeList recipeList = new RecipeList();
//        
//        System.out.println("File to read: ");
//        String fileName = scanner.nextLine();   
//        
//        try(Scanner fileScanner = new Scanner(Paths.get(fileName))) {
//            
//            ArrayList<String> fileNextLine = new ArrayList<>(); //temporary arrayList to store the lines of the file. it is resetted after each recipe it currently holds is store in the RecipeList class
//            
//            while(fileScanner.hasNextLine()) { 
//                String nextLine = fileScanner.nextLine();
//                
//                if (nextLine.trim().isEmpty() || !fileScanner.hasNextLine()) {
//                    fileNextLine.add(nextLine);
//                    String name = fileNextLine.get(0);
//                    int cookTime = Integer.valueOf(fileNextLine.get(1));
//                    
//                    ArrayList <String> ingredients = new ArrayList<>(); //ArrayList for the ingredients
//                    for (int i = 2; i < fileNextLine.size(); i++) {
//                        ingredients.add(fileNextLine.get(i));
//                    }
//                    
//                    recipeList.addRecipe(new Recipe(name, cookTime, ingredients)); //creates an object of the Recipe class and adds said object to the RecipeList
//                    fileNextLine.removeAll(fileNextLine); //resets the fileNextLine ArrayList for the next set of recipe in the file
//                }
//            }
//            
//        } catch (IOException e) {
//            System.out.println("File not found");
//        }
        
        //TextInterface textI = new TextInterface();
        //text1.start(); 
        
        
//        Scanner scanner = new Scanner(System.in);
//        RecipeList recipeList = new RecipeList();
//        
//        System.out.println("File to read: ");
//        String fileName = scanner.nextLine();
//        
//        try (Scanner scanFile = new Scanner(Paths.get(fileName))) {
//            
//            ArrayList<String> fileNextLine = new ArrayList<>();
//            
//            while (scanFile.hasNextLine()) {
//                
//                String line = scanFile.nextLine();
//                
//                if (line.trim().isEmpty() || !scanFile.hasNextLine()) {
//                    String name = fileNextLine.get(0);
//                    int time = Integer.valueOf(fileNextLine.get(1));
//                    ArrayList<String> ingredients = new ArrayList<>();
//                    
//                    for (int i = 2; i < fileNextLine.size(); i++) {
//                        ingredients.add(fileNextLine.get(i));
//                    }
//                    
//                    recipeList.addRecipe(new Recipe(name, time, ingredients));
//                    fileNextLine.removeAll(fileNextLine);
//                    
//                } else {
//                    fileNextLine.add(line);
//                }
//            }    
//            
//            scanFile.close();
//            
//        } catch (Exception e) {
//            System.out.println("Error");
//        }
//        
//        TextInterface txtInterface = new TextInterface(scanner, recipeList);
//
//        txtInterface.start();
        
        //
        
//        System.out.println("\nCommands: \n" + 
//                           "list - lists the recipes \n"+ 
//                           "stop - stops the program\n");
//        
//        boolean isLooping = true;
//        while (isLooping) {
//            
//            System.out.println("Enter command: ");
//            String command = scanner.nextLine();
//            
//            switch (command) {
//                
//                case "list" :
//                    System.out.println("\nRecipes:");
//                    
//                    try (Scanner scan = new Scanner(Paths.get(fileName))) {
////                        ArrayList<String>  
//                        while (scan.hasNextLine()) {
//                            String recipe = scan.nextLine();
//                            String time = scan.nextLine();
//                            
//                            System.out.println(recipe + ", cooking time: " + time);
//                        }
//                        System.out.println("\n");
//                    } 
//                    catch (Exception e) {
//                        System.out.println("");
//                    }
//                    continue;
//                
//                case "stop" :
//                    isLooping = false;
//                    break;
//            }
//        }
   

