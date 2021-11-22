// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance;

public class TagResource {
  private String type;
  private String id;
  private TagRelationship relationships;

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

  public TagRelationship getRelationships() {
    return relationships;
  }

  public void setRelationships(TagRelationship relationships) {
    this.relationships = relationships;
  }
}
