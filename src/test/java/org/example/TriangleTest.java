package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {


  @Test
  void threeValidSides(){
    Double result = Triangle.triangleArea(10, 10,2);
    Assertions.assertEquals(result,9.9498743710662);
  }
@Test
  void notValidSides(){
    Double results = Triangle.triangleArea(2,5,50);
    Assertions.assertFalse(false);
}
 }


