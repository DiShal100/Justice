package com.example.justice;

import javafx.beans.property.SimpleStringProperty;

public class Instance {
    private SimpleStringProperty instanceName;
    private SimpleStringProperty nameCourtInstance;

    public Instance() {
    }

    public Instance(String instanceName, String nameCourtInstance) {
        this.instanceName = new SimpleStringProperty(instanceName);
        this.nameCourtInstance = new SimpleStringProperty(nameCourtInstance);
    }

    public String getInstanceName() {
        return instanceName.get();
    }

    public SimpleStringProperty instanceNameProperty() {
        return instanceName;
    }

    public String getNameCourtInstance() {
        return nameCourtInstance.get();
    }

    public SimpleStringProperty nameCourtInstanceProperty() {
        return nameCourtInstance;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName.set(instanceName);
    }

    public void setNameCourtInstance(String nameCourtInstance) {
        this.nameCourtInstance.set(nameCourtInstance);
    }
}
