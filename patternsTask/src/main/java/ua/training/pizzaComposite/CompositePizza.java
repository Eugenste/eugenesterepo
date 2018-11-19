package ua.training.pizzaComposite;

import java.util.ArrayList;
import java.util.List;

public class CompositePizza extends Ingredient {
    private long totalProfit = 0;
    private List<Ingredient> ingredients = new ArrayList<>();


    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public void removeIngredients(Ingredient ingredient){
        ingredients.remove(ingredient);
    }

    @Override
    public long calculateProfit() {
        ingredients.stream().forEach(ingredient -> totalProfit += ingredient.calculateProfit());
        System.out.println("Calculating profit from Composite = " +  totalProfit );
        return totalProfit;
    }
}
