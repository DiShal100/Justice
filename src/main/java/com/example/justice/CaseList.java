package com.example.justice;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class CaseList {
    private SimpleStringProperty caseNumber;
    private SimpleStringProperty claimants;
    private SimpleStringProperty defendants;
    private SimpleStringProperty litigationType;
    private SimpleStringProperty litigationSubject;
    private SimpleStringProperty courtName;
    private SimpleStringProperty stagesOfCase;
    private SimpleStringProperty instance;
    private SimpleDoubleProperty claimSum;

    public CaseList() {
    }

    public CaseList(String caseNumber, String claimants, String defendants, String litigationType, String litigationSubject, String courtName, String stagesOfCase, String instance, double claimSum) {
        this.caseNumber = new SimpleStringProperty(caseNumber);
        this.claimants = new SimpleStringProperty(claimants);
        this.defendants = new SimpleStringProperty(defendants);
        this.litigationType = new SimpleStringProperty(litigationType);
        this.litigationSubject = new SimpleStringProperty(litigationSubject);
        this.courtName = new SimpleStringProperty(courtName);
        this.stagesOfCase = new SimpleStringProperty(stagesOfCase);
        this.instance = new SimpleStringProperty(instance);
        this.claimSum = new SimpleDoubleProperty(claimSum);
    }

    public String getCaseNumber() {
        return caseNumber.get();
    }

    public SimpleStringProperty caseNumberProperty() {
        return caseNumber;
    }

    public String getClaimants() {
        return claimants.get();
    }

    public SimpleStringProperty claimantsProperty() {
        return claimants;
    }

    public String getDefendants() {
        return defendants.get();
    }

    public SimpleStringProperty defendantsProperty() {
        return defendants;
    }

    public String getLitigationType() {
        return litigationType.get();
    }

    public SimpleStringProperty litigationTypeProperty() {
        return litigationType;
    }

    public String getLitigationSubject() {
        return litigationSubject.get();
    }

    public SimpleStringProperty litigationSubjectProperty() {
        return litigationSubject;
    }

    public String getCourtName() {
        return courtName.get();
    }

    public SimpleStringProperty courtNameProperty() {
        return courtName;
    }

    public String getStagesOfCase() {
        return stagesOfCase.get();
    }

    public SimpleStringProperty stagesOfCaseProperty() {
        return stagesOfCase;
    }

    public String getInstance() {
        return instance.get();
    }

    public SimpleStringProperty instanceProperty() {
        return instance;
    }

    public double getClaimSum() {
        return claimSum.get();
    }

    public SimpleDoubleProperty claimSumProperty() {
        return claimSum;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber.set(caseNumber);
    }

    public void setClaimants(String claimants) {
        this.claimants.set(claimants);
    }

    public void setDefendants(String defendants) {
        this.defendants.set(defendants);
    }

    public void setLitigationType(String litigationType) {
        this.litigationType.set(litigationType);
    }

    public void setLitigationSubject(String litigationSubject) {
        this.litigationSubject.set(litigationSubject);
    }

    public void setCourtName(String courtName) {
        this.courtName.set(courtName);
    }

    public void setStagesOfCase(String stagesOfCase) {
        this.stagesOfCase.set(stagesOfCase);
    }

    public void setInstance(String instance) {
        this.instance.set(instance);
    }

    public void setClaimSum(double claimSum) {
        this.claimSum.set(claimSum);
    }
}
