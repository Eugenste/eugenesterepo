package ua.training.planeState;

public class CanShoot implements PlaneState {


    @Override
    public void doInState(Plane plane) {
        if (plane.getPreviousState() instanceof InFlight && plane.getAmmoCount()> 0) {
            System.out.println("plane is shooting from " + plane.getNameOfGun());
        } else {
            System.out.println("plane cant shoot");
            plane.setCurrentState(plane.getPreviousState());
        }
    }
}
