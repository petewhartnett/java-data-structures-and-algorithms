package utilities;

import org.junit.Test;
import stacksandqueues.Queue;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    //tests the 1st in 1st out property of dequeue
    @Test
    public void testShelterDequeueMethod() {

        AnimalShelter seattle = new AnimalShelter();

        seattle.enqueue("oscar");
        seattle.enqueue("shadow");
        seattle.enqueue("aubrey");



        String actual = seattle.dequeue();
        String expected = "oscar";
        assertEquals("Should return the first animal in, oscar in this case", expected, actual );

    }

    //Tests enqueue is inserting properly
    @Test
    public void testShelterEnqueueMethod() {

        AnimalShelter seattle = new AnimalShelter();

        seattle.enqueue("boomer");
        seattle.enqueue("tucker");
        seattle.enqueue("oscar");
        seattle.enqueue("shadow");
        seattle.enqueue("aubrey");



        String actual = seattle.dequeue();
        String expected = "boomer";
        assertEquals("Should return the first animal entered, boomer in this case", expected, actual );

    }

}