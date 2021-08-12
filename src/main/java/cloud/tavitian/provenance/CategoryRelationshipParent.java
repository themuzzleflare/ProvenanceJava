package cloud.tavitian.provenance;

public class CategoryRelationshipParent {
  private RelationshipData data;
  private RelatedLink links;

  public RelationshipData getData() {
    return data;
  }

  public void setData(RelationshipData data) {
    this.data = data;
  }

  public RelatedLink getLinks() {
    return links;
  }

  public void setLinks(RelatedLink links) {
    this.links = links;
  }
}
