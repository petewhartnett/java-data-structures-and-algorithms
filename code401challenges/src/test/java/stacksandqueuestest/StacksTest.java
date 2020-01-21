
package stacksandqueuestest;
import linkedlist.LinkedList;
import stacksandqueues.Queue;
import stacksandqueues.Stack;
import org.junit.Test;
import static org.junit.Assert.*;

public class StacksTest {


    //TEST 1 tests pop method
    @Test
    public void testPopMethod() {
        Stack stack = new Stack();



        stack.push(56);
        stack.push(57);
        stack.push(58);
        stack.push(59);

        String expected = "{59}";
        String actual = stack.toString();

        System.out.println(stack.toString());
        assertEquals("Should return the last inserted integer", expected, actual );

    }

    //Test two tests Peek method
    @Test
    public void testPeekMethod() {
        Stack stack = new Stack();



        stack.push(56);
        stack.push(57);
        stack.push(58);
        stack.push(59);

        int expected = 59;
        int actual = stack.peek();



        assertEquals("Should test peek method", expected, actual );

    }



    @Test
    public void testIsEmptyQFalse() {
        Stack stack = new Stack();
        stack.push(56);
        stack.push(57);
        stack.push(58);

        Boolean expected = false;
        Boolean actual = stack.isEmpty();

        System.out.println(stack.toString());
        assertEquals("Should return false if not empty", expected, actual );

    }

    @Test
    public void testIsEmptyQTrue() {
        Queue queue = new Queue();


        Boolean expected = true ;
        Boolean actual = queue.isEmpty();

        //System.out.println(queue.toString());
        assertEquals("Should return true if empty", expected, actual );

    }

}
