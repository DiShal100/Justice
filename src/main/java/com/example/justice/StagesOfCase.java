package com.example.justice;

public class StagesOfCase {
    private String stagesOfCase;
    private String note;

    public StagesOfCase() {
    }

    public StagesOfCase(String stagesOfCase, String note) {
        this.stagesOfCase = stagesOfCase;
        this.note = note;
    }

    public String getStagesOfCase() {
        return stagesOfCase;
    }

    public void setStagesOfCase(String stagesOfCase) {
        this.stagesOfCase = stagesOfCase;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
