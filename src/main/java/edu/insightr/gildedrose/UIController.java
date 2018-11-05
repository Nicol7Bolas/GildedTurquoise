package edu.insightr.gildedrose;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;


public class UIController {
    public Label oui;

    public void Test(ActionEvent actionEvent) {
        oui.setText("Oui.");
    }

    public static void main(String[] args){
        UIController ui = new UIController();
    }
}

