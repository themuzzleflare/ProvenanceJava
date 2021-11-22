// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance;

public class CashbackObject {
  private String description;
  private MoneyObject amount;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MoneyObject getAmount() {
    return amount;
  }

  public void setAmount(MoneyObject amount) {
    this.amount = amount;
  }
}
