package cloud.tavitian.provenance;

public class TransactionResource {
  private String type;
  private String id;
  private TransactionAttribute attributes;
  private TransactionRelationship relationships;
  private SelfLink links;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TransactionAttribute getAttributes() {
    return attributes;
  }

  public void setAttributes(TransactionAttribute attributes) {
    this.attributes = attributes;
  }

  public TransactionRelationship getRelationships() {
    return relationships;
  }

  public void setRelationships(TransactionRelationship relationships) {
    this.relationships = relationships;
  }

  public SelfLink getLinks() {
    return links;
  }

  public void setLinks(SelfLink links) {
    this.links = links;
  }
}
