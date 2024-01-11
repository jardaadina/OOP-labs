package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Medic {

    @FXML
    private Button inapoiButton;
    @FXML
    private Button BGRU;
    @FXML
    private Button BGRUDPM;
    @FXML
    private Button BGRUMDPM;
    @FXML
    private Button BGRUCM;
    @FXML
    private Button BOFC;
    @FXML
    private Button BOFCPPM;
    @FXML
    private Button BOFCPAPM;
    @FXML
    private Button BOFCSM;
    @FXML
    private Button BGAO;
    @FXML
    private Button BGAOVPM;
    @FXML
    private Button BGAOGRMM;

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

        BGRUDPM.setVisible(isBGRUPressed);
        BGRUMDPM.setVisible(isBGRUPressed);
        BGRUCM.setVisible(isBGRUPressed);
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

        BOFCPPM.setVisible(isBOFCPressed);
        BOFCPAPM.setVisible(isBOFCPressed);
        BOFCSM.setVisible(isBOFCPressed);
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

        BGAOVPM.setVisible(isBGAOPressed);
        BGAOGRMM.setVisible(isBGAOPressed);
        BGRU.setVisible(!isBGAOPressed);
        BOFC.setVisible(!isBGAOPressed);
    }
}
