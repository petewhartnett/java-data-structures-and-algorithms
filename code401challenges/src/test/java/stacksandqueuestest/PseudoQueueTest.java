package stacksandqueuestest;

import org.junit.Test;
import stacksandqueues.PseudoQueue;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void testPsuedoQueue() {
        PseudoQueue fakeQueue = new PseudoQueue();

        fakeQueue.enqueue(56);
        fakeQueue.enqueue(57);
        fakeQueue.enqueue(58);


        String expected  = "{58}";
        String actual = fakeQueue.toString();

        assertEquals("Should return deleted value", expected, actual );

    }



}