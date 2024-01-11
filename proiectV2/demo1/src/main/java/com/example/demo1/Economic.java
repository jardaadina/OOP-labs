package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Economic {

    @FXML
    private Button inapoiButton;
    @FXML
    private Button BOFC;
    @FXML
    private Button BGRU;
    @FXML
    private Button BOFCVSAECO;
    @FXML
    private Button BOFCCSMECO;
    @FXML
    private Button BOFCCSOECO;
    @FXML
    private Button BOFCPPECO1;
    @FXML
    private Button BGRUDPECO;



    public void inapoiButtonOnAction(ActionEvent e){
        Stage stage= (Stage)inapoiButton.getScene().getWindow();
        stage.close();
    }

    public void initialize()
    {
        hideButtonBGRU();
        hideButtonOFC();
    }

    public void BGRUonAction(ActionEvent e)
    {
        hideButtonBGRU();
    }

    private void hideButtonBGRU()
    {
        boolean isBGRUPressed = BGRU.isArmed() || BGRU.isPressed();

        BGRUDPECO.setVisible(isBGRUPressed);
        BOFC.setVisible(!isBGRUPressed);
    }

    public void BOFConAction(ActionEvent e)
    {
        hideButtonOFC();
    }

    private void hideButtonOFC()
    {
        boolean isBOFCPressed = BOFC.isArmed() || BOFC.isPressed();

        BOFCVSAECO.setVisible(isBOFCPressed);
        BOFCCSMECO.setVisible(isBOFCPressed);
        BOFCCSOECO.setVisible(isBOFCPressed);
        BOFCPPECO1.setVisible(isBOFCPressed);
        BGRU.setVisible(!isBOFCPressed);
    }
}
