package cz.uhk.aristoteles.controllers;

import cz.uhk.aristoteles.app.Room;
import cz.uhk.aristoteles.app.Session;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class MainScreenController implements Initializable {

    @FXML
    private Button btnShowAllRooms;

    @FXML
    private AnchorPane aPaneRoomPane;

    @FXML
    private void showAllRooms(ActionEvent event) throws IOException {
        List<Room> rooms = Session.getDatabase().getAllRooms();
        for (int i = 0; i < rooms.size(); i++) {
            AnchorPane room = FXMLLoader.load(getClass().getResource("/fxml/RoomPreview.fxml"));
            aPaneRoomPane.getChildren().add(room);
            setRoomPreviewLayout(room, i);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private void setRoomPreviewLayout(AnchorPane room, int roomNumberInList) {
        int roomPaneWidth = (int) aPaneRoomPane.getWidth();
        int roomPreviewHeight = (int) room.getPrefHeight();
        int roomPreviewWidth = (int) room.getPrefWidth();
        int period = roomPaneWidth / roomPreviewWidth;

        int row = roomNumberInList / period;
        int column = roomNumberInList % period;

        int paddingX = (roomPaneWidth % roomPreviewWidth) / (period + 1) * (roomNumberInList % period + 1);
        int paddingY = (roomPaneWidth % roomPreviewWidth) / (period + 1) * (roomNumberInList / period + 1);

        int offSetX = column * roomPreviewWidth + paddingX;
        int offSetY = row * roomPreviewHeight + paddingY;

        room.setTranslateX(offSetX);
        room.setTranslateY(offSetY);
    }

}
