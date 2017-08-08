/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.uhk.aristoteles.app;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Adam Černohorský
 */
public enum AppWindow {
    MAIN_SCREEN("/fxml/MainScreen.fxml"),
    ROOM_PREVIEW("/fxml/RoomPreview.fxml");

    private final String PATH;

    private AppWindow(String path) {
        this.PATH = path;
    }

    public AnchorPane getWindow(){
        try {
            return FXMLLoader.load(getClass().getResource(PATH));
        } catch (IOException ex) {
            Logger.getLogger(AppWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
 
}
