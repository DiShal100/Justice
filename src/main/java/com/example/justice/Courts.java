package com.example.justice;

import javafx.beans.property.SimpleStringProperty;

public class Courts {
    private SimpleStringProperty jurisdiction;
    private SimpleStringProperty courtName;
    private SimpleStringProperty courtAddress;
    private SimpleStringProperty additionalInfo;

    public Courts() {
    }

    public Courts(String jurisdiction, String courtName, String courtAddress, String additionalInfo) {
        this.jurisdiction = new SimpleStringProperty(jurisdiction);
        this.courtName = new SimpleStringProperty(courtName);
        this.courtAddress = new SimpleStringProperty(courtAddress);
        this.additionalInfo = new SimpleStringProperty(additionalInfo);
    }

    public String getJurisdiction() {
        return jurisdiction.get();
    }

    public SimpleStringProperty jurisdictionProperty() {
        return jurisdiction;
    }

    public String getCourtName() {
        return courtName.get();
    }

    public SimpleStringProperty courtNameProperty() {
        return courtName;
    }

    public String getCourtAddress() {
        return courtAddress.get();
    }

    public SimpleStringProperty courtAddressProperty() {
        return courtAddress;
    }

    public String getAdditionalInfo() {
        return additionalInfo.get();
    }

    public SimpleStringProperty additionalInfoProperty() {
        return additionalInfo;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction.set(jurisdiction);
    }

    public void setCourtName(String courtName) {
        this.courtName.set(courtName);
    }

    public void setCourtAddress(String courtAddress) {
        this.courtAddress.set(courtAddress);
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo.set(additionalInfo);
    }
}
