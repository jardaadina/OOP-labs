package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Pacient {

    @FXML
    private Button inapoiButton;
    private Button BMDP;
    @FXML
    private Button BDPP;
    @FXML
    private Button BPP;
    @FXML
    private Button BRMP;

    public void inapoiButtonOnAction(ActionEvent e){
        Stage stage= (Stage)inapoiButton.getScene().getWindow();
        stage.close();
    }

    public void initialize()
    {
        hideButtonBMDP();
        hideButtonBDPP();
        hideButtonBPP();
        hideButtonBRMP();
    }
    public void BMDPonAction(ActionEvent e)
    {
        hideButtonBMDP();
    }

    private void hideButtonBMDP()
    {
        boolean isBMDPressed = BMDP.isArmed() || BMDP.isPressed();

        BMDP.setVisible(!isBMDPressed);
        BPP.setVisible(!isBMDPressed);
        BRMP.setVisible(!isBMDPressed);
    }
    public void BDPPonAction(ActionEvent e)
    {
        hideButtonBMDP();
    }

    private void hideButtonBDPP()
    {
        boolean isBDPPressed = BDPP.isArmed() || BDPP.isPressed();

        BDPP.setVisible(!isBDPPressed);
        BPP.setVisible(!isBDPPressed);
        BRMP.setVisible(!isBDPPressed);
    }

    public void BPPonAction(ActionEvent e)
    {
        hideButtonBPP();
    }

    private void hideButtonBPP()
    {
        boolean isBPPPressed = BPP.isArmed() || BPP.isPressed();

        BMDP.setVisible(!isBPPPressed);
        BDPP.setVisible(!isBPPPressed);
        BRMP.setVisible(!isBPPPressed);
    }


    public void BRMPonAction(ActionEvent e)
    {
        hideButtonBRMP();
    }

    private void hideButtonBRMP()
    {
        boolean isBRMPPressed = BRMP.isArmed() || BRMP.isPressed();

        BMDP.setVisible(!isBRMPPressed);
        BDPP.setVisible(!isBRMPPressed);
        BPP.setVisible(!isBRMPPressed);
    }
}
