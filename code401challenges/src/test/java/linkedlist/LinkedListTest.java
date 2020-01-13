package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {


    //Initial test used for testing all functionality, 7 main tests below this test.
    @Test
    public void testSomeLibraryMethod() {
        LinkedList list = new LinkedList();
//        list.insert(15);
//        list.insert(12);


        list.insert(16);
        list.insert(17);
       if( list.searchNode(list.head, 16) == true){

           System.out.println("found data");
       }
       else{
           System.out.println("did not find data");
        }

       System.out.println( list.toString(list.head));


        int[] input = new int[]{1,2,3,4,5};
        int value = 9;
        int[] expected = new int[]{1,2,3,9,4,5};

    }



// Test 1 Can successfully instantiate an empty linked list
    @Test
    public void testInitiatedLinkedList() {
        LinkedList list = new LinkedList();
        boolean isTrue = false;
        if(list.head == null){
            isTrue = true;
        }

        assertTrue("Linked list has a value of 0", isTrue );
    }

    // Test 2 Can properly insert into the linked list
    @Test
    public void testInsertLinkedList() {
        LinkedList listTest = new LinkedList();
        listTest.insert(16);
        boolean isTrue = false;
        if( listTest.searchNode(listTest.head, 16) == true){
            isTrue = true;
        }

        assertTrue("Ability to insert into linked list", isTrue );
    }

    // Test 3 the head property will properly point to the first node in the linked list
    @Test
    public void testTheHeadPointingToFirst() {
        LinkedList listTest7 = new LinkedList();
        listTest7.insert(16);
        listTest7.insert(17);
        listTest7.insert(20);
        String actual = listTest7.toString(listTest7.head);
        // System.out.println(str);
        boolean isTrue = false;
        String expected = "{20} -> {17} -> {16} -> ";


        assertEquals("Head points to beginning, every value should be inserted at beginning", expected, actual );

    }

    // Test 4 Can properly insert multiple nodes into the linked list
    @Test
    public void testInsertMultipleNodes() {
        LinkedList listTest = new LinkedList();
        listTest.insert(16);
        listTest.insert(17);
        listTest.insert(18);
        boolean isTrue = false;

        if( listTest.searchNode(listTest.head, 16) == true && listTest.searchNode(listTest.head, 17) == true && listTest.searchNode(listTest.head, 18) == true){
            isTrue = true;
        }

        assertTrue("Can properly insert multiple nodes", isTrue );
    }

    // Test 5 Will return true when finding a value within the linked list that exists
    @Test
    public void testFindValueSearched() {
        LinkedList listTest = new LinkedList();
        listTest.insert(16);
        listTest.insert(17);
        listTest.insert(18);
        boolean isTrue = false;

        if( listTest.searchNode(listTest.head, 16) == true){
            isTrue = true;
        }

        assertTrue("Will return true when finding a value within the linked list that exists", isTrue );
    }


    // Test 6 Will return false when searching for a value in the linked list that does not exist
    @Test
    public void testValueNotFound() {
        LinkedList listTest = new LinkedList();
        listTest.insert(16);
        listTest.insert(17);
        listTest.insert(18);
        boolean isTrue = false;


        if( listTest.searchNode(listTest.head, 19) == true){
            isTrue = true;
        }
        else{
            isTrue = false;
        }

        assertFalse("Will return false when searching for a value in the linked list that does not exist", isTrue );
    }


    // Test 7 Can properly return a collection of all the values that exist in the linked list
    @Test
    public void testTheHeadPointingToFirs() {
        LinkedList listTest7 = new LinkedList();
        listTest7.insert(16);
        listTest7.insert(17);
        listTest7.insert(20);
        String actual = listTest7.toString(listTest7.head);
       // System.out.println(str);
        boolean isTrue = false;
        String expected = "{20} -> {17} -> {16} -> ";


    assertEquals("Can properly return a collection of all the values that exist in the linked list", expected, actual );

    }


}