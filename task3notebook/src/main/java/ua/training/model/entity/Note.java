package ua.training.model.entity;

import ua.training.view.View;

import static ua.training.view.TextConstantsForResources.*;

public class Note {
    private FullName fullName;
    private Address address;
    private Group group;
    private Contacts contacts;

    private String comment;

    public Note(){
        fullName = new FullName();
        address = new Address();
        contacts = new Contacts();
        group = Group.UNDEFINED;
        comment = NONE;
    }

    public Note(FullName fullName, Address address, Group group, Contacts contacts, String comment) {
        this.fullName = fullName;
        this.address = address;
        this.group = group;
        this.contacts = contacts;
        this.comment = comment;
    }

    public String getCreatedNote(){
        return CREATED_NOTE + TAB + NAME_INFO + TAB + getFullName().getFullNameInfo() +
                                                ADDRESS_INFO + TAB + getAddress().getFullAddressInfo()+
                                                CONTACTS_INFO + TAB + getContacts().getFullContactsInfo()+
                                                                        GROUP + getGroup().toString() + TAB +
                                                                                COMMENT + TAB + getComment();
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(String group) {

        switch (group){
            case "friend":
                this.group = Group.FRIENDS;
                break;
            case "work":
                this.group = Group.WORK;
                break;
            case "family":
                this.group = Group.FAMILY;
                break;
            default:
                this.group = Group.UNDEFINED;
        }
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = this.comment;
    }
}
