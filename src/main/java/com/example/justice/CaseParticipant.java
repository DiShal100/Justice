package com.example.justice;

import javafx.beans.property.SimpleStringProperty;

public class CaseParticipant {
    private SimpleStringProperty shortNameParticipant;
    private SimpleStringProperty fullNameParticipant;
    private SimpleStringProperty typePersonParticipant;
    private SimpleStringProperty innParticipant;
    private SimpleStringProperty addressParticipant;

    public CaseParticipant() {
    }

    public CaseParticipant(String shortNameParticipant, String fullNameParticipant, String typePersonParticipant, String innParticipant, String addressParticipant) {
        this.shortNameParticipant = new SimpleStringProperty(shortNameParticipant);
        this.fullNameParticipant = new SimpleStringProperty(fullNameParticipant);
        this.typePersonParticipant = new SimpleStringProperty(typePersonParticipant);
        this.innParticipant = new SimpleStringProperty(innParticipant);
        this.addressParticipant = new SimpleStringProperty(addressParticipant);
    }

    public CaseParticipant(String shortNameParticipant, String innParticipant) {
        this.shortNameParticipant = new SimpleStringProperty(shortNameParticipant);
        this.innParticipant = new SimpleStringProperty(innParticipant);
    }

    public String getShortNameParticipant() {
        return shortNameParticipant.get();
    }

    public SimpleStringProperty shortNameParticipantProperty() {
        return shortNameParticipant;
    }

    public String getFullNameParticipant() {
        return fullNameParticipant.get();
    }

    public SimpleStringProperty fullNameParticipantProperty() {
        return fullNameParticipant;
    }

    public String getTypePersonParticipant() {
        return typePersonParticipant.get();
    }

    public SimpleStringProperty typePersonParticipantProperty() {
        return typePersonParticipant;
    }

    public String getInnParticipant() {
        return innParticipant.get();
    }

    public SimpleStringProperty innParticipantProperty() {
        return innParticipant;
    }

    public String getAddressParticipant() {
        return addressParticipant.get();
    }

    public SimpleStringProperty addressParticipantProperty() {
        return addressParticipant;
    }

    public void setShortNameParticipant(String shortNameParticipant) {
        this.shortNameParticipant.set(shortNameParticipant);
    }

    public void setFullNameParticipant(String fullNameParticipant) {
        this.fullNameParticipant.set(fullNameParticipant);
    }

    public void setTypePersonParticipant(String typePersonParticipant) {
        this.typePersonParticipant.set(typePersonParticipant);
    }

    public void setInnParticipant(String innParticipant) {
        this.innParticipant.set(innParticipant);
    }

    public void setAddressParticipant(String addressParticipant) {
        this.addressParticipant.set(addressParticipant);
    }
}
