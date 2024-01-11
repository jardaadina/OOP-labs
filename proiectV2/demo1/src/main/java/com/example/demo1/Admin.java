package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Admin {

    @FXML
    private Button inapoiButton;
    @FXML
    private Button BDPADMIN;
    @FXML
    private Button BMDPADMIN;
    @FXML
    private Button BADSADMIN;
    @FXML
    private Button BMDSADMIN;
    @FXML
    private Button BSDSADMIN;

    public void inapoiButtonOnAction(ActionEvent e)
    {
        Stage stage= (Stage)inapoiButton.getScene().getWindow();
        stage.close();
    }
    public void initialize()
    {
        hideButtonBDPADMIN();
        hideButtonBMDPADMIN();
        hideButtonBADSADMIN();
        hideButtonBMDSADMIN();
        hideButtonBSDSADMIN();
    }
    public void BDPADMINonAction(ActionEvent e)
    {
        hideButtonBDPADMIN();
    }

    private void hideButtonBDPADMIN()
    {
        boolean isBDPADMINoNPressed = BDPADMIN.isArmed() || BDPADMIN.isPressed();

        BMDPADMIN.setVisible(!isBDPADMINoNPressed);
        BADSADMIN.setVisible(!isBDPADMINoNPressed);
        BMDSADMIN.setVisible(!isBDPADMINoNPressed);
        BSDSADMIN.setVisible(!isBDPADMINoNPressed);
    }

    public void BMDPADMINonAction(ActionEvent e)
    {
        hideButtonBMDPADMIN();
    }

    private void hideButtonBMDPADMIN()
    {
        boolean isBMDPADMINPressed = BMDPADMIN.isArmed() || BMDPADMIN.isPressed();

        BDPADMIN.setVisible(!isBMDPADMINPressed);
        BADSADMIN.setVisible(!isBMDPADMINPressed);
        BMDSADMIN.setVisible(!isBMDPADMINPressed);
        BSDSADMIN.setVisible(!isBMDPADMINPressed);
    }

    public void BADSADMINonAction(ActionEvent e)
    {
        hideButtonBADSADMIN();
    }

    private void hideButtonBADSADMIN()
    {
        boolean isBADSADMINPressed = BADSADMIN.isArmed() || BADSADMIN.isPressed();

        BDPADMIN.setVisible(!isBADSADMINPressed);
        BMDPADMIN.setVisible(!isBADSADMINPressed);
        BMDSADMIN.setVisible(!isBADSADMINPressed);
        BSDSADMIN.setVisible(!isBADSADMINPressed);
    }

    public void BMDSADMINonAction(ActionEvent e)
    {
        hideButtonBMDSADMIN();
    }

    private void hideButtonBMDSADMIN()
    {
        boolean isBMDASADMINPressed = BMDSADMIN.isArmed() || BMDSADMIN.isPressed();

        BDPADMIN.setVisible(!isBMDASADMINPressed);
        BMDPADMIN.setVisible(!isBMDASADMINPressed);
        BADSADMIN.setVisible(!isBMDASADMINPressed);
        BSDSADMIN.setVisible(!isBMDASADMINPressed);
    }

    public void BSDSADMINonAction(ActionEvent e)
    {
        hideButtonBSDSADMIN();
    }

    private void hideButtonBSDSADMIN()
    {
        boolean isBSDSADMINPressed = BSDSADMIN.isArmed() || BSDSADMIN.isPressed();

        BDPADMIN.setVisible(!isBSDSADMINPressed);
        BMDPADMIN.setVisible(!isBSDSADMINPressed);
        BADSADMIN.setVisible(!isBSDSADMINPressed);
        BMDSADMIN.setVisible(!isBSDSADMINPressed);
    }

}
