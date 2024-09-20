package com.sandbox.generics;

import java.util.ArrayList;
import java.util.List;
                              // v <- Wildcard; don't know what is going in the Box
public class Crate<T extends Box<?>> {

  private List<T> containers;

  public Crate() {
    containers = new ArrayList<>();
  }

  // Mutator method
  public void addBox(T box) {
    containers.add(box);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Crate{");
    sb.append("containers=").append(containers);
    sb.append("}");
    return sb.toString();
  }
  
}

