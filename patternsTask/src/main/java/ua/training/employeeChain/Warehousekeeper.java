package ua.training.employeeChain;

public class Warehousekeeper extends Secretary {


    public Warehousekeeper(int priority) {
        super(priority);
    }

    @Override
    public void answeredBy() {
        System.out.println("Answered by warehousekeeper");
    }
}
