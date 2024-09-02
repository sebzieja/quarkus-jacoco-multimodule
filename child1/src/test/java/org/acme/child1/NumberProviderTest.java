package org.acme.child1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumberProviderTest {

  private final NumberProvider numberProvider = new NumberProvider();

  @Test
  void should_getTwo() {
    int two = numberProvider.getTwo();

    assertEquals(2, two);
  }
}
