
import java.util.ArrayList;
import java.util.Scanner;


public class TextInterface {
    
    private Scanner scanner;
    private RecipeList recipeList;

    public TextInterface(Scanner scanner, RecipeList recipes) {
        this.scanner = scanner;
        this.recipeList = recipes;
    }

    public void start() {

        boolean shouldLoop = true;

        System.out.println("Commands:" + "\n"
                + "list - list the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");

        while (shouldLoop) {
            System.out.println("\nEnter command: ");
            //switch statments seem much eaiser to read
            String command = scanner.nextLine();

            switch (command) {
                
                case "stop":
                    shouldLoop = false;
                    break;
                    
                case "list":
                    System.out.println("Recipes:");
                    recipeList.printRecipeBook();

                    break;
                    
                case "find name":
                    System.out.println("Search word: ");
                    String searchWord = scanner.nextLine();

                    recipeList.printByName(searchWord);

                    break;
                    
                case "find cooking time":
                    System.out.println("Search word: ");
                    searchWord = scanner.nextLine();

                    recipeList.printByTime(searchWord);

                    break;
                    
                case "find ingredient":
                    System.out.println("Search word: ");
                    searchWord = scanner.nextLine();

                    recipeList.printByIngredient(searchWord);

                    break;
                    
                default:
                    System.out.println("Unknown command");

            }

        }

    }

    
//    private Scanner scan;
//    private RecipeList recipeList;
//    private Recipe recipes;
//
//    public TextInterface(Scanner scan, RecipeList recipeList) {
//        this.scan = scan;
//        this.recipeList = recipeList;
//    }
//    
//    public void start() {
//        System.out.println("\nCommands: \n" +
//                           "list - lists the recipes\n" +
//                           "stop - stops the program");
//        String command = scan.nextLine();
//        
//        boolean isLooping = true;
//        while(isLooping) {
//            switch (command) {
//                case "stop" :
//                    isLooping = false;
//                    break;
//                    
//                case "list" :
//                    System.out.println("\nRecipes:");
//                    recipeList.printRecipeList();
//                    continue;
//                
//                case "find name" :
//                    System.out.println("Searched word");
//                    String findName = scan.nextLine();
//                    for (Recipe recipe : recipeList) {
//                        if (recipe.getRecipe().contains(findName)) {
//                            System.out.println("recipe");
//                        }
//                    }
//                    continue;
//                    
//                case "find cooking time" :
//                    System.out.println("Max cooking time");
//                    int findMaxCookTime = Integer.valueOf(scan.nextLine());
//                    for (Recipe recipe : recipeList) {
//                        if (recipe.getCookingTime() <= findMaxCookTime) {
//                            System.out.println(recipe);
//                        }
//                    }
//                    continue;
//                    
//                case "find ingredient" :
//                    System.out.println("Ingredient");
//                    String findIngredient = scan.nextLine();
//                    
//            }
//        }
//    }
    
    
}
