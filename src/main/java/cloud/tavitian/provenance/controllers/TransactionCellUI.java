package cloud.tavitian.provenance.controllers;

import cloud.tavitian.provenance.TransactionResource;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;

public class TransactionCellUI {
  private final HBox hBox = new HBox();
  private final VBox vBox = new VBox();
  private final Label descriptionLabel = new Label();
  private final Label dateLabel = new Label();
  private final Label amountLabel = new Label();
  private final Label statusLabel = new Label();

  public HBox gethBox(TransactionResource transaction) {
    this.descriptionLabel.setText(transaction.getAttributes().getDescription());
    this.dateLabel.setText(transaction.getAttributes().getCreatedAt());
    this.statusLabel.setTextFill(transaction.getAttributes().isSettled() ? Color.GREEN : Color.RED);
    this.statusLabel.setText(transaction.getAttributes().statusString());
    this.amountLabel.setTextAlignment(TextAlignment.RIGHT);
    this.amountLabel.setText(transaction.getAttributes().getAmount().getValue());

    vBox.getChildren().add(0, descriptionLabel);
    vBox.getChildren().add(1, dateLabel);
    vBox.getChildren().add(2, statusLabel);

    hBox.setAlignment(Pos.CENTER_LEFT);
    hBox.setSpacing(400);
    hBox.getChildren().add(0, vBox);
    hBox.getChildren().add(1, amountLabel);

    return hBox;
  }
}
