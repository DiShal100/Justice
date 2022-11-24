package com.example.justice;

import javafx.beans.property.SimpleStringProperty;

public class LitigationType {
    private SimpleStringProperty litigationType;
    private SimpleStringProperty note;

    public LitigationType() {
    }

    public LitigationType(String litigationType, String note) {
        this.litigationType = new SimpleStringProperty(litigationType);
        this.note = new SimpleStringProperty(note);
    }

    public String getLitigationType() {
        return litigationType.get();
    }

    public SimpleStringProperty litigationTypeProperty() {
        return litigationType;
    }

    public String getNote() {
        return note.get();
    }

    public SimpleStringProperty noteProperty() {
        return note;
    }

    public void setLitigationType(String litigationType) {
        this.litigationType.set(litigationType);
    }

    public void setNote(String note) {
        this.note.set(note);
    }
}
