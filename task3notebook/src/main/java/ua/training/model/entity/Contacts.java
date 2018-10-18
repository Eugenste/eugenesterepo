package ua.training.model.entity;

import ua.training.view.View;

import static ua.training.view.TextConstantsForResources.*;

public class Contacts {
    private String phoneNumber;
    private String email;
    private String skype;

    public Contacts(){
        phoneNumber = NONE;
        email = NONE;
        skype = NONE;
    }

    public Contacts(String phoneNumber, String email, String skype) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.skype = skype;
    }

    public String getFullContactsInfo(){
        return PHONE_NUMBER + getPhoneNumber() + TAB + EMAIL + getEmail() + TAB + SKYPE + getSkype() + TAB;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }
}
