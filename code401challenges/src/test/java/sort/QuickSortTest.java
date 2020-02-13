package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSortTest() {

        int arr[] = {6, 9, 2, 0, 7, 4};
        int n = arr.length - 1;

        QuickSort quickSortTest = new QuickSort();
        quickSortTest.quickSort(arr, 0, n);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);

        }

        int actual = 2;
        int expected = arr[1];

        assertEquals("Tests to make sure order correct", expected, actual);


    }

    @Test
    public void quickSortTest2() {

        int arr[] = {6, 9, 2, 0, 7, 4};
        int n = arr.length - 1;

        QuickSort quickSortTest = new QuickSort();
        quickSortTest.quickSort(arr, 0, n);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);

        }

        int actual = 9;
        int expected = arr[5];

        assertEquals("Tests to make sure order correct", expected, actual);


    }
    @Test
    public void quickSortTest3() {

        int arr[] = {6, 9, 2, 0, 7, 4};
        int n = arr.length - 1;

        QuickSort quickSortTest = new QuickSort();
        quickSortTest.quickSort(arr, 0, n);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);

        }

        int actual = 7;
        int expected = arr[4];

        assertEquals("Tests to make sure order correct", expected, actual);


    }
}