package ua.training.planeState;

public class PlaneMain {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.setAmmoCount(500);
        plane.setNameOfGun("Betsy");
        plane.setCurrentState(new OnTheGround());
        plane.doInState();
        plane.setCurrentState(new CanShoot());
        plane.doInState();
        plane.doInState();
    }
}
