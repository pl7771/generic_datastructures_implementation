package tests;

import exceptions.EmptyListException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domain.MyStack;

public class StackGenericTest {

    private MyStack<String> wordsStack;

    @BeforeEach
    public void before() {
        wordsStack = new MyStack<>("wordsStack");
    }

    @Test
    public void stackLeeg() {
        assertTrue(wordsStack.isEmpty());
    }

    @Test
    public void addWords() {
        wordsStack.push("up");
        wordsStack.push("fortune");
        wordsStack.push("my");
        assertFalse(wordsStack.isEmpty());
    }

    @Test
    public void deleteWords() {
        wordsStack.push("up");
        wordsStack.push("fortune");
        wordsStack.push("my");
        assertFalse(wordsStack.isEmpty());
        assertEquals("my", wordsStack.pop());
        assertEquals("fortune", wordsStack.pop());
        assertEquals("up", wordsStack.pop());
        assertTrue(wordsStack.isEmpty());
    }
    
    @Test
    public void deleteFromEpmtyStack() {
    	assertThrows(EmptyListException.class , () -> {
    		wordsStack.pop();
    	});
    }

}
