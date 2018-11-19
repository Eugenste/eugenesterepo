package ua.training.planeState;

public class CanNotShoot implements PlaneState {

    @Override
    public void doInState(Plane plane) {
        if(plane.getPreviousState() instanceof OnTheGround || plane.getAmmoCount() < 0) {
            System.out.println("plane cant shoot");
        }else {
            System.out.println("plane is ready to shoot");
            plane.setCurrentState(plane.getPreviousState());
        }

    }
}
