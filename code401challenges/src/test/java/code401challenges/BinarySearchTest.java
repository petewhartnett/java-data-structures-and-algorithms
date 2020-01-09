package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
   @Test public void testBinarySearch() {

      boolean isTrue = false;
      if(BinarySearch.binarySearch() == 3){
         isTrue = true;
      }


      assertTrue("inserted value into middle of array", isTrue);
   }


}
