package com.example.multicircle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle circleGr;

    @FXML
    void circleYell() {

    }

    @FXML
    void onHelloButtonClick() {

        @FXML
        void moveCircle (MouseEvent event){

            CircMove m = new CircMove(c, 10, 30);
            m.start();
        }
    }
}