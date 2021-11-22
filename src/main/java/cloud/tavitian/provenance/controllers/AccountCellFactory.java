// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance.controllers;

import cloud.tavitian.provenance.AccountResource;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class AccountCellFactory implements Callback<ListView<AccountResource>, ListCell<AccountResource>> {
  @Override public ListCell<AccountResource> call(ListView<AccountResource> listView) {
    return new AccountCell();
  }
}