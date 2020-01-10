package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayReverseTest {
    @Test
    public void ReverseArrayTest() {

        int[] input = new int[]{1,2,3,4,5};

        int[] expected = new int[]{5,4,3,2,1};
        assertArrayEquals("inserted value into middle of array", expected, ArrayReverse.ReversedArray(input));
    }

}