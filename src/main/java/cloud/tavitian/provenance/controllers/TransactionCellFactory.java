// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance.controllers;

import cloud.tavitian.provenance.TransactionResource;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class TransactionCellFactory implements Callback<ListView<TransactionResource>, ListCell<TransactionResource>> {
  @Override public ListCell<TransactionResource> call(ListView<TransactionResource> listView) {
    return new TransactionCell();
  }
}