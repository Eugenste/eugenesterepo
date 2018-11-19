package ua.training.differentHuman;

public class HunterState implements State {
    @Override
    public void doSomething() {
        System.out.println( "becomes hunter");
    }
}
