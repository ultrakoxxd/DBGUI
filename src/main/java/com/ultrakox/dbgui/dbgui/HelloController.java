package com.ultrakox.dbgui.dbgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
     TextField username;

    @FXML
     PasswordField passwd;



    @FXML
    public void onSubmitLoginButton(ActionEvent event) throws IOException {
        String usernameText = username.getText();
        String passwdText = passwd.getText();

        String url = "jdbc:mysql://localhost:3306/GuiTest";


        try {
            Connection connection = DriverManager.getConnection(url, usernameText, passwdText);

            System.out.println("Connected to database");

            Parent root = FXMLLoader.load(getClass().getResource("db-view.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setMaximized(true);
            stage.show();
        } catch (SQLException e) {
            System.out.println("Oops, error!");
            e.printStackTrace();
        }
    }
}