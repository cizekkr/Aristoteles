/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.uhk.aristoteles.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author Kryštof
 */
public class AddedWindowController implements Initializable {

    @FXML
    Circle humCircle;

    @FXML
    private void mouseClickBitch(MouseEvent event) {
        if (humCircle.getFill().equals(Color.RED)) {
            humCircle.setFill(Color.BLUE);
        } else {
            humCircle.setFill(Color.RED);
        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
