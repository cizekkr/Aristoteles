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
import javafx.scene.image.ImageView;
import cz.uhk.aristoteles.app.AppImage;

/**
 * FXML Controller class
 *
 * @author Adam Černohorský
 */
public class RoomPreviewController implements Initializable, RoomFillable {

    @FXML
    private Label lblRoomNumber;

    @FXML
    private ImageView imgSeaView;
    
    @FXML
    private ImageView imgFridge;
    
    @FXML
    private ImageView imgClimatization;
    
    @FXML
    private ImageView imgBalcony;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeImagesProperties();
    }

    @Override
    public void fill(Room room) {

        lblRoomNumber.setText(room.getRoomNumber());
        imgSeaView.setImage(AppImage.SEA_VIEW.getImage());
        if (!room.hasSeaView()) {
            imgSeaView.setOpacity(0.3);
        }
        imgFridge.setImage(AppImage.FRIDGE.getImage());
        if (!room.hasFridge()) {
            imgFridge.setOpacity(0.3);
        }
        imgClimatization.setImage(AppImage.CLIMATIZATION.getImage());
        if (!room.hasClimatezation()) {
            imgClimatization.setOpacity(0.3);
        }
        imgBalcony.setImage(AppImage.BALCONY.getImage());
        if (!room.hasBalcony()) {
            imgBalcony.setOpacity(0.3);
        }
    }
    private void initializeImagesProperties(){
        imgSeaView.setCache(true);
        imgSeaView.setSmooth(true);
        
        imgFridge.setCache(true);
        imgFridge.setSmooth(true);
        
        imgClimatization.setCache(true);
        imgClimatization.setSmooth(true);
        
        imgBalcony.setCache(true);
        imgBalcony.setSmooth(true);
        
    }

}
