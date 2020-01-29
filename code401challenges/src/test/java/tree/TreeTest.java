package tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeTest {

    @Test public void testInOrderSearch() {
        Node root = new Node(1);
        root.left = new Node (10);
        root.right = new Node(2);
     Tree test = new Tree();

        ArrayList<Integer> arraylist = test.inOrder(root);

       String actual = arraylist.toString();

       String expected = "[10, 1, 2]";

       assertEquals("Tests In order search ", expected, actual );
    }


    @Test public void testPreOrder() {
        Node root = new Node(1);
        root.left = new Node (10);
        root.right = new Node(2);
        Tree test = new Tree();

        ArrayList<Integer> arraylist = test.preOrder(root);

        String actual = arraylist.toString();
        String expected = "[1, 10, 2]";

        assertEquals("inserted value tree ", expected, actual );
    }

    @Test public void testPostOrder() {
        Node root = new Node(1);
        root.left = new Node (10);
        root.right = new Node(2);
        Tree test = new Tree();


        ArrayList<Integer> arraylist = test.postOrder(root);


        String actual = arraylist.toString();
        String expected = "[10, 2, 1]";
        //test1.breadthSearch(root);

        assertEquals("inserted value tree ", expected, actual );
    }


}