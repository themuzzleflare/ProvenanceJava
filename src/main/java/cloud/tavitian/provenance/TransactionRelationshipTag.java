// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance;

public class TransactionRelationshipTag {
  private RelationshipData[] data;
  private SelfLink links;

  public RelationshipData[] getData() {
    return data;
  }

  public void setData(RelationshipData[] data) {
    this.data = data;
  }

  public SelfLink getLinks() {
    return links;
  }

  public void setLinks(SelfLink links) {
    this.links = links;
  }
}
