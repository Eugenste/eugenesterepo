package ua.training.employeeChain;

public class Mentor extends Secretary {

    public Mentor(int priority) {
        super(priority);
    }

    @Override
    public void answeredBy() {
        System.out.println("Answered by mentor");
    }
}
