package cloud.tavitian.provenance;

public class TransactionsResponse {
  private TransactionResource[] data;
  private Pagination links;

  public TransactionResource[] getData() {
    return data;
  }

  public void setData(TransactionResource[] data) {
    this.data = data;
  }

  public Pagination getLinks() {
    return links;
  }

  public void setLinks(Pagination links) {
    this.links = links;
  }
}
