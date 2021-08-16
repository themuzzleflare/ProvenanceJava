package cloud.tavitian.provenance;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class ProvenanceApplication extends Application {
  @Override public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(ProvenanceApplication.class.getResource("tabPaneView.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 640, 480);
    stage.setTitle("Provenance");
    stage.getIcons().add(new Image(Objects.requireNonNull(ProvenanceApplication.class.getResourceAsStream("icon.png"))));
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}