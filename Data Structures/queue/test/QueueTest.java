import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue queue;

    @BeforeEach
    public void setUp(){
        queue = new Queue() ;
    }
    @Test
    public void testThatQueue_IsCreated(){
        queue = new Queue();
    }
    @Test
    public void testThatQueue_IsEmpty(){
        assertTrue(queue.isEmpty());
    }
    @Test
    public void testThatAnElement_CanBeAdded() {
        queue.addElement("java");
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.getSize());
    }
    @Test
    public void testThatMultipleElement_CanBeAdded(){
        queue.addElement("java");
        queue.addElement("python");
        queue.addElement("rust");
        assertFalse(queue.isEmpty());
        assertEquals(3, queue.getSize());
    }
    @Test
    public void testThatMultipleElement_CanBeRemoved(){
        queue.addElement("java");
        queue.addElement("python");
        queue.addElement("rust");
        assertEquals(3, queue.getSize());
        queue.RemoveElement("python");
        assertEquals(2, queue.getSize());

    }
    @Test
    public void testThatAnElement_CanBeAddedAndPoll() {
        queue.addElement("java");
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.getSize());
        queue.RemoveElement("java");
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.getSize());
    }
}
