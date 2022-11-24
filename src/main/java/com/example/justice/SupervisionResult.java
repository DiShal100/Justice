package com.example.justice;

public class SupervisionResult {
    private String supervisionResult;
    private String note;

    public SupervisionResult() {
    }

    public SupervisionResult(String supervisionResult, String note) {
        this.supervisionResult = supervisionResult;
        this.note = note;
    }

    public String getSupervisionResult() {
        return supervisionResult;
    }

    public void setSupervisionResult(String supervisionResult) {
        this.supervisionResult = supervisionResult;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
