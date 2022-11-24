package com.example.justice;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class JusticeController implements Initializable{

    @FXML private Pane mainJusticePane;
    @FXML private Pane viewParticipantsCase;
    @FXML private Pane createParticipantsCase;
    @FXML private Pane downloadPane;
    @FXML private TextField caseSearch;

    @FXML private Button currentCases;
    @FXML private Button createCase;
    @FXML private Button editCase;
    @FXML private Button changesAPPLYbtn;
    @FXML private Button changesCANCELbtn;
    @FXML private Button changesOKbtn;
    @FXML private Button jurisdictionBtn;
    @FXML private Button createReferenceValueBtn;
    @FXML private Button statusINcaseBtn;
    @FXML private Button litigationTypeBtn;
    @FXML private Button LitigationSubjectBtn;
    @FXML private Button CurrentCasestageBtn;
    @FXML private Button createCaseParticipantsBtn; // создать участника дела в справочнике
    @FXML private Button editCaseParticipantsBtn; // редактировать участника дела в справочнике
    @FXML private Button deleteCaseParticipantsBtn; // удалить участника дела из справочника
    @FXML private Button addСlaimantBtn; // добавить истца
    @FXML private Button deleteСlaimantBtn; // удалить истца
    @FXML private Button addDefendantBtn; // добавить отчетчика
    @FXML private Button deleteDefendantBtn; // удалить отчетчика
    @FXML private Button addStakeholderBtn; // добавить заинтересованное лицо
    @FXML private Button deleteStakeholderBtn; // удалить заинтересованное лицо
    @FXML private Button addThirdPersonBtn; // добавить третье лицо
    @FXML private Button deleteThirdPersonBtn; // удалить третье лицо
    @FXML private Button addEmployeeBtn; // добавить нового сотрудника
    @FXML private Button editEmployeeBtn; // редактировать сотрудника
    @FXML private Button deleteEmployeeBtn; // удалить сотрудника
    @FXML private Button addHistoricalRecordBtn; // добавить историческую запись
    @FXML private Button deleteHistoricalRecordBtn; // удалить историческую запись
    @FXML private Button createNewCourtInListBtn; // создать новый суд в справочнике
    @FXML private Button editCourtInListBtn; // редактировать суд в справочнике
    @FXML private Button deleteCourtFromListBtn; // удалить суд из справочника
    @FXML private Button addJudgeInListBtn; // добавить судью
    @FXML private Button deleteJudgeFromListBtn; // удалить судью
    @FXML private Button createInstanceBtn; // создать инстанцию
    @FXML private Button createFirstInstanceBtn; // создать первую инстанцию
    @FXML private Button addCourtFromListBtn; // выбрать суд из списка доступных



    @FXML private Button createReferenceValueOKBtn; // кнопка запускает событие добавления нового значения в справочник
    @FXML private Button courtListBtn;
    @FXML private Button referenceBookBtn;

    @FXML private TextField name_ReferenceValue;
    @FXML private TextArea note_ReferenceValue;
    public static int flagReferenceBook;   // флаг для определения справочной таблицы в БД

    private final String[] TYPE_PERSON_COMBOBOX_ITEMS = {"Физическое лицо", "Юридическое лицо"};
    private final String[] GENDER_EMPLOYEE_COMBOBOX_ITEMS = {"Мужчина", "Женщина"};
    private final String[] JURISDICTION_COMBOBOX_ITEMS = {"Арбитражный суд", "Федеральный суд", "Мировой суд", "Верховный суд"};
    private final String[] POSITION_COMBOBOX_ITEMS = {"Юрисконсульт", "Старший юрисконсульт", "Ведущий юрисконсульт", "Главный юрисконсульт", "Начальник отдела"};

    @FXML private ObservableList<String> typePerson = FXCollections.observableArrayList(TYPE_PERSON_COMBOBOX_ITEMS);
    @FXML private ObservableList<String> genderEmployee = FXCollections.observableArrayList(GENDER_EMPLOYEE_COMBOBOX_ITEMS);
    @FXML private ObservableList<String> jurisdiction = FXCollections.observableArrayList(JURISDICTION_COMBOBOX_ITEMS);
    @FXML private ObservableList<String> position = FXCollections.observableArrayList(POSITION_COMBOBOX_ITEMS);
    @FXML private ComboBox typePersonComboBox = new ComboBox();
    @FXML private ComboBox genderEmployeeComboBox = new ComboBox();
    @FXML private ComboBox jurisdictionComboBox = new ComboBox();
    @FXML private ComboBox positionComboBox = new ComboBox();

    private DatabaseHandler dbHandler = new DatabaseHandler();

    /////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////'Таблица сотрудники'//////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private ObservableList<Employees> employeesListData = FXCollections.observableArrayList();
    @FXML
    private TableView<Employees> employeesListTableView = new TableView<>();
    @FXML
    private TableColumn<Employees, SimpleStringProperty> surnameEmployeeColumn = new TableColumn<>("Фамилия");
    @FXML
    private TableColumn<Employees, SimpleStringProperty> nameEmployeeColumn = new TableColumn<>("Имя");
    @FXML
    private TableColumn<Employees, SimpleStringProperty> patronymicEmployeeColumn= new TableColumn<>("Отчество");
    @FXML
    private TableColumn<Employees, SimpleStringProperty> dayOfBirthdayEmployeeColumn = new TableColumn<>("Дата рождения");
    @FXML
    private TableColumn<Employees, SimpleStringProperty> positionEmployeeColumn = new TableColumn<>("Должность");
    @FXML
    private TableColumn<Employees, SimpleStringProperty> emailEmployeeColumn = new TableColumn<>("Электронная почта");
    @FXML
    private TableColumn<Employees, SimpleStringProperty> workPhoneEmployeeColumn = new TableColumn<>("Раб.телефон");
    @FXML
    private TableColumn<Employees, SimpleStringProperty> mobilePhoneEmployeeColumn = new TableColumn<>("Моб.телефон");
    /////////////////////////////////////////////////////////////////////////////////////////


    /////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////'Таблица список дел'//////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private ObservableList<CaseList> caseListData = FXCollections.observableArrayList();
    @FXML
    private TableView<CaseList> caseList = new TableView<>();
    @FXML
    private TableColumn<CaseList, SimpleStringProperty> caseNumberColumn = new TableColumn<>("Номер дела");
    @FXML
    private TableColumn<CaseList, SimpleStringProperty> claimantsColumn = new TableColumn<>("Истцы");
    @FXML
    private TableColumn<CaseList, SimpleStringProperty> defendantsColumn= new TableColumn<>("Ответчики");
    @FXML
    private TableColumn<CaseList, SimpleStringProperty> litigationTypeColumn = new TableColumn<>("Вид спора");
    @FXML
    private TableColumn<CaseList, SimpleStringProperty> litigationSubjectColumn = new TableColumn<>("Предмет спора");
    @FXML
    private TableColumn<CaseList, SimpleStringProperty> courtNameColumn = new TableColumn<>("Название суда");
    @FXML
    private TableColumn<CaseList, SimpleStringProperty> stagesOfCaseColumn = new TableColumn<>("Стадия дела");
    @FXML
    private TableColumn<CaseList, SimpleStringProperty> instanceColumn = new TableColumn<>("Инстанция");
    @FXML
    private TableColumn<CaseList, SimpleDoubleProperty> claimSumColumn = new TableColumn<>("Сумма иска");
    /////////////////////////////////////////////////////////////////////////////////////////


    /////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////'Таблица подведомственность'//////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private ObservableList<Jurisdiction> jurisdictionData = FXCollections.observableArrayList();
    @FXML
    private TableView<Jurisdiction> jurisdictionTableView = new TableView<>();
    @FXML
    private TableColumn<Jurisdiction, SimpleStringProperty> jurisdiction_typeColumn = new TableColumn<>("Наименование");
    @FXML
    private TableColumn<Jurisdiction, SimpleStringProperty> noteColumn = new TableColumn<>("Примечание");
    /////////////////////////////////////////////////////////////////////////////////////////


    /////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////'Таблица наш статус в деле'///////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private ObservableList<StatusInCase> statusInCaseData = FXCollections.observableArrayList();
    @FXML
    private TableView<StatusInCase> statusInCaseTableView = new TableView<>();
    @FXML
    private TableColumn<StatusInCase, SimpleStringProperty> statusInCaseColumn = new TableColumn<>("Наименование");
    @FXML
    private TableColumn<StatusInCase, SimpleStringProperty> statusInCaseNoteColumn = new TableColumn<>("Примечание");
    /////////////////////////////////////////////////////////////////////////////////////////


    /////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////'Таблица вид спора'///////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private ObservableList<LitigationType> litigationTypeData = FXCollections.observableArrayList();
    @FXML
    private TableView<LitigationType> litigationTypeTableView = new TableView<>();
    @FXML
    private TableColumn<LitigationType, SimpleStringProperty> litigationTypeReferenceColumn = new TableColumn<>("Наименование");
    @FXML
    private TableColumn<LitigationType, SimpleStringProperty> litigationTypeNoteReferenceColumn = new TableColumn<>("Примечание");
    /////////////////////////////////////////////////////////////////////////////////////////


    /////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////'Таблица участник дела'///////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private ObservableList<CaseParticipant> caseParticipantData = FXCollections.observableArrayList();
    @FXML
    private TableView<CaseParticipant> caseParticipantTableView = new TableView<>();
    @FXML
    private TableColumn<CaseParticipant, SimpleStringProperty> shortNameParticipantColumn = new TableColumn<>("ФИО / Короткое наименование");
    @FXML
    private TableColumn<CaseParticipant, SimpleStringProperty> fullNameParticipantColumn = new TableColumn<>("ФИО / Полное наименование");
    @FXML
    private TableColumn<CaseParticipant, SimpleStringProperty> typePersonParticipantColumn = new TableColumn<>("Тип лица");
    @FXML
    private TableColumn<CaseParticipant, SimpleStringProperty> innParticipantColumn = new TableColumn<>("ИНН");
    @FXML
    private TableColumn<CaseParticipant, SimpleStringProperty> addressParticipantColumn = new TableColumn<>("Адрес");
    /////////////////////////////////////////////////////////////////////////////////////////


    /////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////'Таблица список судов'///////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private ObservableList<Courts> courtsListData = FXCollections.observableArrayList();
    @FXML
    private TableView<Courts> courtsListTableView = new TableView<>();
    @FXML
    private TableColumn<Courts, SimpleStringProperty> jurisdictionColumn = new TableColumn<>("Подведомственность");
    @FXML
    private TableColumn<Courts, SimpleStringProperty> courtsNameColumn = new TableColumn<>("Название суда");
    @FXML
    private TableColumn<Courts, SimpleStringProperty> courtAddressColumn = new TableColumn<>("Адрес суда");
    @FXML
    private TableColumn<Courts, SimpleStringProperty> additionalInfoColumn = new TableColumn<>("Доп. информация");
    /////////////////////////////////////////////////////////////////////////////////////////


    /////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////'Таблица список судей в суде'/////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private ObservableList<Judges> judgesListData = FXCollections.observableArrayList();
    @FXML
    private TableView<Judges> judgesListTableView = new TableView<>();
    @FXML
    private TableColumn<Judges, SimpleStringProperty> surnameJudgeColumn = new TableColumn<>("Фамилия");
    @FXML
    private TableColumn<Judges, SimpleStringProperty> nameJudgeColumn = new TableColumn<>("Имя");
    @FXML
    private TableColumn<Judges, SimpleStringProperty> patronymicJudgeColumn = new TableColumn<>("Отчество");
    @FXML
    private TableColumn<Judges, SimpleStringProperty> phoneJudgeColumn = new TableColumn<>("Телефон");
    /////////////////////////////////////////////////////////////////////////////////////////


    /////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////'Таблица инстанции в деле'////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private ObservableList<Instance> InstanceListData = FXCollections.observableArrayList();
    @FXML
    private TableView<Instance> CourtInstanceTableView = new TableView<>();
    @FXML
    private TableColumn<Instance, SimpleStringProperty> instanceNameColumn = new TableColumn<Instance, SimpleStringProperty>("Наименование инстанции");
    @FXML
    private TableColumn<Instance, SimpleStringProperty> nameCourtInstanceColumn = new TableColumn<Instance, SimpleStringProperty>("Наименование суда");
    /////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initCaseList();
        initJurisdictionData();
        initStatusInCaseData();
        initCaseParticipantData();
        initСourtsListData();
        initjudgesListData();
        initInstanceListData();
        initLitigationTypeData();
        initEmployeesListData();

        // заполняем таблицы данными
        caseList.setItems(caseListData);
        jurisdictionTableView.setItems(jurisdictionData);
        statusInCaseTableView.setItems(statusInCaseData);
        caseParticipantTableView.setItems(caseParticipantData);
        courtsListTableView.setItems(courtsListData);
        judgesListTableView.setItems(judgesListData);
        CourtInstanceTableView.setItems(InstanceListData);
        litigationTypeTableView.setItems(litigationTypeData);
        employeesListTableView.setItems(employeesListData);

        // устанавливаем тип и значение которое должно хранится в колонке
        surnameEmployeeColumn.setCellValueFactory(new PropertyValueFactory<Employees, SimpleStringProperty>("surname"));
        nameEmployeeColumn.setCellValueFactory(new PropertyValueFactory<Employees, SimpleStringProperty>("name"));
        patronymicEmployeeColumn.setCellValueFactory(new PropertyValueFactory<Employees, SimpleStringProperty>("patronymic"));
        dayOfBirthdayEmployeeColumn.setCellValueFactory(new PropertyValueFactory<Employees, SimpleStringProperty>("dayOfBirthday"));
        positionEmployeeColumn.setCellValueFactory(new PropertyValueFactory<Employees, SimpleStringProperty>("position"));
        emailEmployeeColumn.setCellValueFactory(new PropertyValueFactory<Employees, SimpleStringProperty>("email"));
        workPhoneEmployeeColumn.setCellValueFactory(new PropertyValueFactory<Employees, SimpleStringProperty>("workPhone"));
        mobilePhoneEmployeeColumn.setCellValueFactory(new PropertyValueFactory<Employees, SimpleStringProperty>("mobilePhone"));

        litigationTypeReferenceColumn.setCellValueFactory(new PropertyValueFactory<LitigationType, SimpleStringProperty>("litigationType"));
        litigationTypeNoteReferenceColumn.setCellValueFactory(new PropertyValueFactory<LitigationType, SimpleStringProperty>("note"));

        instanceNameColumn.setCellValueFactory(new PropertyValueFactory<Instance, SimpleStringProperty>("instanceName"));
        nameCourtInstanceColumn.setCellValueFactory(new PropertyValueFactory<Instance, SimpleStringProperty>("nameCourtInstance"));

        surnameJudgeColumn.setCellValueFactory(new PropertyValueFactory<Judges, SimpleStringProperty>("surnameJudge"));
        nameJudgeColumn.setCellValueFactory(new PropertyValueFactory<Judges, SimpleStringProperty>("nameJudge"));
        patronymicJudgeColumn.setCellValueFactory(new PropertyValueFactory<Judges, SimpleStringProperty>("patronymicJudge"));
        phoneJudgeColumn.setCellValueFactory(new PropertyValueFactory<Judges, SimpleStringProperty>("phoneJudge"));

        caseNumberColumn.setCellValueFactory(new PropertyValueFactory<CaseList, SimpleStringProperty>("caseNumber"));
        claimantsColumn.setCellValueFactory(new PropertyValueFactory<CaseList, SimpleStringProperty>("claimants"));
        defendantsColumn.setCellValueFactory(new PropertyValueFactory<CaseList, SimpleStringProperty>("defendants"));
        litigationTypeColumn.setCellValueFactory(new PropertyValueFactory<CaseList, SimpleStringProperty>("litigationType"));
        litigationSubjectColumn.setCellValueFactory(new PropertyValueFactory<CaseList, SimpleStringProperty>("litigationSubject"));
        courtNameColumn.setCellValueFactory(new PropertyValueFactory<CaseList, SimpleStringProperty>("courtName"));
        stagesOfCaseColumn.setCellValueFactory(new PropertyValueFactory<CaseList, SimpleStringProperty>("stagesOfCase"));
        instanceColumn.setCellValueFactory(new PropertyValueFactory<CaseList, SimpleStringProperty>("instance"));
        claimSumColumn.setCellValueFactory(new PropertyValueFactory<CaseList, SimpleDoubleProperty>("claimSum"));

        jurisdiction_typeColumn.setCellValueFactory(new PropertyValueFactory<Jurisdiction, SimpleStringProperty>("jurisdiction_type"));
        noteColumn.setCellValueFactory(new PropertyValueFactory<Jurisdiction, SimpleStringProperty>("note"));

        statusInCaseColumn.setCellValueFactory(new PropertyValueFactory<StatusInCase, SimpleStringProperty>("statusInCase"));
        statusInCaseNoteColumn.setCellValueFactory(new PropertyValueFactory<StatusInCase, SimpleStringProperty>("note"));

        shortNameParticipantColumn.setCellValueFactory(new PropertyValueFactory<CaseParticipant, SimpleStringProperty>("shortNameParticipant"));
        fullNameParticipantColumn.setCellValueFactory(new PropertyValueFactory<CaseParticipant, SimpleStringProperty>("fullNameParticipant"));
        typePersonParticipantColumn.setCellValueFactory(new PropertyValueFactory<CaseParticipant, SimpleStringProperty>("typePersonParticipant"));
        innParticipantColumn.setCellValueFactory(new PropertyValueFactory<CaseParticipant, SimpleStringProperty>("innParticipant"));
        addressParticipantColumn.setCellValueFactory(new PropertyValueFactory<CaseParticipant, SimpleStringProperty>("addressParticipant"));

        jurisdictionColumn.setCellValueFactory(new PropertyValueFactory<Courts, SimpleStringProperty>("jurisdiction"));
        courtsNameColumn.setCellValueFactory(new PropertyValueFactory<Courts, SimpleStringProperty>("courtName"));
        courtAddressColumn.setCellValueFactory(new PropertyValueFactory<Courts, SimpleStringProperty>("courtAddress"));
        additionalInfoColumn.setCellValueFactory(new PropertyValueFactory<Courts, SimpleStringProperty>("additionalInfo"));

        typePersonComboBox.setItems(typePerson);
        genderEmployeeComboBox.setItems(genderEmployee);
        jurisdictionComboBox.setItems(jurisdiction);
        positionComboBox.setItems(position);
    }
    // подготавливаем данные для таблиц
    private void initEmployeesListData() {
        employeesListData.add(new Employees("Авдошин", "Борис", "Валерьевич", "1988-11-30", "Старший юрисконсульт", "avdoshinbv@justic.ru", "88125451234", "89814456712"));
        employeesListData.add(new Employees("Разумков", "Олег", "Максимович", "1989-07-04", "Юрисконсульт", "razumkovom@justic.ru", "88125451233", "89813338911"));
        employeesListData.add(new Employees("Петрова", "Жанна", "Вадимовна", "1993-11-28", "Ведущий юрисконсульт", "petrovajv@justic.ru", "88125451247", "89814467239"));
        employeesListData.add(new Employees("Ларина", "Оксана", "Андреевна", "1999-02-25", "Главный юрисконсульт", "larinaoa@justic.ru", "88125451241", "89818734915"));
        employeesListData.add(new Employees("Царёва", "Светлана", "Владимировна", "1982-06-16", "Начальник отдела", "caryovasv@justic.ru", "88125451231", "89818385545"));
        employeesListData.add(new Employees("Пирогова", "Виктория", "Евгеньевна", "1983-11-10", "Юрисконсульт", "pirogovave@justice.ru", "88125451222", "89815561234"));
    }

    private void initLitigationTypeData() {
        litigationTypeData.add(new LitigationType("Исковое производство", ""));
        litigationTypeData.add(new LitigationType("Особое производство", ""));
        litigationTypeData.add(new LitigationType("Оспаривание нормативных правовых актов", ""));
        litigationTypeData.add(new LitigationType("Оспаривание ненормативных правовых актов", ""));
    }

    private void initInstanceListData() {
//        InstanceListData.add(new Instance("Первая инстанция", "Выборгский районный суд Санкт-Петербурга"));
    }

    private void initjudgesListData() {
        judgesListData.add(new Judges("Глазачева", "Светлана", "Юрьевна", "8 (812) 247-48-53"));
    }

    private void initСourtsListData() {
        courtsListData.add(new Courts("Арбитражный суд", "Арбитражный суд Санкт-Петербурга и ЛО", "191124, Санкт-Петербург, ул. Смольного д.6", ""));
        courtsListData.add(new Courts("Федеральный суд", "Василеостровский районный суд СПб", "199178,Санкт-Петербург, Средний пр.В.О., д.55", ""));
        courtsListData.add(new Courts("Федеральный суд", "Ленинский районный суд СПб", "Санкт-Петербург,ул.13я Красноармейская, д.17Б", ""));
        courtsListData.add(new Courts("Федеральный суд", "Смольнинский районный суд СПб", "191144, Санкт-Петербург, ул.Моисеенко, д.2А", ""));
        courtsListData.add(new Courts("Федеральный суд", "Невский районный суд СПб", "Санкт-Петербург, ул.Ольги Берггольц, д.12", ""));
        courtsListData.add(new Courts("Федеральный суд", "Выборгский районный суд Санкт-Петербурга", "194291, Санкт-Петербург, ул. Сантьяго-де-Куба, дом 3", ""));
    }

    private void initCaseParticipantData() {
        caseParticipantData.add(new CaseParticipant("Петров В.Г.", "Петров Василий Геннадьевич", "Физическое лицо", "945237891253", "Санкт-Петербург,Невский проспект, д.99, кв.1"));
        caseParticipantData.add(new CaseParticipant("Дрёмин О.К.", "Дрёмин Олег Кириллович", "Физическое лицо", "345237673129", "Санкт-Петербург, ул.Караванная, д.10, кв.2"));
        caseParticipantData.add(new CaseParticipant("Зимин Н.К.", "Зимнин Николай Фёдорович", "Физическое лицо", "977236553460", "Санкт-Петербург, ул.Конная, д. 4, кв. 5"));
        caseParticipantData.add(new CaseParticipant("Иванов А.П.", "Иванов Александр Петрович", "Физическое лицо", "875239753515", "Санкт-Петербург, ул.Садовая, д. 21, кв. 3"));
//        caseParticipantData.add(new CaseParticipant("Карпов С.Д.", "995255657825"));
        caseParticipantData.add(new CaseParticipant("Карпов С.Д.", "Карпов Сергей Денисович", "Физическое лицо", "995255657825", "Санкт-Петербург, ул.Садовая, д. 44, кв.15"));
        caseParticipantData.add(new CaseParticipant("Гарин П.Е.", "Гарин Пётр Евгеньевич", "Физическое лицо", "256671859111", "Санкт-Петербург, ул.Разъезжая, д. 18, кв.2"));
    }

    private void initStatusInCaseData() {
        statusInCaseData.add(new StatusInCase("Истец (заявитель)", ""));
        statusInCaseData.add(new StatusInCase("Ответчик", ""));
        statusInCaseData.add(new StatusInCase("Представитель ответчика", ""));
        statusInCaseData.add(new StatusInCase("Заинтересованное лицо", ""));
        statusInCaseData.add(new StatusInCase("Представитель заинтересованного лица", ""));
        statusInCaseData.add(new StatusInCase("Третье лицо", ""));
        statusInCaseData.add(new StatusInCase("Представитель третьего лица", ""));
    }

    private void initJurisdictionData() {
        jurisdictionData.add(new Jurisdiction("Арбитражный суд", ""));
        jurisdictionData.add(new Jurisdiction("Федеральный суд", ""));
        jurisdictionData.add(new Jurisdiction("Мировой суд", ""));
        jurisdictionData.add(new Jurisdiction("Верховный суд", ""));
    }

    private void initCaseList () {
        caseListData.add(new CaseList("2-1055/2022", "Петров Василий Геннадьевич", "Иванов Александр Петрович",
                "Исковое производство", "Иные споры", "Ленинский районный суд СПб", "Предъявлен иск (заявление)", "Первая инстанция", 500000.00));
        caseListData.add(new CaseList("2-1079/2022", "Дрёмин Олег Кириллович", "Карпов Сергей Денисович",
                "Исковое производство", "Иные споры", "Ленинский районный суд СПб", "Вынесено решение", "Первая инстанция", 823500.00));
        caseListData.add(new CaseList("2-2246/2022", "Зимнин Николай Фёдорович", "Гарин Пётр Евгеньевич",
                "Исковое производство", "Иные споры", "Невский районный суд СПб", "Принято к рассмотрению", "Первая инстанция", 885120.00));
    }

    public void loadPane (MouseEvent event) throws IOException {
        Pane newLoadedPane = FXMLLoader.load(getClass().getResource("loadCaseListPane.fxml"));
        mainJusticePane.getChildren().add(newLoadedPane);
    }

    public void loadCalendar (MouseEvent event) throws IOException {
        Pane newLoadedPane = FXMLLoader.load(getClass().getResource("loadCalendarPane.fxml"));
        mainJusticePane.getChildren().clear();
        mainJusticePane.getChildren().add(newLoadedPane);
    }

    public void loadEmployeesPane (MouseEvent event) throws IOException {
        Pane newLoadedPane = FXMLLoader.load(getClass().getResource("loadEmployeesPane.fxml"));
        mainJusticePane.getChildren().clear();
        mainJusticePane.getChildren().add(newLoadedPane);
    }

    public void loadMainReferencePane (MouseEvent event) throws IOException {
        mainJusticePane.getChildren().clear();
    }

    public void loadReferenceBookPane (ActionEvent event) throws IOException {
        Pane newLoadedPane = FXMLLoader.load(getClass().getResource("loadReferenceBookPane.fxml"));
        mainJusticePane.getChildren().clear();
        mainJusticePane.getChildren().add(newLoadedPane);
    }

    public void loadCourtListPane (ActionEvent event) throws IOException {
        Pane newLoadedPane = FXMLLoader.load(getClass().getResource("loadCourtListPane.fxml"));
        mainJusticePane.getChildren().clear();
        mainJusticePane.getChildren().add(newLoadedPane);
    }

    public void loadParticipantsCasePane (MouseEvent event) throws IOException {
        Pane newLoadedPane = FXMLLoader.load(getClass().getResource("loadParticipantsCasePane.fxml"));
        mainJusticePane.getChildren().clear();
        mainJusticePane.getChildren().add(newLoadedPane);
    }

    public void loadLitigationWorkReportPane (MouseEvent event) throws IOException {
        Pane newLoadedPane = FXMLLoader.load(getClass().getResource("loadLitigationWorkReportPane.fxml"));
        mainJusticePane.getChildren().clear();
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

    public void editJurisdiction (ActionEvent event) throws IOException {
        JusticeController.flagReferenceBook = 1;
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
        JusticeController.flagReferenceBook = 2;
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

    // добавить участника дела из существующих в справочнике
    public void addCaseParticipants (ActionEvent event) throws IOException {
        Stage addCaseParticipantsStage = new Stage();
        Parent addCaseParticipantsRoot = FXMLLoader.load(getClass().getResource("viewParticipantsCase.fxml"));
        Scene addCaseParticipantsScene = new Scene(addCaseParticipantsRoot);
        addCaseParticipantsStage.setTitle("Добавить сторону по делу");
        addCaseParticipantsStage.setScene(addCaseParticipantsScene);
        addCaseParticipantsStage.sizeToScene();
        addCaseParticipantsStage.setResizable(false);
        addCaseParticipantsStage.setAlwaysOnTop(true);
        addCaseParticipantsStage.show();
    }

    // создать в справочнике нового участника дела
    public void createCaseParticipants (ActionEvent event) throws IOException {
        Stage createCaseParticipantsStage = new Stage();
        Parent createCaseParticipantsRoot = FXMLLoader.load(getClass().getResource("createParticipantsCase.fxml"));
        Scene createCaseParticipantsScene = new Scene(createCaseParticipantsRoot);
        createCaseParticipantsStage.setTitle("Создать участника дела");
        createCaseParticipantsStage.setScene(createCaseParticipantsScene);
        createCaseParticipantsStage.sizeToScene();
        createCaseParticipantsStage.setResizable(false);
        createCaseParticipantsStage.setAlwaysOnTop(true);
        createCaseParticipantsStage.show();
    }

    // редактировать участника дела в справочнике
    public void editCaseParticipants (ActionEvent event) throws IOException {
        Stage createCaseParticipantsStage = new Stage();
        Parent createCaseParticipantsRoot = FXMLLoader.load(getClass().getResource("createParticipantsCase.fxml"));
        Scene createCaseParticipantsScene = new Scene(createCaseParticipantsRoot);
        createCaseParticipantsStage.setTitle("Создать участника дела");
        createCaseParticipantsStage.setScene(createCaseParticipantsScene);
        createCaseParticipantsStage.sizeToScene();
        createCaseParticipantsStage.setResizable(false);
        createCaseParticipantsStage.setAlwaysOnTop(true);
        createCaseParticipantsStage.show();
    }


    public void deleteCaseParticipants (ActionEvent event) throws IOException {

    }

    public void selectTypePerson (ActionEvent event) throws IOException {
        if(typePersonComboBox.getValue().equals("Физическое лицо")) {
            Pane newLoadedPane = FXMLLoader.load(getClass().getResource("createParticipantsCase(individual).fxml"));
            createParticipantsCase.getChildren().clear();
            createParticipantsCase.getChildren().add(newLoadedPane);
        }
        else if(typePersonComboBox.getValue().equals("Юридическое лицо")) {
            Pane newLoadedPane = FXMLLoader.load(getClass().getResource("createParticipantsCase(entity).fxml"));
            createParticipantsCase.getChildren().clear();
            createParticipantsCase.getChildren().add(newLoadedPane);
        }
    }

    // Добавление нового значения в справочник
    public void insertReferenceValue(ActionEvent event) {
        dbHandler.insertReferenceValue(flagReferenceBook, name_ReferenceValue.getText(), note_ReferenceValue.getText());
        Stage stage = (Stage) createReferenceValueOKBtn.getScene().getWindow();
        stage.close();
    }

    public void addEmployee (ActionEvent event) throws IOException {
        Stage addEmployeeStage = new Stage();
        Parent addEmployeeRoot = FXMLLoader.load(getClass().getResource("createEmployee.fxml"));
        Scene addEmployeeScene = new Scene(addEmployeeRoot);
        addEmployeeStage.setTitle("Добавить нового сотрудника");
        addEmployeeStage.setScene(addEmployeeScene);
        addEmployeeStage.sizeToScene();
        addEmployeeStage.setResizable(false);
        addEmployeeStage.setAlwaysOnTop(true);
        addEmployeeStage.show();
    }

    public void editEmployee (ActionEvent event) throws IOException {
        Stage addEmployeeStage = new Stage();
        Parent addEmployeeRoot = FXMLLoader.load(getClass().getResource("createEmployee.fxml"));
        Scene addEmployeeScene = new Scene(addEmployeeRoot);
        addEmployeeStage.setTitle("Редактировать сотрудника");
        addEmployeeStage.setScene(addEmployeeScene);
        addEmployeeStage.sizeToScene();
        addEmployeeStage.setResizable(false);
        addEmployeeStage.setAlwaysOnTop(true);
        addEmployeeStage.show();
    }

    public void deleteEmployee (ActionEvent event) throws IOException {

    }

    public void selectGenderEmployee (ActionEvent event) throws IOException {

    }

    public void addHistoricalRecord (ActionEvent event) throws IOException {
        Stage addHistoricalRecordStage = new Stage();
        Parent addHistoricalRecordRoot = FXMLLoader.load(getClass().getResource("createHistoricalRecord.fxml"));
        Scene addHistoricalRecordScene = new Scene(addHistoricalRecordRoot);
        addHistoricalRecordStage.setTitle("Добавить историческую запись");
        addHistoricalRecordStage.setScene(addHistoricalRecordScene);
        addHistoricalRecordStage.sizeToScene();
        addHistoricalRecordStage.setResizable(false);
        addHistoricalRecordStage.setAlwaysOnTop(true);
        addHistoricalRecordStage.show();
    }

    public void deleteHistoricalRecord (ActionEvent event) throws IOException {
    }

    public void createNewCourtInList (ActionEvent event) throws IOException {
        Stage createNewCourtInListStage = new Stage();
        Parent createNewCourtInRoot = FXMLLoader.load(getClass().getResource("newCourtToReferenceBooks.fxml"));
        Scene createNewCourtInScene = new Scene(createNewCourtInRoot);
        createNewCourtInListStage.setTitle("Создать новый суд в справочнике");
        createNewCourtInListStage.setScene(createNewCourtInScene);
        createNewCourtInListStage.sizeToScene();
        createNewCourtInListStage.setResizable(false);
        createNewCourtInListStage.setAlwaysOnTop(true);
        createNewCourtInListStage.show();
    }

    public void editCourtInList (ActionEvent event) throws IOException {
        Stage editCourtInListStage = new Stage();
        Parent editCourtInListRoot = FXMLLoader.load(getClass().getResource("newCourtToReferenceBooks.fxml"));
        Scene editCourtInListScene = new Scene(editCourtInListRoot);
        editCourtInListStage.setTitle("Редактировать суд в справочнике");
        editCourtInListStage.setScene(editCourtInListScene);
        editCourtInListStage.sizeToScene();
        editCourtInListStage.setResizable(false);
        editCourtInListStage.setAlwaysOnTop(true);
        editCourtInListStage.show();
    }

    public void deleteCourtFromList (ActionEvent event) throws IOException {
    }

    public void addJudgeInList (ActionEvent event) throws IOException {
        Stage addJudgeInListStage = new Stage();
        Parent addJudgeInListRoot = FXMLLoader.load(getClass().getResource("newJudgeToReferenceBooks.fxml"));
        Scene addJudgeInListScene = new Scene(addJudgeInListRoot);
        addJudgeInListStage.setTitle("Добавить судью в суд");
        addJudgeInListStage.setScene(addJudgeInListScene);
        addJudgeInListStage.sizeToScene();
        addJudgeInListStage.setResizable(false);
        addJudgeInListStage.setAlwaysOnTop(true);
        addJudgeInListStage.show();
    }

    public void deleteJudgeFromList (ActionEvent event) throws IOException {
    }

    public void createInstance (ActionEvent event) throws IOException {
        Stage createCaseStage = new Stage();
        Parent createCaseRoot = FXMLLoader.load(getClass().getResource("createInstance.fxml"));
        Scene createCaseScene = new Scene(createCaseRoot);
        createCaseStage.setTitle("Создать инстанцию");
        createCaseStage.setScene(createCaseScene);
        createCaseStage.sizeToScene();
        createCaseStage.setResizable(false);
        createCaseStage.setAlwaysOnTop(true);
        createCaseStage.show();
    }

    public void createFirstInstance (ActionEvent event) throws IOException {
        Stage createFirstInstanceStage = new Stage();
        Parent createFirstInstanceRoot = FXMLLoader.load(getClass().getResource("createFirstInstance.fxml"));
        Scene createFirstInstanceScene = new Scene(createFirstInstanceRoot);
        createFirstInstanceStage.setTitle("Первая инстанция");
        createFirstInstanceStage.setScene(createFirstInstanceScene);
        createFirstInstanceStage.sizeToScene();
        createFirstInstanceStage.setResizable(false);
        createFirstInstanceStage.setAlwaysOnTop(true);
        createFirstInstanceStage.show();
    }

    public void addCourtFromList (ActionEvent event) throws IOException {
        Stage addCourtFromListStage = new Stage();
        Parent addCourtFromListRoot = FXMLLoader.load(getClass().getResource("viewCourtList.fxml"));
        Scene addCourtFromListScene = new Scene(addCourtFromListRoot);
        addCourtFromListStage.setTitle("Список судов");
        addCourtFromListStage.setScene(addCourtFromListScene);
        addCourtFromListStage.sizeToScene();
        addCourtFromListStage.setResizable(false);
        addCourtFromListStage.setAlwaysOnTop(true);
        addCourtFromListStage.show();
    }






}
