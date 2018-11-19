package ua.training.computerFacade;

public class Computer {
    Screen screen = new Screen();
    HDD hdd = new HDD();
    CPU cpu = new CPU();

    public void workWithComputer(){
        screen.turnOn();
        cpu.isHot();
        hdd.workWithCPU(cpu);
    }
}
