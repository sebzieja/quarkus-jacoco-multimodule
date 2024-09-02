package org.acme.child2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumberProviderTest {

  private final NumberProvider numberProvider = new NumberProvider();

  @Test
  void should_getTwo() {
    int two = numberProvider.getThree();

    assertEquals(3, two);
  }
}
