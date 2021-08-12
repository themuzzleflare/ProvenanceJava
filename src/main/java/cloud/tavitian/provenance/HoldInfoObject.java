package cloud.tavitian.provenance;

public class HoldInfoObject {
  private MoneyObject amount;
  private MoneyObject foreignAmount;

  public MoneyObject getAmount() {
    return amount;
  }

  public void setAmount(MoneyObject amount) {
    this.amount = amount;
  }

  public MoneyObject getForeignAmount() {
    return foreignAmount;
  }

  public void setForeignAmount(MoneyObject foreignAmount) {
    this.foreignAmount = foreignAmount;
  }
}
