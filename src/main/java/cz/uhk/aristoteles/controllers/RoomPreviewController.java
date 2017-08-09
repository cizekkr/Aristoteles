/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.uhk.aristoteles.controllers;

import cz.uhk.aristoteles.app.Room;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Adam Černohorský
 */
public class RoomPreviewController implements Initializable, RoomFillable{
    
    @FXML
    private Label lblRoomNumber;
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void fill(Room room) {
        
        lblRoomNumber.setText(room.getRoomNumber());
        
    }
    
}
