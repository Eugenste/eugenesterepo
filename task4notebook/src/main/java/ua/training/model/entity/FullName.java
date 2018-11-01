package ua.training.model.entity;

import ua.training.view.View;

import static ua.training.view.TextConstantsForResources.*;

public class FullName {
    private String firstName;
    private String lastName;
    private String patronymic;

    public FullName(){
        firstName = NONE;
        lastName = NONE;
        patronymic = NONE;
    }

    public FullName(String firstName, String lastName, String patronymic) throws NotUniqueLastNameException {
        if (DBNoteBook.checkLastName(lastName)){
            throw new NotUniqueLastNameException(ILLEGAL_LAST_NAME,lastName);
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getFullNameInfo(){
        return FIRST_NAME + getFirstName() + TAB + LAST_NAME + getLastName() + TAB + PATRONYMIC + getPatronymic() + TAB;

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
