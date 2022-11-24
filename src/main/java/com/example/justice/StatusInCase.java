package com.example.justice;

import javafx.beans.property.SimpleStringProperty;

public class StatusInCase {
    private SimpleStringProperty statusInCase;
    private SimpleStringProperty note;

    public StatusInCase() {
    }

    public StatusInCase(String statusInCase, String note) {
        this.statusInCase = new SimpleStringProperty(statusInCase);
        this.note = new SimpleStringProperty(note);
    }

    public String getStatusInCase() {
        return statusInCase.get();
    }

    public SimpleStringProperty statusInCaseProperty() {
        return statusInCase;
    }

    public String getNote() {
        return note.get();
    }

    public SimpleStringProperty noteProperty() {
        return note;
    }

    public void setStatusInCase(String statusInCase) {
        this.statusInCase.set(statusInCase);
    }

    public void setNote(String note) {
        this.note.set(note);
    }
}
