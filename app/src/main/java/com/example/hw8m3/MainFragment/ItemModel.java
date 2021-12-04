package com.example.hw8m3.MainFragment;

public class ItemModel {
    private int personImage;
    private String personStatus, personNameSurname;

    public ItemModel(int personImage, String personStatus, String personNameSurname) {
        this.personImage = personImage;
        this.personStatus = personStatus;
        this.personNameSurname = personNameSurname;
    }

    public int getPersonImage() {
        return personImage;
    }

    public void setPersonImage(int personImage) {
        this.personImage = personImage;
    }

    public String getPersonStatus() {
        return personStatus;
    }

    public void setPersonStatus(String personStatus) {
        this.personStatus = personStatus;
    }

    public String getPersonNameSurname() {
        return personNameSurname;
    }

    public void setPersonNameSurname(String personNameSurname) {
        this.personNameSurname = personNameSurname;
    }
}
