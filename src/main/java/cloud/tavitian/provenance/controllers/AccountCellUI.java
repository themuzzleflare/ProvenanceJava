// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance.controllers;

import cloud.tavitian.provenance.AccountResource;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import java.text.NumberFormat;
import java.util.Currency;

public class AccountCellUI {
  private final HBox hBox = new HBox();
  private final VBox vBox = new VBox();
  private final Label displayNameLabel = new Label();
  private final Label accountTypeLabel = new Label();
  private final Label balanceLabel = new Label();

  public HBox gethBox(AccountResource account) {
    Double balanceNumber = Double.parseDouble(account.getAttributes().getBalance().getValue());
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
    Currency currency = Currency.getInstance(account.getAttributes().getBalance().getCurrencyCode());
    currencyFormatter.setCurrency(currency);
    String balanceCurrencyString = currencyFormatter.format(balanceNumber);
    this.displayNameLabel.setText(account.getAttributes().getDisplayName());
    this.accountTypeLabel.setText(account.getAttributes().getAccountType().name());
    this.balanceLabel.setTextAlignment(TextAlignment.RIGHT);
    this.balanceLabel.setText(balanceCurrencyString);

    vBox.getChildren().add(0, displayNameLabel);
    vBox.getChildren().add(1, accountTypeLabel);

    hBox.setAlignment(Pos.CENTER_LEFT);
    hBox.setSpacing(400);
    hBox.getChildren().add(0, vBox);
    hBox.getChildren().add(1, balanceLabel);

    return hBox;
  }
}