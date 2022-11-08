package com.example.justice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;


public class JusticeController {

    @FXML Pane mainJusticePane;
    @FXML Pane downloadPane;
    @FXML
    TextField caseSearch;

    @FXML Button currentCases;
    @FXML Button createCase;
    @FXML Button editCase;
    @FXML Button changesAPPLYbtn;
    @FXML Button changesCANCELbtn;
    @FXML Button changesOKbtn;

    @FXML Button jurisdictionBtn;
    @FXML Button createReferenceValueBtn;
    @FXML Button statusINcaseBtn;
    @FXML Button litigationTypeBtn;
    @FXML Button LitigationSubjectBtn;
    @FXML Button CurrentCasestageBtn;





    public void loadPane (ActionEvent event) throws IOException {
        Pane newLoadedPane = FXMLLoader.load(getClass().getResource("loadCaseListPane.fxml"));
        mainJusticePane.getChildren().add(newLoadedPane);
    }

    public void changesOK (ActionEvent event) {
        Stage stage = (Stage) changesOKbtn.getScene().getWindow();
        stage.close();
    }

    public void changesCANCEL(ActionEvent event) {
        Stage stage = (Stage) changesCANCELbtn.getScene().getWindow();
        stage.close();
    }

    public void changesAPPLY (ActionEvent event) {
        Stage stage = (Stage) changesAPPLYbtn.getScene().getWindow();
    }

    public void createCase (ActionEvent event) throws IOException {
        Stage createCaseStage = new Stage();
        Parent createCaseRoot = FXMLLoader.load(getClass().getResource("createCase.fxml"));
        Scene createCaseScene = new Scene(createCaseRoot);
        createCaseStage.setTitle("Новое дело");
        createCaseStage.setScene(createCaseScene);
        createCaseStage.sizeToScene();
        createCaseStage.setResizable(false);
        createCaseStage.setAlwaysOnTop(true);
        createCaseStage.show();
    }

    public void editCase (ActionEvent event) throws IOException {
        Stage editCaseStage = new Stage();
        Parent editCaseRoot = FXMLLoader.load(getClass().getResource("createCase.fxml"));
        Scene editCaseScene = new Scene(editCaseRoot);
        editCaseStage.setTitle("Дело ");
        editCaseStage.setScene(editCaseScene);
        editCaseStage.sizeToScene();
        editCaseStage.setResizable(false);
        editCaseStage.setAlwaysOnTop(true);
        editCaseStage.show();
    }
    public void deleteCase (ActionEvent event) {

    }

    public void caseSearch (ActionEvent event) {

    }

    public void editJurisdiction (ActionEvent event) throws IOException {
        Stage editJurisdictionStage = new Stage();
        Parent editJurisdictionRoot = FXMLLoader.load(getClass().getResource("viewReferenceValues.fxml"));
        Scene editJurisdictionScene = new Scene(editJurisdictionRoot);
        editJurisdictionStage.setTitle("Подведомственность");
        editJurisdictionStage.setScene(editJurisdictionScene);
        editJurisdictionStage.sizeToScene();
        editJurisdictionStage.setResizable(false);
        editJurisdictionStage.setAlwaysOnTop(true);
        editJurisdictionStage.show();
    }

    public void createReferenceValue() throws IOException {
        Stage createReferenceValueStage = new Stage();
        Parent createReferenceValueRoot = FXMLLoader.load(getClass().getResource("createReferenceValue.fxml"));
        Scene createReferenceValueScene = new Scene(createReferenceValueRoot);
        createReferenceValueStage.setTitle("Справочные значения");
        createReferenceValueStage.setScene(createReferenceValueScene);
        createReferenceValueStage.sizeToScene();
        createReferenceValueStage.setResizable(false);
        createReferenceValueStage.setAlwaysOnTop(true);
        createReferenceValueStage.show();
    }

    public void editStatusINcase (ActionEvent event) throws IOException {
        Stage editStatusINcaseStage = new Stage();
        Parent editStatusINcaseRoot = FXMLLoader.load(getClass().getResource("viewReferenceValues.fxml"));
        Scene editStatusINcaseScene = new Scene(editStatusINcaseRoot);
        editStatusINcaseStage.setTitle("Наш статус в деле");
        editStatusINcaseStage.setScene(editStatusINcaseScene);
        editStatusINcaseStage.sizeToScene();
        editStatusINcaseStage.setResizable(false);
        editStatusINcaseStage.setAlwaysOnTop(true);
        editStatusINcaseStage.show();
    }

    public void editLitigationType (ActionEvent event) throws IOException {
        Stage editLitigationTypeStage = new Stage();
        Parent editLitigationTypeRoot = FXMLLoader.load(getClass().getResource("viewReferenceValues.fxml"));
        Scene editLitigationTypeScene = new Scene(editLitigationTypeRoot);
        editLitigationTypeStage.setTitle("Вид спора");
        editLitigationTypeStage.setScene(editLitigationTypeScene);
        editLitigationTypeStage.sizeToScene();
        editLitigationTypeStage.setResizable(false);
        editLitigationTypeStage.setAlwaysOnTop(true);
        editLitigationTypeStage.show();
    }

    public void editLitigationSubject (ActionEvent event) throws IOException {
        Stage editLitigationSubjectStage = new Stage();
        Parent editLitigationSubjectRoot = FXMLLoader.load(getClass().getResource("viewReferenceValues.fxml"));
        Scene editLitigationSubjectScene = new Scene(editLitigationSubjectRoot);
        editLitigationSubjectStage.setTitle("Предмет спора");
        editLitigationSubjectStage.setScene(editLitigationSubjectScene);
        editLitigationSubjectStage.sizeToScene();
        editLitigationSubjectStage.setResizable(false);
        editLitigationSubjectStage.setAlwaysOnTop(true);
        editLitigationSubjectStage.show();
    }

    public void editCurrentCasestage (ActionEvent event) throws IOException {
        Stage editCurrentCasestageStage = new Stage();
        Parent editCurrentCasestageRoot = FXMLLoader.load(getClass().getResource("viewReferenceValues.fxml"));
        Scene editCurrentCasestageScene = new Scene(editCurrentCasestageRoot);
        editCurrentCasestageStage.setTitle("Текущая стадия дела");
        editCurrentCasestageStage.setScene(editCurrentCasestageScene);
        editCurrentCasestageStage.sizeToScene();
        editCurrentCasestageStage.setResizable(false);
        editCurrentCasestageStage.setAlwaysOnTop(true);
        editCurrentCasestageStage.show();
    }

}
