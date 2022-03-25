import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * stores the recipes directly from RecipeSearch class
 * variables are name, cooking time, ingredients
 */

public class Recipe {
    
    private String recipe;
    private int cookingTime;
    private ArrayList<String> ingredientsList;

    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.recipe = name;
        this.cookingTime = time;
        this.ingredientsList = ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredientsList() {
        return ingredientsList;
    }
    
    @Override
    public String toString() {
        return this.recipe + ", cooking time: " + this.cookingTime;
    }
    
    
    
}
