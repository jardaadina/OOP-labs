package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class VizualizareProgramari
{
    @FXML
    private Button inapoiProgramari;
    public void cancelButtonOnAction(ActionEvent e){
        Stage stage= (Stage) inapoiProgramari.getScene().getWindow();
        stage.close();
    }

    public void setID(int id) {
    }
}
