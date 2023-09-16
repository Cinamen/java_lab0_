package lab0;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Variant2Test{
    @Test
    public void massTest(){
        double expected = 0.001;
        double input = 1;
        assertEquals(expected, Variant2.mass(input));
    }

    @Test
    public void oddTest(){
        assertEquals(true, Variant2.odd(3));
    }

    @Test
    public void oddTest1(){
        assertEquals(false, Variant2.odd(4));
    }

    @Test
    public void checkTest(){
        double expected = 3;
        assertEquals(expected, Variant2.check(2));
    }

    @Test
    public void checkTest1(){
        double expected = -5;
        assertEquals(expected, Variant2.check(-3));
    }

    @Test
    public void testError() {
        assertEquals("Error", Variant2.selectStatement(1));
    }

    @Test
    public void testError1() {
        assertEquals("Badly", Variant2.selectStatement(1));
    }

    @Test
    public void testInvalidInput() {
        assertEquals("Error", Variant2.selectStatement(7));
    }


    @Test
    public void testGenerateNumbersBetween() {
        int A = 5;
        int B = 15;
        int N = B - A + 1;
        int[] expectedNumbers = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int[] actualNumbers = Variant2.generateNumbersBetween(A, B);

        Assert.assertEquals(actualNumbers.length, N);
        Assert.assertEquals(actualNumbers, expectedNumbers);
    }

    @Test
    public void testGenerateNumbersBetween1() {
        int A = 1;
        int B = 10;
        int N = B - A + 1;
        int[] expectedNumbers = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int[] actualNumbers = Variant2.generateNumbersBetween(A, B);

        Assert.assertEquals(actualNumbers.length, N);
        Assert.assertEquals(actualNumbers, expectedNumbers);
    }

    @Test
    public void testnumOfSection() {
        int A = 3;
        int B = 7;
        Assert.assertEquals(2, Variant2.numOfSection(A, B));

    }

    @Test
    public void testnumOfSection1() {
        int A = 8;
        int B = 2;
        Assert.assertEquals(4, Variant2.numOfSection(A, B));

    }

    @Test
    public void testpowerOfTwo() {
        int N = 4;
        int [] expected = {2, 4, 8, 16};
        Assert.assertEquals(expected, Variant2.powerOfTwo(N));
    }

    @Test
    public void testJColumn() {
        int[][] expected = {{5, 10, 15, 20}, {5, 10, 15, 20}, {5, 10, 15, 20}};
        Assert.assertEquals(expected, Variant2.jColumn(3, 4));
    }
}