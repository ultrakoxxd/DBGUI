package com.ultrakox.dbgui.dbgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class DBView extends Application {
    @Override
    public void start(Stage DBStage)throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("db-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        DBStage.setTitle("Hello!");
        DBStage.setScene(scene);
        DBStage.show();
    }
}
