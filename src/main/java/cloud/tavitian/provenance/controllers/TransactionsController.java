package cloud.tavitian.provenance.controllers;

import cloud.tavitian.provenance.APIFacade;
import cloud.tavitian.provenance.TransactionResource;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TransactionsController implements Initializable {
  @FXML public ListView<TransactionResource> listView = new ListView<>();

  @Override public void initialize(URL location, ResourceBundle resources) {
    try {
      listView.setItems(FXCollections.observableArrayList(APIFacade.listTransactions()));
      listView.setCellFactory(new TransactionCellFactory());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}