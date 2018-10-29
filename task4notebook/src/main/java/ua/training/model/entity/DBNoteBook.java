package ua.training.model.entity;

/**
 * Created by student on 04.10.2017.
 */
public enum DBNoteBook {
    NOTE_ONE("Taras", "Shevchenko"),
    NOTE_TWO("Nikola","Tesld"),
    NOTE_THREE("Elon","Musk");

    private final String firstName;
    private final String lastName;

    DBNoteBook(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public static boolean checkLastName (String lastNameData){
        for (DBNoteBook note : DBNoteBook.values()){
            if (note.getLastName().equals(lastNameData)){return true;}
        }
        return  false;
    }
}
