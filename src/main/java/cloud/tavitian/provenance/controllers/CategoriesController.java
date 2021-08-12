package cloud.tavitian.provenance.controllers;

import cloud.tavitian.provenance.APIFacade;
import cloud.tavitian.provenance.CategoryResource;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CategoriesController implements Initializable {
  @FXML public ListView<String> listView = new ListView<>();

  public ObservableList<String> categoriesList = FXCollections.observableArrayList();

  @Override public void initialize(URL location, ResourceBundle resources) {
    try {
      for (CategoryResource category: APIFacade.listCategories()) {
        categoriesList.add(category.getAttributes().getName());
      }
      listView.setItems(categoriesList);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
