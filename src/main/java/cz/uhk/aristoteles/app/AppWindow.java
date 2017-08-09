/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.uhk.aristoteles.app;

import cz.uhk.aristoteles.controllers.RoomFillable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Adam Černohorský
 */
public class AppWindow {

    private AnchorPane windowPane;
    private Object controller;

    public AppWindow(Window window) {
        String path = window.getPath();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(path));
        try {
            windowPane = fxmlLoader.load();
        } catch (IOException ex) {
            Logger.getLogger(AppWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        controller = fxmlLoader.getController();
    }

    public AnchorPane getWindowPane() {
        return windowPane;
    }

    public RoomFillable getControllerForRoomFillable() {
        if (!(controller instanceof RoomFillable)) {
            Logger.getLogger(AppWindow.class.getName()).log(Level.SEVERE, "Controller is not instance of RoomFillable", new ClassCastException());
            return null;
        }
        return (RoomFillable) controller;
    }

}
