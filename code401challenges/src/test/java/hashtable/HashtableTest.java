package hashtable;

import org.junit.Test;
import tree.BinarySearchTree;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void testHash() {

        Hashtable hashtable = new Hashtable();

        String key = "peter";

        hashtable.hash(key);

        int actual =  hashtable.hash(key);
        int expected =  64;

        System.out.println("test");

        assertEquals("inserted value into middle of array", expected, actual);
    }


    @Test
    public void testHash2() {

        Hashtable hashtable = new Hashtable();

        String key = "test";

        hashtable.hash(key);

        int actual =  hashtable.hash(key);
        int expected =  88;

        System.out.println("test");

        assertEquals("inserted value into middle of array", expected, actual);
    }

    @Test
    public void testHashtableAdd() {

        Hashtable test = new Hashtable();
        test.add("peter");

        Node actual = test.hashtable[60];

        Node expected = null;

        System.out.println("test");

        assertEquals("inserted value into middle of array", expected, actual);
    }

    @Test
    public void testHashtableAdd2() {

        Hashtable test = new Hashtable();
        test.add("peter");

        String name = test.hashtable[64].name;
        System.out.println(name);
        String actual = name;
        String expected = "peter";

        System.out.println(name);

        assertEquals("inserted value into middle of array", expected, actual);
    }

    @Test
    public void testHashtableGet() {

        Hashtable test = new Hashtable();
        String name = "mouse";
        test.add("peter");
        test.add("test");
        test.add("mouse");


        String actual = test.get(name);
        String expected = name;

        System.out.println(name);

        assertEquals("inserted value into middle of array", expected, actual);
    }

    @Test
    public void testHashtableContains() {

        Hashtable test = new Hashtable();
        String name = "mouse";
        test.add("peter");
        test.add("test");
        test.add("mouse");


        boolean actual = test.contains(name);
        boolean expected = true;

        System.out.println(name);

        assertEquals("inserted value into middle of array", expected, actual);
    }

    @Test
    public void testHashtableContains2() {

        Hashtable test = new Hashtable();
        String name = "test";
        test.add("peter");
        test.add("test");
        test.add("mouse");


        boolean actual = test.contains(name);
        boolean expected = true;

        System.out.println(name);

        assertEquals("inserted value into middle of array", expected, actual);
    }

    @Test
    public void testHashtableHash3() {

        Hashtable test = new Hashtable();
        int hash = test.hash("test");

        int actual = hash;
        int expected = 88;


        assertEquals("inserted value into middle of array", expected, actual);
    }
    @Test
    public void testHashtableCollision() {

        Hashtable test = new Hashtable();
        test.add("dop");
        test.add("pod");

       String actual =  test.get("pod");
        String expected = "pod";


        assertEquals("inserted value into middle of array", expected, actual);
    }

}