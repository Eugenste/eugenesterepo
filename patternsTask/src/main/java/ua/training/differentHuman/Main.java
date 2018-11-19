package ua.training.differentHuman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main( String[] args ){
        List<State> states = new ArrayList<>(Arrays.asList(new HunterState(), new MushroomerState()));
        Human human = new Human();
        human.setStates(states);
        human.doSomething();

    }
}
