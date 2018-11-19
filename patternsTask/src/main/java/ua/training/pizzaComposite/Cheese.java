package ua.training.pizzaComposite;

public class Cheese extends Ingredient {


    @Override
    public long calculateProfit() {
        System.out.println("Calculating for Cheese");
        return super.getPrice() - super.getPrimeCost();
    }
}
