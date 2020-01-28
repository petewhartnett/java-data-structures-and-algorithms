package code401challenges;

import org.junit.Test;
import tree.Node;
import tree.Node2;
import tree.Tree;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void testFizz() {

        FizzBuzzTree test = new FizzBuzzTree();
        Node root = new Node(1);
        root.left = new Node (3);
        root.right = new Node(5);


        ArrayList arraylist = test.fizzBuzz(root);
        System.out.println(arraylist);
       String actual = arraylist.toString();
        String expected = "[fizz, 1, buzz]";

         assertEquals("tests fizz value ", expected, actual );
    }


    @Test
    public void testFizzBuzz() {

        FizzBuzzTree test = new FizzBuzzTree();
        Node root = new Node(1);
        root.left = new Node (3);
        root.right = new Node(15);


        ArrayList<String> arraylist = test.fizzBuzz(root);
        System.out.println(arraylist);
        String actual = arraylist.toString();
        String expected = "[fizz, 1, fizzBuzz]";

        assertEquals("Tests a value divisible by 3 and 5 ", expected, actual );
    }

    @Test
    public void testBuzz() {

        FizzBuzzTree test = new FizzBuzzTree();
        Node root = new Node(5);
        root.left = new Node (5);
        root.right = new Node(15);


        ArrayList<String> arraylist = test.fizzBuzz(root);
        System.out.println(arraylist);
        String actual = arraylist.toString();
        String expected = "[buzz, buzz, fizzBuzz]";

        assertEquals("Tests a value divisible by 3 and 5 ", expected, actual );
    }
}