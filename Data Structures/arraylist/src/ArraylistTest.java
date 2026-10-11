import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import javax.swing.text.Element;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ArraylistTest {
        private Arraylist list;

        @BeforeEach
        public void setUp(){
            list = new Arraylist();
        }
        @Test
        public void testThatArray_IsEmpty(){
            assertTrue(list.isEmpty());
        }
        @Test
        public void testThatAnElement_CanBeAdded() {
            list.add(10);
            assertFalse(list.isEmpty());
            assertEquals(1, list.getSize());
        }
        @Test
        public void testThatMultipleElement_CanBeAdded(){
            list.add(10);
            list.add(20);
            list.add(30);
            assertEquals(3, list.getSize());
        }
        @Test
        public void testThatANewArray_CanBeCreated_AndElementCanBeAdded(){
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);
            assertEquals(6, list.getSize());
        }
        @Test
        public void testThatAnElement_CanBeRemove() {
            list.add(10);
            assertEquals(1, list.getSize());
            list.remove(0);
            assertEquals(0, list.getSize());
        }
    @Test
    public void testThatAnElement_CanBeRemoveFromIndex() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        assertEquals(5, list.getSize());
        list.remove(3);
        assertEquals(4, list.getSize());
    }
    @Test
    public void testThatMultipleElement_CanBeRemoveFromIndex() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        assertEquals(5, list.getSize());
        list.remove(3);
        assertEquals(4, list.getSize());
        list.remove(0);
        assertEquals(3, list.getSize());
    }
    @Test
    public void testThatArray_ContainAnElement() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        assertEquals(5, list.getSize());
        assertTrue(list.contains(40));

    }
    @Test
    public void testThatRemoveFirstElement_AndShiftOtherElementBackward() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(3, list.getSize());
        list.removeFirst();
        assertEquals(20, list.getElement(0));
        assertEquals(2, list.getSize());
    }
    @Test
    public void testThatRemoveFirstElement_InAnEmptyArray_ButThrowExcept() {
        assertThrows(NoSuchElementException.class, () -> list.removeFirst());
    }
    @Test
    public void testThatRemoveLastElement_AndShiftOtherElementBackward() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(3, list.getSize());
        assertEquals(30, list.removeLast());
        assertEquals(2, list.getSize());
        assertEquals(10, list.getElement(0));
        assertEquals(20, list.getElement(1));
    }
    @Test
    public void testThatRemoveLastElement_InAnEmptyArray_ButThrowExcept() {
        assertThrows(NoSuchElementException.class, () -> list.removeLast());
    }
    @Test
    public void testThatReplace_ElementAtIndex() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(3, list.getSize());
        list.set(1,40);
        assertEquals(40, list.getElement(1));
        assertEquals(3, list.getSize());
    }

}
