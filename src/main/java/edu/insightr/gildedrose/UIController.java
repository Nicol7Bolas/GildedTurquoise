package edu.insightr.gildedrose;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class UIController implements Initializable {
    @FXML
    public Label oui;

    public void Test(ActionEvent actionEvent) {
        oui.setText("Oui.");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

