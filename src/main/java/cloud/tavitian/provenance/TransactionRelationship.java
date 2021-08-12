package cloud.tavitian.provenance;

public class TransactionRelationship {
  private TransactionRelationshipAccount account;
  private TransactionRelationshipTransferAccount transferAccount;
  private TransactionRelationshipCategory category;
  private TransactionRelationshipCategory parentCategory;
  private TransactionRelationshipTag tags;

  public TransactionRelationshipAccount getAccount() {
    return account;
  }

  public void setAccount(TransactionRelationshipAccount account) {
    this.account = account;
  }

  public TransactionRelationshipTransferAccount getTransferAccount() {
    return transferAccount;
  }

  public void setTransferAccount(TransactionRelationshipTransferAccount transferAccount) {
    this.transferAccount = transferAccount;
  }

  public TransactionRelationshipCategory getCategory() {
    return category;
  }

  public void setCategory(TransactionRelationshipCategory category) {
    this.category = category;
  }

  public TransactionRelationshipCategory getParentCategory() {
    return parentCategory;
  }

  public void setParentCategory(TransactionRelationshipCategory parentCategory) {
    this.parentCategory = parentCategory;
  }

  public TransactionRelationshipTag getTags() {
    return tags;
  }

  public void setTags(TransactionRelationshipTag tags) {
    this.tags = tags;
  }
}
