package com.example.justice;

import javafx.beans.property.SimpleStringProperty;


public class Employees {
    private SimpleStringProperty surname;
    private SimpleStringProperty name;
    private SimpleStringProperty patronymic;
    private SimpleStringProperty dayOfBirthday;
    private SimpleStringProperty position;
    private SimpleStringProperty email;
    private SimpleStringProperty workPhone;
    private SimpleStringProperty mobilePhone;

    public Employees() {
    }

    public Employees(String surname, String name, String patronymic, String dayOfBirthday, String position, String email, String workPhone, String mobilePhone) {
        this.surname = new SimpleStringProperty(surname);
        this.name = new SimpleStringProperty(name);
        this.patronymic = new SimpleStringProperty(patronymic);
        this.dayOfBirthday = new SimpleStringProperty(dayOfBirthday);
        this.position = new SimpleStringProperty(position);
        this.email = new SimpleStringProperty(email);
        this.workPhone = new SimpleStringProperty(workPhone);
        this.mobilePhone = new SimpleStringProperty(mobilePhone);
    }

    public String getSurname() {
        return surname.get();
    }

    public SimpleStringProperty surnameProperty() {
        return surname;
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public String getPatronymic() {
        return patronymic.get();
    }

    public SimpleStringProperty patronymicProperty() {
        return patronymic;
    }

    public String getDayOfBirthday() {
        return dayOfBirthday.get();
    }

    public SimpleStringProperty dayOfBirthdayProperty() {
        return dayOfBirthday;
    }

    public String getPosition() {
        return position.get();
    }

    public SimpleStringProperty positionProperty() {
        return position;
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public String getWorkPhone() {
        return workPhone.get();
    }

    public SimpleStringProperty workPhoneProperty() {
        return workPhone;
    }

    public String getMobilePhone() {
        return mobilePhone.get();
    }

    public SimpleStringProperty mobilePhoneProperty() {
        return mobilePhone;
    }

    public void setSurname(String surname) {
        this.surname.set(surname);
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setPatronymic(String patronymic) {
        this.patronymic.set(patronymic);
    }

    public void setDayOfBirthday(String dayOfBirthday) {
        this.dayOfBirthday.set(dayOfBirthday);
    }

    public void setPosition(String position) {
        this.position.set(position);
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone.set(workPhone);
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone.set(mobilePhone);
    }
}
