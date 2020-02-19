package repeatedWord;

import hashtable.Hashtable;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {


    @Test
    public void testRepeatedWord() {



        String test = "this is a nice morning, it is";

        String actual = RepeatedWord.repeat(test);


        String expected = "is";



        assertEquals("inserted value into middle of array", expected, actual);
    }


    @Test
    public void testRepeatedWord2() {



        String test = " this is a nice morning, this sure is.";

        String actual = RepeatedWord.repeat(test);


        String expected = "this";



        assertEquals("expecting this to make sure the first repeated not second is returned", expected, actual);
    }

    @Test
    public void testRepeatedWordEmpty() {



        String test = " ";

        String actual = RepeatedWord.repeat(test);


        String expected = null;



        assertEquals("Null is expected", expected, actual);
    }

}