// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance;

public class TagsResponse {
  private TagResource[] data;
  private Pagination links;

  public TagResource[] getData() {
    return data;
  }

  public void setData(TagResource[] data) {
    this.data = data;
  }

  public Pagination getLinks() {
    return links;
  }

  public void setLinks(Pagination links) {
    this.links = links;
  }
}
