import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = {3,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1,3}, input1);
	}

  @Test 
	public void testReverseInPlace3() {
    int[] input1 = {3,2,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1,2,3}, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3() {
    int[] input1 = {1};
    assertArrayEquals(new int[]{1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed4() {
    int[] input1 = {0,1,1};
    assertArrayEquals(new int[]{1,1,0}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed5() {
    int[] input1 = {0,1};
    assertArrayEquals(new int[]{1,0}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverage1() {
    double[] input1 = { };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.00001);
  }

  @Test
  public void testAverage2() {
    double[] input1 = {7 };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.00001);
  }

  @Test
  public void testAverage3() {
    double[] input1 = {7,1,2 };
    assertEquals(4.5, ArrayExamples.averageWithoutLowest(input1), 0.00001);
  }

  @Test
  public void testAverage4() {
    double[] input1 = {7,1,2,0};
    assertEquals(3.3333, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }

  @Test
  public void testAverage5() {
    double[] input1 = {1,1,2};
    assertEquals(1.5, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }

  @Test
  public void testAverage6() {
    double[] input1 = {4,4,1,1};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }
}
