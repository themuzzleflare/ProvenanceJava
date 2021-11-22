// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance.controllers;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class TabPaneController {
  @FXML private TabPane tabPane;

  @FXML private Tab transactionsTab;
  @FXML private Tab accountsTab;
  @FXML private Tab tagsTab;
  @FXML private Tab categoriesTab;
  @FXML private Tab aboutTab;

  @FXML private Node transactions;
  @FXML private Node accounts;
  @FXML private Node tags;
  @FXML private Node categories;
  @FXML private Node about;

  @FXML private TransactionsController transactionsController;
  @FXML private AccountsController accountsController;
  @FXML private TagsController tagsController;
  @FXML private CategoriesController categoriesController;
  @FXML private AboutController aboutController;
}