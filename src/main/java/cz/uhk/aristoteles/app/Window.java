/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.uhk.aristoteles.app;

/**
 *
 * @author Adam Černohorský
 */
public enum Window {
    
    MAIN_SCREEN("/fxml/MainScreen.fxml"),
    ROOM_PREVIEW("/fxml/RoomPreview.fxml");

    private final String PATH;

    private Window(String path) {
        this.PATH = path;
    }

    public String getPath() {
        return PATH;
    }
    
    
}
