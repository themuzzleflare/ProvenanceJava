package cloud.tavitian.provenance;

public class CategoryRelationship {
  private CategoryRelationshipParent parent;
  private CategoryRelationshipChildren children;

  public CategoryRelationshipParent getParent() {
    return parent;
  }

  public void setParent(CategoryRelationshipParent parent) {
    this.parent = parent;
  }

  public CategoryRelationshipChildren getChildren() {
    return children;
  }

  public void setChildren(CategoryRelationshipChildren children) {
    this.children = children;
  }
}
