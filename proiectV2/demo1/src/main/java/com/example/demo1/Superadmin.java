package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Superadmin
{
    @FXML
    private Button inapoiButton;
    @FXML
    private Button BDPSUPADMIN;
    @FXML
    private Button BMDPSUPADMIN;
    @FXML
    private Button BADSSUPADMIN;
    @FXML
    private Button BMDSSUPADMIN;
    @FXML
    private Button BSDSSUPADMIN;

    public void inapoiButtonOnAction(ActionEvent e)
    {
        Stage stage= (Stage)inapoiButton.getScene().getWindow();
        stage.close();
    }

    public void initialize()
    {
        hideButtonBDPSUPADMIN();
        hideButtonBMDPSUPADMIN();
        hideButtonBADSSUPADMIN();
        hideButtonBMDSSUPADMIN();
        hideButtonBSDSSUPADMIN();
    }
    public void BDPSUPADMINonAction(ActionEvent e)
    {
        hideButtonBDPSUPADMIN();
    }

    private void hideButtonBDPSUPADMIN()
    {
        boolean isBDPSUPADMINoNPressed = BDPSUPADMIN.isArmed() || BDPSUPADMIN.isPressed();

        BMDPSUPADMIN.setVisible(!isBDPSUPADMINoNPressed);
        BADSSUPADMIN.setVisible(!isBDPSUPADMINoNPressed);
        BMDSSUPADMIN.setVisible(!isBDPSUPADMINoNPressed);
        BSDSSUPADMIN.setVisible(!isBDPSUPADMINoNPressed);
    }

    public void BMDPSUPADMINonAction(ActionEvent e)
    {
        hideButtonBMDPSUPADMIN();
    }

    private void hideButtonBMDPSUPADMIN()
    {
        boolean isBMDPSUPADMINPressed = BMDPSUPADMIN.isArmed() || BMDPSUPADMIN.isPressed();

        BDPSUPADMIN.setVisible(!isBMDPSUPADMINPressed);
        BADSSUPADMIN.setVisible(!isBMDPSUPADMINPressed);
        BMDSSUPADMIN.setVisible(!isBMDPSUPADMINPressed);
        BSDSSUPADMIN.setVisible(!isBMDPSUPADMINPressed);
    }

    public void BADSSUPADMINonAction(ActionEvent e)
    {
        hideButtonBADSSUPADMIN();
    }

    private void hideButtonBADSSUPADMIN()
    {
        boolean isBADSSUPADMINPressed = BADSSUPADMIN.isArmed() || BADSSUPADMIN.isPressed();

        BDPSUPADMIN.setVisible(!isBADSSUPADMINPressed);
        BMDPSUPADMIN.setVisible(!isBADSSUPADMINPressed);
        BMDSSUPADMIN.setVisible(!isBADSSUPADMINPressed);
        BSDSSUPADMIN.setVisible(!isBADSSUPADMINPressed);
    }

    public void BMDSSUPADMINonAction(ActionEvent e)
    {
        hideButtonBMDSSUPADMIN();
    }

    private void hideButtonBMDSSUPADMIN()
    {
        boolean isBMDSSUPADMINPressed = BMDSSUPADMIN.isArmed() || BMDSSUPADMIN.isPressed();

        BDPSUPADMIN.setVisible(!isBMDSSUPADMINPressed);
        BMDPSUPADMIN.setVisible(!isBMDSSUPADMINPressed);
        BADSSUPADMIN.setVisible(!isBMDSSUPADMINPressed);
        BSDSSUPADMIN.setVisible(!isBMDSSUPADMINPressed);
    }

    public void BSDSSUPADMINonAction(ActionEvent e)
    {
        hideButtonBSDSSUPADMIN();
    }

    private void hideButtonBSDSSUPADMIN()
    {
        boolean isBSDSSUPADMINPressed = BSDSSUPADMIN.isArmed() || BSDSSUPADMIN.isPressed();

        BDPSUPADMIN.setVisible(!isBSDSSUPADMINPressed);
        BMDPSUPADMIN.setVisible(!isBSDSSUPADMINPressed);
        BADSSUPADMIN.setVisible(!isBSDSSUPADMINPressed);
        BMDSSUPADMIN.setVisible(!isBSDSSUPADMINPressed);
    }
}