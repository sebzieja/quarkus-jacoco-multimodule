package org.acme.child2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AddThreeTest {

  @Mock
  private NumberProvider provider;

  @InjectMocks
  private AddThree addTwo;

  @Test
  void should_addTwo() {
    Mockito.when(provider.getThree()).thenReturn(1);

    int i = addTwo.addTwo(1);

    assertEquals(2, i);
  }
}
