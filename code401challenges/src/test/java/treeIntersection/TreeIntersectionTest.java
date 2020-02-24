package treeIntersection;

import graph.Graph;
import org.junit.Test;
import tree.Node;
import tree.Tree;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeIntersectionTest {



    @Test
    public void inOrder() {
        Tree test = new Tree();
        Node root = new Node(1);
        root.left = new Node (10);
        root.right = new Node(2);




        ArrayList<Integer> arraylist = test.inOrder(root);

        String actual = arraylist.toString();

        String expected = "[10, 1, 2]";

        assertEquals("Tests In order search ", expected, actual );
    }



    @Test
    public void treeIntersection() {

        Node root = new Node(7);
        root.left = new Node(1);
        root.right = new Node(2);


        Node root2 = new Node(7);
        root2.left = new Node(1);
        root2.right = new Node(6);

        TreeIntersection test = new TreeIntersection();
        ArrayList<Integer> arrayList;
        arrayList =  test.treeIntersection(root, root2);
        String actual = arrayList.toString();
        String expected = "[1, 7, 2, 1, 7, 6]";

        //  for (int i = 0; i < arrayList.size(); i++) {
       // System.out.println(actual);



       System.out.println(actual);
   assertEquals("inserted value tree ", expected, actual );


        // }
    }
}