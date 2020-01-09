package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
   @Test public void testBinarySearch() {
      int[] testArr = {1,2,3,4,5};
      int key = 4;
      boolean isTrue = false;
      if(BinarySearch.binarySearch(testArr, key) == 3){
         isTrue = true;
      }


      assertTrue("inserted value into middle of array", isTrue);
   }


}
