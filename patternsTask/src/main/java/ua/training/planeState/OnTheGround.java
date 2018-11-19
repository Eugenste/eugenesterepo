package ua.training.planeState;

public class OnTheGround implements PlaneState {
    @Override
    public void doInState(Plane plane) {
        System.out.println("plane is on the ground");
    }
}
