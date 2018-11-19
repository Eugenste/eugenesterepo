package ua.training.employeeChain;

public class Boss extends Secretary {


    public Boss(int priority) {
        super(priority);
    }

    @Override
    public void answeredBy() {
        System.out.println("Answered by BOSS");
    }
}
