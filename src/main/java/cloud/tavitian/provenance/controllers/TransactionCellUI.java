// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance.controllers;

import cloud.tavitian.provenance.TransactionResource;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import java.text.NumberFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Currency;

public class TransactionCellUI {
  private final HBox hBox = new HBox();
  private final VBox vBox = new VBox();
  private final Label descriptionLabel = new Label();
  private final Label dateLabel = new Label();
  private final Label amountLabel = new Label();
  private final Label statusLabel = new Label();

  public HBox gethBox(TransactionResource transaction) {
    ZonedDateTime creationDate = ZonedDateTime.parse(transaction.getAttributes().getCreatedAt());
    String creationDateString = creationDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    Double amountNumber = Double.parseDouble(transaction.getAttributes().getAmount().getValue());
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
    Currency currency = Currency.getInstance(transaction.getAttributes().getAmount().getCurrencyCode());
    currencyFormatter.setCurrency(currency);
    String amountCurrencyString = currencyFormatter.format(amountNumber);
    this.descriptionLabel.setText(transaction.getAttributes().getDescription());
    this.dateLabel.setText(creationDateString);
    this.statusLabel.setTextFill(transaction.getAttributes().isSettled() ? Color.GREEN : Color.RED);
    this.statusLabel.setText(transaction.getAttributes().statusString());
    this.amountLabel.setTextAlignment(TextAlignment.RIGHT);
    this.amountLabel.setTextFill(amountNumber < 0 ? Color.RED : Color.GREEN);
    this.amountLabel.setText(amountCurrencyString);

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