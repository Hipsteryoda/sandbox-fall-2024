package com.sandbox.generics;

public class DoubleBox {

  private Double contents;

  public DoubleBox() {
    this.contents = 0.0;
  }

  public Double getContents() {
    return contents;
  }

  public void setContents(Double contents) {
    this.contents = contents;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("DoubleBox{");
    sb.append("contents=").append(contents);
    sb.append('}');
    return sb.toString();
  }
}
