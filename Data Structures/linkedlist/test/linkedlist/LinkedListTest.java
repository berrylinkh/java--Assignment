package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    private LinkedList linkedlist;

    @BeforeEach
    public void createLinkedList(){
        linkedlist = new LinkedList();
    }
    @Test

    public void testNewLinkedListIsEmpty(){
        assertNull(linkedlist.getHead());
        assertEquals(0,linkedlist.getSize());
    }
    @Test
    public void testThatNodeCanBeAdded(){
        linkedlist.append("bus");
        assertEquals("bus",linkedlist.getHead().getData());
        assertEquals(1,linkedlist.getSize());
    }
    @Test
    public void testThatMultipleNodesCanBeAdded(){
        linkedlist.append("bus");
        assertEquals("bus",linkedlist.getHead());
        linkedlist.append("lorry");
        assertEquals("lorry",linkedlist.getHead());
        linkedlist.append("truck");
        assertEquals("truck",linkedlist.getHead());
        assertEquals(3,linkedlist.getSize());
    }

    @Test
    public void testThatNodeCanBeAddedAndPrepended(){
        linkedlist.append("bus");
        assertEquals("bus",linkedlist.getHead().getData());
        assertEquals(1,linkedlist.getSize());
        linkedlist.prepend("lorry");
        assertEquals("lorry", linkedlist.getHead().getData());
        assertEquals(2,linkedlist.getSize());
    }
    @Test
    public void testThatMultipleNodesCanBeAddedAndPrepended(){
        linkedlist.append("bus");
        assertEquals("bus",linkedlist.getHead().getData());
        linkedlist.prepend("lorry");
        assertEquals("lorry",linkedlist.getHead().getData());
        linkedlist.prepend("truck");
        assertEquals("truck", linkedlist.getHead().getData());
        assertEquals(3,linkedlist.getSize());
    }
    @Test
    public void testThatNodeCanBeInsertedInAnIndex(){
        linkedlist.append("bus");
        assertEquals("bus",linkedlist.getHead().getData());
        assertEquals(1,linkedlist.getSize());
        linkedlist.append("lorry");
        assertEquals("bus", linkedlist.getHead().getData());
        assertEquals(2,linkedlist.getSize());
        linkedlist.insert("truck", 1);
        assertEquals("truck", linkedlist.getHead().getNext().getData());
    }
    @Test
    public void testThatMultipleNodesCanBePopped(){
        linkedlist.append("bus");
        assertEquals("bus",linkedlist.getHead().getData());
        linkedlist.pop("bus");
        assertNull(linkedlist.getHead());
        assertEquals(0,linkedlist.getSize());
    }
    @Test
    public void testThatMultipleNodesCanBePoppedAtIndex(){
        linkedlist.append("bus");
        assertEquals("bus",linkedlist.getHead().getData());
        linkedlist.append("lorry");
        assertEquals("bus",linkedlist.getHead().getData());
        linkedlist.prepend("truck");
        assertEquals("truck", linkedlist.getHead().getData());
        linkedlist.popAt(1);
        assertEquals(2,linkedlist.getSize());
    }

}
