package ua.training.employeeChain;

public class Accountant extends Secretary {


    public Accountant(int priority) {
        super(priority);
    }

    @Override
    public void answeredBy() {
        System.out.println("Answered by accountant");
    }
}
