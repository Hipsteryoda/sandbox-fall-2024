package com.sandbox.generics;

public class IntegerBox {

  private Integer contents;

  public IntegerBox() {
    this.contents = 0;
  }

  public Integer getContents() {
    return contents;
  }

  public void setContents(Integer contents) {
    this.contents = contents;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("IntegerBox{");
    sb.append("contents=").append(contents);
    sb.append('}');
    return sb.toString();
  }
}
