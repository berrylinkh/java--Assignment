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
            set.add("java");
            assertFalse(set.isEmpty());
            assertEquals(1, set.getSize());
        }
        @Test
        public void testThatMultipleElement_CanBeAdded(){
            set.add("java");
            set.add("python");
            set.add("script");
            assertEquals(3, set.getSize());
        }
        @Test
        public void testThatANewArray_CanBeCreated_AndElementCanBeAdded(){
            set.add("java");
            set.add("python");
            set.add("script");
            set.add("c++");
            set.add("jango");
            set.add("golan");
            assertEquals(6, set.getSize());
        }
        @Test
        public void testThatAnElement_CanBeRemove() {
            set.add("java");
            assertEquals(1, set.getSize());
            set.remove(0);
            assertEquals(0, set.getSize());
        }
        @Test
        public void testThatAnElement_CanBeRemoveFromIndex() {
            set.add("java");
            set.add("python");
            set.add("script");
            set.add("c++");
            set.add("jango");
            assertEquals(5, set.getSize());
            set.remove(3);
            assertEquals(4, set.getSize());
        }
        @Test
        public void testThatMultipleElement_CanBeRemoveFromIndex() {
            set.add("java");
            set.add("python");
            set.add("script");
            set.add("c++");
            set.add("jango");
            assertEquals(5, set.getSize());
            set.remove(3);
            assertEquals(4, set.getSize());
            set.remove(0);
            assertEquals(3, set.getSize());
        }
        @Test
        public void testThatSet_ContainAnElement() {
            set.add("java");
            set.add("python");
            set.add("script");
            set.add("c++");
            set.add("jango");
            assertEquals(5, set.getSize());
            assertTrue(set.contains("c++"));

        }
    @Test
    public void testThatSet_ClearElement() {
        set.add("java");
        set.add("python");
        set.add("script");
        set.add("c++");
        set.add("jango");
        assertEquals(5, set.getSize());
        set.clear();
        assertEquals(0, set.getSize());
    }
}
