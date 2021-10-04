package cloud.tavitian.provenance.controllers;

import cloud.tavitian.provenance.TransactionResource;
import javafx.scene.control.ListCell;

public class TransactionCell extends ListCell<TransactionResource> {
  @Override public void updateItem(TransactionResource item, boolean empty) {
    super.updateItem(item, empty);
    if (item != null) {
      setGraphic(new TransactionCellUI().gethBox(item));
    }
  }
}