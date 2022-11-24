package com.example.justice;

import java.util.Calendar;

public class Entity {
    private String shortName;
    private String fullName;
    private String locationAddress;
    private Long ogrn;
    private Long inn;
    private Long kpp;
    private Calendar registrationDate;
    private String eioo;
    private String note;

    public Entity() {
    }

    public Entity(String shortName, String fullName, String locationAddress, Long ogrn, Long inn, Long kpp, Calendar registrationDate, String eioo, String note) {
        this.shortName = shortName;
        this.fullName = fullName;
        this.locationAddress = locationAddress;
        this.ogrn = ogrn;
        this.inn = inn;
        this.kpp = kpp;
        this.registrationDate = registrationDate;
        this.eioo = eioo;
        this.note = note;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public Long getOgrn() {
        return ogrn;
    }

    public void setOgrn(Long ogrn) {
        this.ogrn = ogrn;
    }

    public Long getInn() {
        return inn;
    }

    public void setInn(Long inn) {
        this.inn = inn;
    }

    public Long getKpp() {
        return kpp;
    }

    public void setKpp(Long kpp) {
        this.kpp = kpp;
    }

    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getEioo() {
        return eioo;
    }

    public void setEioo(String eioo) {
        this.eioo = eioo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
