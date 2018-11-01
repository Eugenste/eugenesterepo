package ua.training.model;

import ua.training.model.entity.*;

public class Model {
    private Note note;

    public Model(){
        note = new Note();
    }

    public void setNote(String firstName, String lastName, String patronymic, String index, String cityName, String street,
                        String houseNumber, String flatNumber, String group, String phone, String email, String skype, String comment) throws NotUniqueLastNameException {
        note.setFullName(new FullName(firstName,lastName,patronymic));
        note.setAddress(new Address(index,cityName,street,houseNumber,flatNumber));
        note.setContacts(new Contacts(phone,email,skype));
        note.setGroup(group);
        note.setComment(comment);
    }

    public String getNoteData(){
        return note.getCreatedNote();
    }



}
