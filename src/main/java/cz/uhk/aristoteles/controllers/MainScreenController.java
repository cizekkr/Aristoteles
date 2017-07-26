package cz.uhk.aristoteles.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class MainScreenController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private AnchorPane newContentPane;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(newContentPane.getChildren().isEmpty()) {
            AnchorPane addedContent = FXMLLoader.load(getClass().getResource("/fxml/AddedWindow.fxml"));
            newContentPane.getChildren().add(addedContent);
        }else {
            newContentPane.getChildren().clear();
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
