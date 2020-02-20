package tree;

import treeIntersection.TreeIntersection;
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

        int data = 0;
        String actual = arraylist.toString();
        String expected = "[10, 2, 1]";
        //test1.breadthSearch(root);
        int tester = test.findMaxValue(root, data);
        System.out.println(tester);
        assertEquals("inserted value tree ", expected, actual );
    }



    @Test public void testMaxValue() {
        Node root = new Node(10);
        root.left = new Node (1);
        root.right = new Node(2);
        Tree test = new Tree();

        Node root2 = new Node(10);
        root.left = new Node (1);
        root.right = new Node(2);



       // ArrayList<Integer> arraylist = test.postOrder(root);


        ArrayList<Integer> arrayList;
        arrayList = TreeIntersection.treeIntersection(root,root2);

        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));

        }


        int data = 0;

        int expected = 10;
        //test1.breadthSearch(root);
        int actual = test.findMaxValue(root, data);
        System.out.println(actual);
        assertEquals("inserted value tree ", expected, actual );
    }

}