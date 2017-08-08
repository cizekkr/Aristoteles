package cz.uhk.aristoteles.controllers;

import cz.uhk.aristoteles.app.AppWindow;
import cz.uhk.aristoteles.app.Room;
import cz.uhk.aristoteles.app.Session;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class MainScreenController implements Initializable {


    @FXML
    private AnchorPane aPaneRoomPane;

    @FXML
    private void showAllRooms(ActionEvent event){
        List<Room> rooms = Session.getDatabase().getAllRooms();
        clearRoomPane();
        displayRooms(rooms);
        setRoomPreviewLayout();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setWidthListener();
    }

    private void displayRooms(List<Room> rooms) {
        for (Room room : rooms) {
            AnchorPane roomPane = AppWindow.ROOM_PREVIEW.getWindow();
            aPaneRoomPane.getChildren().add(roomPane);
        }
    }

    private void setRoomPreviewLayout() {
        int roomPaneWidth = (int) aPaneRoomPane.getWidth();
        int roomPreviewHeight = (int) AppWindow.ROOM_PREVIEW.getWindow().getPrefHeight();
        int roomPreviewWidth = (int) AppWindow.ROOM_PREVIEW.getWindow().getPrefWidth();
        int period = roomPaneWidth / roomPreviewWidth;
        int basicOffSet = (roomPaneWidth % roomPreviewWidth) / (period + 1);

        List<Node> nodes = aPaneRoomPane.getChildren();

        for (int roomNumberInList = 0; roomNumberInList < nodes.size(); roomNumberInList++) {

            int row = roomNumberInList / period;
            int column = roomNumberInList % period;

            int paddingX = basicOffSet * (roomNumberInList % period + 1);
            int paddingY = basicOffSet * (roomNumberInList / period + 1);

            int offSetX = column * roomPreviewWidth + paddingX;
            int offSetY = row * roomPreviewHeight + paddingY;
            
            AnchorPane room = (AnchorPane)nodes.get(roomNumberInList);
            room.setTranslateX(offSetX);
            room.setTranslateY(offSetY);
        }
        int computedHeight = (nodes.size() / period + 1) * (roomPreviewHeight + basicOffSet) + basicOffSet;
        aPaneRoomPane.setPrefHeight(computedHeight);
    }
    
    private void clearRoomPane(){
        aPaneRoomPane.getChildren().clear();
    }
    
    private void setWidthListener(){
        aPaneRoomPane.widthProperty().addListener(new ChangeListener<Number>(){
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                setRoomPreviewLayout();
            }
        });
    }

}
