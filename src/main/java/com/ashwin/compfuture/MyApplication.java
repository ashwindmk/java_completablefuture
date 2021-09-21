package com.ashwin.compfuture;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("comp-future: start: " + Thread.currentThread().getName());
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("comp-future: stop: " + Thread.currentThread().getName());
    }
}
