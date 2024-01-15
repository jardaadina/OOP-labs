package com.example.demo1;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    @FXML
    private Button inapoiMeniuButton;
    @FXML
    public Label numeLabel;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setUserData(ResultSet result) throws SQLException {
        String userNume = result.getString("Nume");
        String userPrenume = result.getString("Prenume");
        numeLabel.setText("  " +userNume+" "+userPrenume);
        setId(result.getInt("ID_Utilizator"));
    }


    public void inapoiButtonOnAction(ActionEvent e)
    {
        Stage stage= (Stage)inapoiButton.getScene().getWindow();
        stage.close();
    }
    public void inapoiMeniuButtonOnAction(ActionEvent e){
        initialize();
        inapoiButton.setVisible(true);
    }

    public void initialize()
    {
        hideButtonBDPADMIN();
        hideButtonBMDPADMIN();
        hideButtonBADSADMIN();
        hideButtonBMDSADMIN();
        hideButtonBSDSADMIN();
        inapoiMeniuButton.setVisible(false);
    }
    public void BDPADMINonAction(ActionEvent e)
    {
        hideButtonBDPADMIN();
        inapoiMeniuButton.setVisible(true);
        inapoiButton.setVisible(false);
        fereastraDatePersonale(id);
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
        inapoiMeniuButton.setVisible(true);
        inapoiButton.setVisible(false);
        fereastraModificaDate(id);
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
        inapoiMeniuButton.setVisible(true);
        inapoiButton.setVisible(false);
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
        inapoiMeniuButton.setVisible(true);
        inapoiButton.setVisible(false);
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
        inapoiMeniuButton.setVisible(true);
        inapoiButton.setVisible(false);
    }

    private void hideButtonBSDSADMIN()
    {
        boolean isBSDSADMINPressed = BSDSADMIN.isArmed() || BSDSADMIN.isPressed();

        BDPADMIN.setVisible(!isBSDSADMINPressed);
        BMDPADMIN.setVisible(!isBSDSADMINPressed);
        BADSADMIN.setVisible(!isBSDSADMINPressed);
        BMDSADMIN.setVisible(!isBSDSADMINPressed);
    }
    public void fereastraDatePersonale(int id){
        try{
            FXMLLoader date = new FXMLLoader(com.example.demo1.HelloApplication.class.getResource("datePersonale.fxml"));
            Scene scene = new Scene(date.load(), 1180, 120);
            DatePersonale d = date.getController();
            d.setID(id);
            Stage stageDate= new Stage();
            stageDate.setTitle("Date Personale");
            stageDate.setScene(scene);

            stageDate.show();

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

    public void fereastraModificaDate(int id){
        try{
            FXMLLoader date = new FXMLLoader(com.example.demo1.HelloApplication.class.getResource("modificadate.fxml"));
            Scene scene = new Scene(date.load(), 440, 400);
            ModificaDate d = date.getController();
            d.setID(id);
            Stage stageDate= new Stage();
            stageDate.setTitle("Modifica Date");
            stageDate.setScene(scene);

            stageDate.show();

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

    public void BADSADMINOnAction(ActionEvent e)throws SQLException{
        fereastraAdaugaDateSistem(id);
        fereastraDatePersonaleAngajati(id);
    }

    public void fereastraAdaugaDateSistem(int id){
        try{
            FXMLLoader date = new FXMLLoader(com.example.demo1.HelloApplication.class.getResource("adaugadatesistem.fxml"));
            Scene scene = new Scene(date.load(), 480, 580);
            AdaugaDateSistem d = date.getController();
            d.setID(id);
            Stage stageDate= new Stage();
            stageDate.setTitle("Adauga Date Sistem ");
            stageDate.setScene(scene);

            stageDate.show();

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
    public void BMDSADMINOnAction(ActionEvent e)throws SQLException{
        fereastraModificaDateSistem(id);
        fereastraDatePersonaleAngajati(id);

    }

    public void fereastraModificaDateSistem(int id){
        try{
            FXMLLoader date = new FXMLLoader(com.example.demo1.HelloApplication.class.getResource("modificadatesistem.fxml"));
            Scene scene = new Scene(date.load(), 480, 580);
            ModificaDateSistem d = date.getController();
            d.setID(id);
            Stage stageDate= new Stage();
            stageDate.setTitle("Modifica Date Sistem ");
            stageDate.setScene(scene);

            stageDate.show();

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

    public void fereastraDatePersonaleAngajati(int id){
        try{
            FXMLLoader date = new FXMLLoader(com.example.demo1.HelloApplication.class.getResource("datePersonaleAngajati.fxml"));
            Scene scene = new Scene(date.load(), 1150, 307);
            DatePersonaleAngajati d = date.getController();
            d.setID(id);
            Stage stageDate= new Stage();
            stageDate.setTitle("Date Personale Angajati");
            stageDate.setScene(scene);

            stageDate.show();

        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
}
