package com.sandbox.inheritance.vehicle;

import java.io.Serializable;

public interface Conveyance extends Serializable {
  // Interfaces implement methods that are shared across classes
  // Anything extending this interface will have to implement these methods

  // no keywords needed for Interfaces
  // The method is abstract, but does not need the abstract keyword
  void transport();

}
