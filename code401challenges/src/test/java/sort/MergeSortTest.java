package sort;
import org.junit.Test;

import static org.junit.Assert.*;


public class MergeSortTest {



        @Test
        public void testMergeSort() {

            int[] arr = {1,5,2,9,3};


            int[] sorted = MergeSort.mergeSort(arr);

            int expected = 3;
            int actual = sorted[2];

            System.out.println("test");

            assertEquals("Tests to make sure order correct", expected, actual);
        }


}