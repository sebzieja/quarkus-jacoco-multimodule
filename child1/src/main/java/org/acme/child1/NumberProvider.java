package org.acme.child1;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NumberProvider {

  public int getTwo() {
    return 2;
  }
}
