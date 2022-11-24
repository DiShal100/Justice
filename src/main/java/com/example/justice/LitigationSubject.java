package com.example.justice;

public class LitigationSubject {
    private String litigationSubject;
    private String note;

    public LitigationSubject() {
    }

    public LitigationSubject(String litigationSubject, String note) {
        this.litigationSubject = litigationSubject;
        this.note = note;
    }

    public String getLitigationSubject() {
        return litigationSubject;
    }

    public void setLitigationSubject(String litigationSubject) {
        this.litigationSubject = litigationSubject;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
