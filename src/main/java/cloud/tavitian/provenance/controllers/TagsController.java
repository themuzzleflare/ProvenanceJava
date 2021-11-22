// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance.controllers;

import cloud.tavitian.provenance.APIFacade;
import cloud.tavitian.provenance.TagResource;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TagsController implements Initializable {
  @FXML public ListView<String> listView = new ListView<>();

  public ObservableList<String> tagsList = FXCollections.observableArrayList();

  @Override public void initialize(URL location, ResourceBundle resources) {
    try {
      for (TagResource tag: APIFacade.listTags()) {
        tagsList.add(tag.getId());
      }
      listView.setItems(tagsList);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}