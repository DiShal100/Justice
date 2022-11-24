package com.example.justice;

public class CassationResult {
    private String cassationResult;
    private String note;

    public CassationResult() {
    }

    public CassationResult(String cassationResult, String note) {
        this.cassationResult = cassationResult;
        this.note = note;
    }

    public String getCassationResult() {
        return cassationResult;
    }

    public void setCassationResult(String cassationResult) {
        this.cassationResult = cassationResult;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
