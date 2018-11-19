package ua.training.pizzaComposite;

public class PizzaMain {
    public static void main(String[] args) {
            Ingredient salami = new Salami();
            salami.setPrice(500);
            salami.setPrimeCost(200);
            Ingredient paper = new Pepper();
            paper.setPrice(400);
            paper.setPrimeCost(200);
            Ingredient cheese = new Cheese();
            cheese.setPrice(700);
            cheese.setPrimeCost(100);

            CompositePizza margarita = new CompositePizza();
            margarita.addIngredient(cheese);
            margarita.addIngredient(cheese);
            margarita.addIngredient(paper);


            CompositePizza margaSalami = new CompositePizza();
            margaSalami.addIngredient(salami);
            margaSalami.addIngredient(margarita);
            margaSalami.calculateProfit();
    }
}
