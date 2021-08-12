package cloud.tavitian.provenance;

public class AccountsResponse {
  private AccountResource[] data;
  private Pagination links;

  public AccountResource[] getData() {
    return data;
  }

  public void setData(AccountResource[] data) {
    this.data = data;
  }

  public Pagination getLinks() {
    return links;
  }

  public void setLinks(Pagination links) {
    this.links = links;
  }
}


