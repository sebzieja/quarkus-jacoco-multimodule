package org.acme.child1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AddTwoTest {

  @Mock
  private NumberProvider provider;

  @InjectMocks
  private AddTwo addTwo;

  @Test
  void should_addTwo() {
    Mockito.when(provider.getTwo()).thenReturn(3);

    int i = addTwo.addTwo(1);

    assertEquals(4, i);
  }
}
