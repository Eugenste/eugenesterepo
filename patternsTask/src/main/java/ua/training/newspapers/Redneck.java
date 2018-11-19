package ua.training.newspapers;

public class Redneck implements Observer {
    private String name;
    public Redneck(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void handleNewspaper(Newspapers newspapers) {
        System.out.println("Redneck  " + getName() +" has got a " + newspapers.getName() + " newspapers!");
    }
}
