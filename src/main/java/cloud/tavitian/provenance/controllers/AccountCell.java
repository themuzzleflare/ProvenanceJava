package cloud.tavitian.provenance.controllers;

import cloud.tavitian.provenance.AccountResource;
import javafx.scene.control.ListCell;

public class AccountCell extends ListCell<AccountResource> {
  @Override public void updateItem(AccountResource item, boolean empty) {
    super.updateItem(item, empty);
    if (item != null) {
      setGraphic(new AccountCellUI().gethBox(item));
    }
  }
}