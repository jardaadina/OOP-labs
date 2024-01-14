package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ModificaDate {
    @FXML
    private Button anuleazaMDA;

    public void setID(int id) {
    }
    public void cancelButtonOnAction(ActionEvent e){
        Stage stage= (Stage) anuleazaMDA.getScene().getWindow();
        stage.close();
    }

}
