package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Hr {

    @FXML
    private Button inapoiButton;
    @FXML
    private Button BGRU;
    @FXML
    private Button BGRUDPHR;
    @FXML
    private Button BGRUMDHR1;
    @FXML
    private Button BGRUDAHR;
    @FXML
    private Button BOFC;
    @FXML
    private Button BOFCSHR;
    @FXML
    private Button BOFCSAHR;

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

        BGRUDPHR.setVisible(isBGRUPressed);
        BGRUMDHR1.setVisible(isBGRUPressed);
        BGRUDAHR.setVisible(isBGRUPressed);
        BOFC.setVisible(!isBGRUPressed);
    }

    public void BOFConAction(ActionEvent e)
    {
        hideButtonOFC();
    }

    private void hideButtonOFC()
    {
        boolean isBOFCPressed = BOFC.isArmed() || BOFC.isPressed();

        BOFCSHR.setVisible(isBOFCPressed);
        BOFCSAHR.setVisible(isBOFCPressed);
        BGRU.setVisible(!isBOFCPressed);
    }
}
