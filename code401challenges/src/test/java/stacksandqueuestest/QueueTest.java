package stacksandqueuestest;
import stacksandqueues.Queue;
import org.junit.Test;
import static org.junit.Assert.*;


public class QueueTest {

// tests enqueue method and toString
    @Test
    public void testEnqueMethod() {
        Queue queue = new Queue();

        queue.enqueue(56);
        queue.enqueue(57);
        queue.enqueue(58);


        String expected = "{56}";
        String actual = queue.toString();

        System.out.println(queue.toString());
        assertEquals("Should return the last inserted integer", expected, actual );

    }


    //Tests peek it should return the value entered first
    @Test
    public void testPeek() {
        Queue queue = new Queue();



        queue.enqueue(56);
        queue.enqueue(57);
        queue.enqueue(58);
       System.out.println (queue.peek());


        int expected = 56 ;
        int actual = queue.peek();

        //System.out.println(queue.toString());
        assertEquals("Testing peek method", expected, actual );

    }

    @Test
    public void testIsEmptyFalse() {
        Queue queue = new Queue();

        queue.enqueue(56);
        queue.enqueue(57);
        queue.enqueue(58);

        Boolean expected = false ;
        Boolean actual = queue.isEmpty();

        //System.out.println(queue.toString());
        assertEquals("Should return false if not empty", expected, actual );

    }
    @Test
    public void testIsEmptyTrue() {
        Queue queue = new Queue();

        Boolean expected = true ;
        Boolean actual = queue.isEmpty();

        //System.out.println(queue.toString());
        assertEquals("Should return true if empty", expected, actual );

    }

    @Test
    public void testDequeMethod() {
        Queue queue = new Queue();

        queue.enqueue(56);
        queue.enqueue(57);
        queue.enqueue(58);
        queue.dequeue();


        int expected = 57;
        int actual = queue.dequeue();

        assertEquals("Should return deleted value", expected, actual );

    }

}
