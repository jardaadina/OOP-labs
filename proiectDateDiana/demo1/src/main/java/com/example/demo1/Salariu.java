package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Salariu {
    @FXML
    private Button anuleazaSA;

    public void setID(int id) {
    }

    public void anuleazaSAOnAction(ActionEvent e)
    {
        Stage stage= (Stage)anuleazaSA.getScene().getWindow();
        stage.close();
    }
}
