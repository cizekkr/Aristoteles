/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.uhk.aristoteles.controllers;

import cz.uhk.aristoteles.app.Session;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Adam Černohorský
 */
public class LoginScreenController implements Initializable {

    @FXML
    private TextField txtUserName;
    
    @FXML
    private TextField txtPassword;
    
    @FXML
    private Label lblLoginDialog;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
    @FXML
    private void login(ActionEvent event){
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        
        Map<String, String> usersMap = Session.getDatabase().getUsersMap();
        if (!usersMap.containsKey(userName)){
            lblLoginDialog.setText("Ales gutte nicht - jmeno");
            return;
        }
        if (!usersMap.get(userName).equals(password)){
            lblLoginDialog.setText("Ales gutte niicht- heslo");
            return;
        }
        lblLoginDialog.setText("Ales gutte");
    }
}
