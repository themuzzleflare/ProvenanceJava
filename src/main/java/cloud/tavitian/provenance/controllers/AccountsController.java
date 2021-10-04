package cloud.tavitian.provenance.controllers;

import cloud.tavitian.provenance.APIFacade;
import cloud.tavitian.provenance.AccountResource;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AccountsController implements Initializable {
  @FXML public ListView<AccountResource> listView = new ListView<>();

  @Override public void initialize(URL location, ResourceBundle resources) {
    try {
      listView.setItems(FXCollections.observableArrayList(APIFacade.listAccounts()));
      listView.setCellFactory(new AccountCellFactory());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}