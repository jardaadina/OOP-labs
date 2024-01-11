package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Receptioner {

    @FXML
    private Button inapoiButton;
    @FXML
    private Button BGRU;
    @FXML
    private Button BGRUDPR;
    @FXML
    private Button BGRUMDPR;
    @FXML
    private Button BGRUCR;
    @FXML
    private Button BOFC;
    @FXML
    private Button BOFCVSR;
    @FXML
    private Button BGAO;
    @FXML
    private Button BGAOCPR;
    @FXML
    private Button BGAOEBFR;

    public void inapoiButtonOnAction(ActionEvent e){
        Stage stage= (Stage)inapoiButton.getScene().getWindow();
        stage.close();
    }

    public void initialize()
    {
        hideButtonBGRU();
        hideButtonOFC();
        hideButtonBGAO();
    }

    public void BGRUonAction(ActionEvent e)
    {
        hideButtonBGRU();
    }

    private void hideButtonBGRU()
    {
        boolean isBGRUPressed = BGRU.isArmed() || BGRU.isPressed();

        BGRUDPR.setVisible(isBGRUPressed);
        BGRUMDPR.setVisible(isBGRUPressed);
        BGRUCR.setVisible(isBGRUPressed);
        BGAO.setVisible(!isBGRUPressed);
        BOFC.setVisible(!isBGRUPressed);
    }

    public void BOFConAction(ActionEvent e)
    {
        hideButtonOFC();
    }

    private void hideButtonOFC()
    {
        boolean isBOFCPressed = BOFC.isArmed() || BOFC.isPressed();

        BOFCVSR.setVisible(isBOFCPressed);
        BGRU.setVisible(!isBOFCPressed);
        BGAO.setVisible(!isBOFCPressed);
    }

    public void BGAonAction(ActionEvent e)
    {
        hideButtonBGAO();
    }

    private void hideButtonBGAO()
    {
        boolean isBGAOPressed = BGAO.isArmed() || BGAO.isPressed();

        BGAOCPR.setVisible(isBGAOPressed);
        BGAOEBFR.setVisible(isBGAOPressed);
        BGRU.setVisible(!isBGAOPressed);
        BOFC.setVisible(!isBGAOPressed);
    }
}
