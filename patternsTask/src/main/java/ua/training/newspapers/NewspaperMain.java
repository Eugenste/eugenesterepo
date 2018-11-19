package ua.training.newspapers;

public class NewspaperMain {
    public static void main(String[] args) {

        Observer redneck1 = new Redneck("Ned");
        Observer redneck2 = new Redneck("Josh");

        Observed typography = new Typography();
        typography.addObserver(redneck1);
        typography.addObserver(redneck2);
        typography.addObserver(new Redneck("Sam"));
        Newspapers newspapers = new Newspapers();
        newspapers.setName("New York Times");

        ((Typography) typography).setNewspapers(newspapers);
    }
}
