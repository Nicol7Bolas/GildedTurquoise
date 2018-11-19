package edu.insightr.gildedrose;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;

import java.net.URL;
import java.util.ResourceBundle;

public class UIController implements Initializable {
    @FXML
    private TableView<Item> tableView1;
    private TableColumn<Item, String> itemName;
    private TableColumn<Item, String> itemSellIn;
    private TableColumn<Item, String> itemQuality;
    private ComboBox comboBox1;
    private TextField SellIn;
    private TextField Quality;

    public void DisplayInventory(ActionEvent actionEvent) {
        Inventory inv = new Inventory();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

