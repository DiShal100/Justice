package com.example.justice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Justice extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mainJusticePane.fxml"));
        Scene scene = new Scene(root, 1280, 700);
        primaryStage.setTitle("Justice");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
