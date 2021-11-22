// Copyright © 2021 Paul Tavitian

package cloud.tavitian.provenance;

public class MoneyObject {
  private String currencyCode;
  private String value;
  private Integer valueInBaseUnits;

  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Integer getValueInBaseUnits() {
    return valueInBaseUnits;
  }

  public void setValueInBaseUnits(Integer valueInBaseUnits) {
    this.valueInBaseUnits = valueInBaseUnits;
  }
}
