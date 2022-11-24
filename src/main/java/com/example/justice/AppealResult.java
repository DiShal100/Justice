package com.example.justice;

public class AppealResult {
    private String appealResult;
    private String note;

    public AppealResult() {
    }

    public AppealResult(String appealResult, String note) {
        this.appealResult = appealResult;
        this.note = note;
    }

    public String getAppealResult() {
        return appealResult;
    }

    public void setAppealResult(String appealResult) {
        this.appealResult = appealResult;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
