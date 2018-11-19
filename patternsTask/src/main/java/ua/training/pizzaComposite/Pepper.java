package ua.training.pizzaComposite;

public class Pepper extends Ingredient {


    @Override
    public long calculateProfit() {
        System.out.println("Calculating for Pepper");
        return super.getPrice() - getPrimeCost();
    }
}
