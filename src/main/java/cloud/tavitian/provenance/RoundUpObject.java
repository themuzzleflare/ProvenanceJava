// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance;

public class RoundUpObject {
  private MoneyObject amount;
  private MoneyObject boostPortion;

  public MoneyObject getAmount() {
    return amount;
  }

  public void setAmount(MoneyObject amount) {
    this.amount = amount;
  }

  public MoneyObject getBoostPortion() {
    return boostPortion;
  }

  public void setBoostPortion(MoneyObject boostPortion) {
    this.boostPortion = boostPortion;
  }
}
