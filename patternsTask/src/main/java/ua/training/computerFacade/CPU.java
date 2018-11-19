package ua.training.computerFacade;

public class CPU {
    private boolean isHot;

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public void turnOnFans(){
        if (isHot){
            System.out.println("Fans are on");
        } else{
            System.out.println("There is no need to turn in Fans");
        }
    }

}
