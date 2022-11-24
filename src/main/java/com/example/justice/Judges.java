package com.example.justice;

import javafx.beans.property.SimpleStringProperty;

public class Judges {
    private SimpleStringProperty surnameJudge;
    private SimpleStringProperty nameJudge;
    private SimpleStringProperty patronymicJudge;
    private SimpleStringProperty phoneJudge;

    public Judges() {
    }

    public Judges(String surnameJudge, String nameJudge, String patronymicJudge, String phoneJudge) {
        this.surnameJudge = new SimpleStringProperty(surnameJudge);
        this.nameJudge = new SimpleStringProperty(nameJudge);
        this.patronymicJudge = new SimpleStringProperty(patronymicJudge);
        this.phoneJudge = new SimpleStringProperty(phoneJudge);
    }

    public String getSurnameJudge() {
        return surnameJudge.get();
    }

    public SimpleStringProperty surnameJudgeProperty() {
        return surnameJudge;
    }

    public String getNameJudge() {
        return nameJudge.get();
    }

    public SimpleStringProperty nameJudgeProperty() {
        return nameJudge;
    }

    public String getPatronymicJudge() {
        return patronymicJudge.get();
    }

    public SimpleStringProperty patronymicJudgeProperty() {
        return patronymicJudge;
    }

    public String getPhoneJudge() {
        return phoneJudge.get();
    }

    public SimpleStringProperty phoneJudgeProperty() {
        return phoneJudge;
    }

    public void setSurnameJudge(String surnameJudge) {
        this.surnameJudge.set(surnameJudge);
    }

    public void setNameJudge(String nameJudge) {
        this.nameJudge.set(nameJudge);
    }

    public void setPatronymicJudge(String patronymicJudge) {
        this.patronymicJudge.set(patronymicJudge);
    }

    public void setPhoneJudge(String phoneJudge) {
        this.phoneJudge.set(phoneJudge);
    }
}
