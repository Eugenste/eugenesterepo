package ua.training.model.entity;

/**
 * Created by student on 04.10.2017.
 */
public class NotUniqueLastNameException extends Exception {
    private String lastNameData;

    public String getLastNameData() {
        return lastNameData;
    }

    public NotUniqueLastNameException(String message, String lastNameData) {
        super(message);
        this.lastNameData = lastNameData;
    }
}
