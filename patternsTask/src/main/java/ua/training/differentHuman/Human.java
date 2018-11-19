package ua.training.differentHuman;

import java.util.List;

public class Human {
    private List<State> states;

    public void setStates(List<State> states) {
        this.states = states;
    }

    public void doSomething(){
            states.forEach(State::doSomething);

    }
}
