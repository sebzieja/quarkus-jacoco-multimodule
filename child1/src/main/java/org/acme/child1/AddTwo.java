package org.acme.child1;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AddTwo {

  @Inject
  NumberProvider numberProvider;

  public int addTwo(int a) {
    return a + numberProvider.getTwo();
  }
}
