package ua.training.planeState;

public class InFlight implements PlaneState{

    @Override
    public void doInState(Plane plane) {
        System.out.println("plane is in flight");
    }
}
