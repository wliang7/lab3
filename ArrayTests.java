import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] input2 = {4, 7, 9, 19, 3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{3, 19, 9, 7, 4}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] input2 = {0, 2, 10, 44, 86};
    assertArrayEquals(new int[]{86,44, 10, 2, 0}, ArrayExamples.reversed(input2));
  }

  @Test
  public void averageWithoutLowest(){
    double[] input1 = {6.0, 3.0, 6.0, 3.0};
    double expect = 4.0;
    assertEquals(expect, ArrayExamples.averageWithoutLowest(input1), 0.001);
    double[] input = {};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input), 0.001);
    double[] input2 = {2};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input2), 0.001);
  }
}
