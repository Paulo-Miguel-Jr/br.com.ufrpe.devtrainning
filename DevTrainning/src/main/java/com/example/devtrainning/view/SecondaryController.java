package com.example.devtrainning.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

import java.io.IOException;

public class SecondaryController {

    @FXML
    private Button BtnVoltarTela;
    @FXML
    private Button BtnRegistro;

    @FXML
    void VoltarTela(ActionEvent event) throws IOException {
        App.trocartela(new FXMLLoader(App.class.getResource("telainicial.fxml")).load());
    }

}

