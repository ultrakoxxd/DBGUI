package com.ultrakox.dbgui.dbgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

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
            Connection connection = DriverManager.getConnection(usernameText, url,passwdText);

            System.out.println("Connected to database");
        } catch (SQLException e) {
            System.out.println("Oops, error!");
            e.printStackTrace();
        }
    }
}