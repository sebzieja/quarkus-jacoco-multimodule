package org.acme.jacoco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest // has to have at least one @QuarkusTest
class MainTest {

  @Test
  void test_nothing() {
    assertEquals(1, 1);
  }
}
