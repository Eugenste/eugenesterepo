package ua.training.planeState;

public class Plane {
    private String nameOfGun;
    private long ammoCount;
    private PlaneState currentState = new OnTheGround();
    private PlaneState previousState;


    public String getNameOfGun() {
        return nameOfGun;
    }

    public void setNameOfGun(String nameOfGun) {
        this.nameOfGun = nameOfGun;
    }

    public long getAmmoCount() {
        return ammoCount;
    }

    public void setAmmoCount(long ammoCount) {
        this.ammoCount = ammoCount;
    }

    public PlaneState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PlaneState currentState) {
        previousState = this.currentState;
        this.currentState = currentState;
    }

    public PlaneState getPreviousState() {
        return previousState;
    }

    public void setPreviousState(PlaneState previousState) {
        this.previousState = previousState;
    }

    public void doInState(){
        currentState.doInState(this);
    }

}
