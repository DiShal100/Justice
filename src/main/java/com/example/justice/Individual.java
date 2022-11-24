package com.example.justice;

import java.util.Calendar;

public class Individual {
    private String surname;
    private String name;
    private String patronymic;
    private Calendar dayOfBirthday;
    private String address;
    private String passport;
    private String issuedBy;
    private Calendar whenIssued;
    private String departmentCode;
    private String individualTaxNumber;
    private String job;

    public Individual() {
    }

    public Individual(String surname, String name, String patronymic, Calendar dayOfBirthday, String address, String passport, String issuedBy, Calendar whenIssued, String departmentCode, String individualTaxNumber, String job) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dayOfBirthday = dayOfBirthday;
        this.address = address;
        this.passport = passport;
        this.issuedBy = issuedBy;
        this.whenIssued = whenIssued;
        this.departmentCode = departmentCode;
        this.individualTaxNumber = individualTaxNumber;
        this.job = job;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Calendar getDayOfBirthday() {
        return dayOfBirthday;
    }

    public void setDayOfBirthday(Calendar dayOfBirthday) {
        this.dayOfBirthday = dayOfBirthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public Calendar getWhenIssued() {
        return whenIssued;
    }

    public void setWhenIssued(Calendar whenIssued) {
        this.whenIssued = whenIssued;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getIndividualTaxNumber() {
        return individualTaxNumber;
    }

    public void setIndividualTaxNumber(String individualTaxNumber) {
        this.individualTaxNumber = individualTaxNumber;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
