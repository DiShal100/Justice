package com.example.justice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler extends Configs {
    private Connection dbConnection;

    public  DatabaseHandler () {
        String connectionPath = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection = DriverManager.getConnection(connectionPath, dbUser, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Добавление новых значений в справочные таблицы
    public void insertReferenceValue (int flag, String name_ReferenceValue, String note_ReferenceValue)  {
        switch(flag) {
            case(1) : String insertLitigationType = "INSERT INTO " +
                    Const.LITIGATION_TYPE_TABLE + "(" +
                    Const.LITIGATION_TYPE + "," + Const.LITIGATION_TYPE_NOTE + ")" +
                    "VALUES(?,?)";
                try {
                    PreparedStatement preparedStatement = dbConnection.prepareStatement(insertLitigationType);
                    preparedStatement.setString(1, name_ReferenceValue);
                    preparedStatement.setString(2, note_ReferenceValue);
                    preparedStatement.executeUpdate();
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
                ; break;
            case(2) : String insertLitigationSubject = "INSERT INTO " +
                    Const.LITIGATION_SUBJECT_TABLE + "(" +
                    Const.LITIGATION_SUBJECT + "," + Const.LITIGATION_SUBJECT_NOTE + ")" +
                    "VALUES(?,?)";
                try {
                    PreparedStatement preparedStatement = dbConnection.prepareStatement(insertLitigationSubject);
                    preparedStatement.setString(1, name_ReferenceValue);
                    preparedStatement.setString(2, note_ReferenceValue);
                    preparedStatement.executeUpdate();
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
                ; break;
            case(3) : String insertJurisdiction = "INSERT INTO " +
                    Const.JURISDICTION_TABLE + "(" +
                    Const.JURISDICTION_TYPE + "," + Const.JURISDICTION_NOTE + ")" +
                    "VALUES(?,?)";
                try {
                    PreparedStatement preparedStatement = dbConnection.prepareStatement(insertJurisdiction);
                    preparedStatement.setString(1, name_ReferenceValue);
                    preparedStatement.setString(2, note_ReferenceValue);
                    preparedStatement.executeUpdate();
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
                ; break;
            case(4) : String insertStageOfCase = "INSERT INTO " +
                    Const.STAGES_OF_CASES_TABLE + "(" +
                    Const.STAGES_OF_CASES + "," + Const.STAGES_OF_CASES_NOTE + ")" +
                    "VALUES(?,?)";
                try {
                    PreparedStatement preparedStatement = dbConnection.prepareStatement(insertStageOfCase);
                    preparedStatement.setString(1, name_ReferenceValue);
                    preparedStatement.setString(2, note_ReferenceValue);
                    preparedStatement.executeUpdate();
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
                ; break;
            case(5) : String insertStatusInCase = "INSERT INTO " +
                    Const.STATUS_IN_CASE_TABLE + "(" +
                    Const.STATUS_IN_CASE + "," + Const.STATUS_IN_CASE_NOTE + ")" +
                    "VALUES(?,?)";
                try {
                    PreparedStatement preparedStatement = dbConnection.prepareStatement(insertStatusInCase);
                    preparedStatement.setString(1, name_ReferenceValue);
                    preparedStatement.setString(2, note_ReferenceValue);
                    preparedStatement.executeUpdate();
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
                ; break;
            case(6) : String insertTypeHistoryRecord = "INSERT INTO " +
                    Const.TYPE_HISTORY_RECORD_TABLE + "(" +
                    Const.TYPE_HISTORY_RECORD + "," + Const.TYPE_HISTORY_RECORD_NOTE + ")" +
                    "VALUES(?,?)";
                try {
                    PreparedStatement preparedStatement = dbConnection.prepareStatement(insertTypeHistoryRecord);
                    preparedStatement.setString(1, name_ReferenceValue);
                    preparedStatement.setString(2, note_ReferenceValue);
                    preparedStatement.executeUpdate();
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
                ; break;
            case(7) : String insertFirstInstanceResult = "INSERT INTO " +
                    Const.FIRST_INSTANCE_RESULT_TABLE + "(" +
                    Const.FIRST_INSTANCE_RESULT + "," + Const.FIRST_INSTANCE_RESULT_NOTE + ")" +
                    "VALUES(?,?)";
                try {
                    PreparedStatement preparedStatement = dbConnection.prepareStatement(insertFirstInstanceResult);
                    preparedStatement.setString(1, name_ReferenceValue);
                    preparedStatement.setString(2, note_ReferenceValue);
                    preparedStatement.executeUpdate();
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
                ; break;
            case(8) : String insertAppealResult = "INSERT INTO " +
                    Const.APPEAL_RESULT_TABLE + "(" +
                    Const.APPEAL_RESULT + "," + Const.APPEAL_RESULT_NOTE + ")" +
                    "VALUES(?,?)";
                try {
                    PreparedStatement preparedStatement = dbConnection.prepareStatement(insertAppealResult);
                    preparedStatement.setString(1, name_ReferenceValue);
                    preparedStatement.setString(2, note_ReferenceValue);
                    preparedStatement.executeUpdate();
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
                ; break;
            case(9) : String insertCassationResult = "INSERT INTO " +
                    Const.CASSATION_RESULT_TABLE + "(" +
                    Const.CASSATION_RESULT + "," + Const.CASSATION_RESULT_NOTE + ")" +
                    "VALUES(?,?)";
                try {
                    PreparedStatement preparedStatement = dbConnection.prepareStatement(insertCassationResult);
                    preparedStatement.setString(1, name_ReferenceValue);
                    preparedStatement.setString(2, note_ReferenceValue);
                    preparedStatement.executeUpdate();
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
                ; break;
            case(10) : String insertSupervisionResult = "INSERT INTO " +
                    Const.SUPERVISION_RESULT_TABLE + "(" +
                    Const.SUPERVISION_RESULT + "," + Const.SUPERVISION_RESULT_NOTE + ")" +
                    "VALUES(?,?)";
                try {
                    PreparedStatement preparedStatement = dbConnection.prepareStatement(insertSupervisionResult);
                    preparedStatement.setString(1, name_ReferenceValue);
                    preparedStatement.setString(2, note_ReferenceValue);
                    preparedStatement.executeUpdate();
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
                ; break;
        }
    }
}
