package tests;

import exceptions.EmptyListException;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domain.MyQueue;

public class QueueGenericTest {

    private MyQueue<String> wordsQueue;

    @BeforeEach
    public void before() {
        wordsQueue = new MyQueue<>("wordsQueue");
    }

    @Test
    public void queueEmpty() {
        assertTrue(wordsQueue.isEmpty());
    }

    @Test
    public void addWord() {
        wordsQueue.offer("up");
        wordsQueue.offer("fortune");
        wordsQueue.offer("my");
        assertFalse(wordsQueue.isEmpty());
    }
    
    @Test
    public void deleteWords() {
        wordsQueue.offer("my");
        wordsQueue.offer("fortune");
        wordsQueue.offer("up");
        assertFalse(wordsQueue.isEmpty());
        assertEquals("my", wordsQueue.poll());
        assertEquals("fortune", wordsQueue.poll());
        assertEquals("up", wordsQueue.poll());
        assertTrue(wordsQueue.isEmpty());
    }
    
    @Test
    public void emptyQueueDeleting() {
    	assertThrows(EmptyListException.class, () -> {
    		wordsQueue.poll();
    	});
    } 

}
