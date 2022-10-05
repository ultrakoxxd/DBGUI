package com.ultrakox.dbgui.dbgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

public class HelloController {
    @FXML
     TextField username;

    @FXML
     PasswordField passwd;


    @FXML
    public void onSubmitLoginButton() {
        String usernameText = username.getText();
        String passwdText = passwd.getText();
    }
}