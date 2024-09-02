package org.acme.child2;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NumberProvider {

  public int getThree() {
    return 3;
  }
}
