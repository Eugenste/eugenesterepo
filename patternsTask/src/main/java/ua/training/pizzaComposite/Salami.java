package ua.training.pizzaComposite;

public class Salami extends Ingredient {


    @Override
    public long calculateProfit() {
        System.out.println("Calculating for Salami");
        return super.getPrice() - super.getPrimeCost();
    }
}
