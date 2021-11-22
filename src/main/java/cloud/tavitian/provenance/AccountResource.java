// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance;

public class AccountResource {
  private String type;
  private String id;
  private AccountAttribute attributes;
  private AccountRelationship relationships;
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

  public AccountAttribute getAttributes() {
    return attributes;
  }

  public void setAttributes(AccountAttribute attributes) {
    this.attributes = attributes;
  }

  public AccountRelationship getRelationships() {
    return relationships;
  }

  public void setRelationships(AccountRelationship relationships) {
    this.relationships = relationships;
  }

  public SelfLink getLinks() {
    return links;
  }

  public void setLinks(SelfLink links) {
    this.links = links;
  }
}
