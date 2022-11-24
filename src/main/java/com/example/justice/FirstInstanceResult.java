package com.example.justice;

public class FirstInstanceResult {
    private String firstInstanceResult;
    private String note;

    public FirstInstanceResult() {
    }

    public FirstInstanceResult(String firstInstanceResult, String note) {
        this.firstInstanceResult = firstInstanceResult;
        this.note = note;
    }

    public String getFirstInstanceResult() {
        return firstInstanceResult;
    }

    public void setFirstInstanceResult(String firstInstanceResult) {
        this.firstInstanceResult = firstInstanceResult;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
