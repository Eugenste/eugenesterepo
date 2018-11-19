package ua.training.pizzaComposite;

public abstract class Ingredient {
    private long price;
    private long primeCost;


    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getPrimeCost() {
        return primeCost;
    }

    public void setPrimeCost(long primeCost) {
        this.primeCost = primeCost;
    }

    public abstract long calculateProfit();


}
