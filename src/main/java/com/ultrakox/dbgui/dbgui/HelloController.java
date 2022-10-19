package com.ultrakox.dbgui.dbgui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloController {
    @FXML
     TextField username;

    @FXML
     PasswordField passwd;


    @FXML
    public void onSubmitLoginButton() {
        String usernameText = username.getText();
        String passwdText = passwd.getText();

        String url = "jdbc:mysql://localhost:3306/GuiTest";


        try {
            Connection connection = DriverManager.getConnection(url, usernameText, passwdText);


            System.out.println("Connected to database");
            ScreenController screenController = new ScreenController();
            screenController.addScreen("DBView", FXMLLoader.load(getClass().getResource("db-view.fxml")));
            screenController.activate("DBView");
        } catch (SQLException e) {
            System.out.println("Oops, error!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Oops, error! v2");
            throw new RuntimeException(e);
        }
    }
}