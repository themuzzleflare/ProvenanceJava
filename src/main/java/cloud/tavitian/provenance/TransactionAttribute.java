package cloud.tavitian.provenance;

public class TransactionAttribute {
  private TransactionStatusEnum status;

  public Boolean isSettled() {
    return switch (getStatus()) {
      case HELD -> false;
      case SETTLED -> true;
    };
  }

  public String statusString() {
    return isSettled() ? "Settled" : "Held";
  }

  private String rawText;
  private String description;
  private String message;
  private HoldInfoObject holdInfo;
  private RoundUpObject roundUp;
  private CashbackObject cashback;
  private MoneyObject amount;
  private MoneyObject foreignAmount;
  private String settledAt;
  private String createdAt;

  public TransactionStatusEnum getStatus() {
    return status;
  }

  public void setStatus(TransactionStatusEnum status) {
    this.status = status;
  }

  public String getRawText() {
    return rawText;
  }

  public void setRawText(String rawText) {
    this.rawText = rawText;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public HoldInfoObject getHoldInfo() {
    return holdInfo;
  }

  public void setHoldInfo(HoldInfoObject holdInfo) {
    this.holdInfo = holdInfo;
  }

  public RoundUpObject getRoundUp() {
    return roundUp;
  }

  public void setRoundUp(RoundUpObject roundUp) {
    this.roundUp = roundUp;
  }

  public CashbackObject getCashback() {
    return cashback;
  }

  public void setCashback(CashbackObject cashback) {
    this.cashback = cashback;
  }

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

  public String getSettledAt() {
    return settledAt;
  }

  public void setSettledAt(String settledAt) {
    this.settledAt = settledAt;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
}
