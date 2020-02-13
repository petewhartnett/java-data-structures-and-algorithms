package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {


    @Test
    public void testInsertSort() {

        int[] arr = {1,5,2,9,3};


       int[] sorted = InsertionSort.insertionSort(arr);

      int expected = 3;
      int actual = sorted[2];

        System.out.println("test");

       assertEquals("Tests to make sure order correct", expected, actual);
    }


    @Test
    public void testInsertSort2() {

        int[] arr = {1,5,2,9,3};
        int left = 1;
        int right = 4;


        int[] sorted = InsertionSort.insertionSort(arr);

        int expected = 9;
        int actual = sorted[4];

        System.out.println("test");

      assertEquals("Tests to make sure order correct", expected, actual);
    }




}