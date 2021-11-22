// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance;

public class CategoryResource {
  private String type;
  private String id;
  private CategoryAttribute attributes;
  private CategoryRelationship relationships;
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

  public CategoryAttribute getAttributes() {
    return attributes;
  }

  public void setAttributes(CategoryAttribute attributes) {
    this.attributes = attributes;
  }

  public CategoryRelationship getRelationships() {
    return relationships;
  }

  public void setRelationships(CategoryRelationship relationships) {
    this.relationships = relationships;
  }

  public SelfLink getLinks() {
    return links;
  }

  public void setLinks(SelfLink links) {
    this.links = links;
  }
}
