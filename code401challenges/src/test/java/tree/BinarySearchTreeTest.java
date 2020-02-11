package tree;

import InsertionSort.InsertionSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {


    @Test
    public void testBinarySearchTree() {

//        BinarySearchTree testTree = new BinarySearchTree();
//
//        testTree.callInsertData(7);
//        testTree.callInsertData(8);
//        testTree.callInsertData(9);
//        testTree.callInsertData(10);
//        testTree.callInsertData(11);
//        testTree.callInsertData(12);
//
//     boolean actual = testTree.callsSearchForData(10);
//     boolean expected = true;
        int[] arr = {1,5,2,9,3};
        InsertionSort.insertionSort(arr);
     System.out.println("test");

       // assertEquals("inserted value into middle of array", expected, actual);
    }


    @Test
    public void testBinarySearchTreeSearch() {

        BinarySearchTree testTree = new BinarySearchTree();

        testTree.callInsertData(7);
        testTree.callInsertData(8);
        testTree.callInsertData(9);
        testTree.callInsertData(10);
        testTree.callInsertData(11);
        testTree.callInsertData(12);

        boolean actual = testTree.callsSearchForData(22);
        boolean expected = false;


        // System.out.println(actual);

        assertEquals("inserted value into middle of array", expected, actual);
    }

}