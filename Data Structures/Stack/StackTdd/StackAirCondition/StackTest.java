package StackAirCondition;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private MyStack myStack;

    @BeforeEach
    public void createStack(){
        myStack = new MyStack();
    }

    @Test
    public void testThatStackIsCreated(){
        myStack = new MyStack();
    }
    @Test
    public void testThatStackIsEmpty(){
        assertTrue( myStack.isEmpty());
    }
    @Test
    public void testThatWhenIPushOneElementMyStackIsNotEmpty(){
        myStack.push("volvo");
      assertFalse(myStack.isEmpty());
    }
    @Test
    public void testThatWhenIPushOneAndPopOneElementMyStackIsEmpty(){
       myStack.push("volvo");
       assertFalse(myStack.isEmpty());
       myStack.pop();
       assertThrows(IllegalArgumentException.class, () -> myStack.pop());
    }
    @Test
    public void testThatWhenIPushMultipleElementTheLastOneIsPopped(){
        myStack.push("volvo");
        assertFalse(myStack.isEmpty());
        myStack.push("Benz");
        assertFalse(myStack.isEmpty());
        myStack.push("Toyota");
        assertFalse(myStack.isEmpty());
        myStack.pop();
        assertFalse(myStack.isEmpty());
    }
    @Test
    public void testThatWhenIPeekAtTHeLastObjectExceptionIsThrown(){
        assertTrue(myStack.isEmpty());
        assertThrows(IllegalArgumentException.class, () -> myStack.peek());
    }
    @Test
    public void testThatWhenIPeekAtTHeLastObjectItReturnTheName(){
        assertTrue(myStack.isEmpty());
        myStack.push("volvo");
        assertFalse(myStack.isEmpty());
        assertEquals("volvo", myStack.peek());
    }
    @Test
    public void testThatWhenISearchForElement(){
        assertTrue(myStack.isEmpty());
        myStack.push("volvo");
        assertFalse(myStack.isEmpty());
        myStack.push("Benz");
        assertFalse(myStack.isEmpty());
        myStack.push("Toyota");
        assertFalse(myStack.isEmpty());
        assertEquals("Benz", myStack.search());
    }
}
