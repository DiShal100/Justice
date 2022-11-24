package com.example.justice;

import javafx.beans.property.SimpleStringProperty;

public class Jurisdiction {
    private SimpleStringProperty jurisdiction_type;
    private SimpleStringProperty note;

    public Jurisdiction() {
    }

    public Jurisdiction(String jurisdiction_type, String note) {
        this.jurisdiction_type = new SimpleStringProperty(jurisdiction_type);
        this.note = new SimpleStringProperty(note);
    }

    public String getJurisdiction_type() {
        return jurisdiction_type.get();
    }

    public SimpleStringProperty jurisdiction_typeProperty() {
        return jurisdiction_type;
    }

    public String getNote() {
        return note.get();
    }

    public SimpleStringProperty noteProperty() {
        return note;
    }

    public void setJurisdiction_type(String jurisdiction_type) {
        this.jurisdiction_type.set(jurisdiction_type);
    }

    public void setNote(String note) {
        this.note.set(note);
    }
}
