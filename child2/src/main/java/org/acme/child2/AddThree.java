package org.acme.child2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AddThree {

  @Inject
  NumberProvider numberProvider;

  public int addTwo(int a) {
    return a + numberProvider.getThree();
  }
}
