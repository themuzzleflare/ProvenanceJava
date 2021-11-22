// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance;

public class AccountAttribute {
  private String displayName;
  private AccountTypeEnum accountType;
  private MoneyObject balance;
  private String createdAt;

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public MoneyObject getBalance() {
    return balance;
  }

  public void setBalance(MoneyObject balance) {
    this.balance = balance;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
}
