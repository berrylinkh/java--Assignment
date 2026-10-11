import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {
        private MySet set;

        @BeforeEach
        public void setUp(){
            set = new MySet();
        }
        @Test
        public void testThatSet_IsEmpty(){
            assertTrue(set.isEmpty());
        }
        @Test
        public void testThatAnElement_CanBeAdded() {
            assertTrue(set.add("java"));
            assertEquals(1, set.getSize());
        }
        @Test
        public void testThatMultipleElement_CanBeAdded(){
            assertTrue(set.add("java"));
            assertTrue(set.add("python"));
            assertTrue(set.add("script"));
            assertEquals(3, set.getSize());
        }
    @Test
    public void testThatSameElement_CanNotBeAdded(){
        assertTrue(set.add("java"));
        assertFalse(set.add("java"));
        assertTrue(set.add("script"));
        assertEquals(2, set.getSize());
    }
        @Test
        public void testThatANewArray_CanBeCreated_AndElementCanBeAdded(){
            assertTrue(set.add("java"));
            assertTrue(set.add("python"));
            assertTrue(set.add("script"));
            assertTrue(set.add("c++"));
            assertTrue(set.add("jango"));
            assertTrue(set.add("golang"));
            assertEquals(6, set.getSize());
        }
        @Test
        public void testThatAnElement_CanBeRemove() {
            assertTrue(set.add("java"));
            assertEquals(1, set.getSize());
            set.remove(0);
            assertEquals(0, set.getSize());
        }
        @Test
        public void testThatAnElement_CanBeRemoveFromIndex() {
            assertTrue(set.add("java"));
            assertTrue(set.add("python"));
            assertTrue(set.add("script"));
            assertTrue(set.add("c++"));
            assertTrue(set.add("jango"));
            assertEquals(5, set.getSize());
            set.remove(3);
            assertEquals(4, set.getSize());
        }
        @Test
        public void testThatMultipleElement_CanBeRemoveFromIndex() {
            assertTrue(set.add("java"));
            assertTrue(set.add("python"));
            assertTrue(set.add("script"));
            assertTrue(set.add("c++"));
            assertTrue(set.add("jango"));
            assertEquals(5, set.getSize());
            set.remove(3);
            assertEquals(4, set.getSize());
            set.remove(0);
            assertEquals(3, set.getSize());
        }
        @Test
        public void testThatSet_ContainAnElement() {
            assertTrue(set.add("java"));
            assertTrue(set.contains(new String ("java")));
            assertTrue(set.add("python"));
            assertTrue(set.contains(new String ("python")));
            assertEquals(2, set.getSize());

        }
    @Test
    public void testThatSet_ClearElement() {
        assertTrue(set.add("java"));
        assertTrue(set.contains(new String ("java")));
        assertTrue(set.add("python"));
        assertTrue(set.contains(new String ("python")));
        assertTrue(set.add("script"));
        assertTrue(set.contains(new String ("script")));
        assertEquals(3, set.getSize());
        set.clear();
        assertEquals(0, set.getSize());
    }
}
