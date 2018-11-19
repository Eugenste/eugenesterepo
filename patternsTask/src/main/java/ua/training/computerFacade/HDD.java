package ua.training.computerFacade;

public class HDD {
    void workWithCPU(CPU cpu){
        if (cpu.isHot()){
            System.out.println("HDD cant work with CPU, too hot");
        }else {
            System.out.println("HDD working with CPU");
        }
    }

}
