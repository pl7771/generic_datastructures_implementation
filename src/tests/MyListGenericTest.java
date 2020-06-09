package tests;

import exceptions.EmptyListException;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domain.MyList;

public class MyListGenericTest {

    private MyList<String> words;

    @BeforeEach
    public void before() {
        words = new MyList<>("words");
    }

    @Test
    public void emptyList() {
        assertTrue(words.isEmpty());

    }

    @Test
    public void insertAtFront() {
        words.insertAtFront("my");
        words.insertAtFront("fortune");
        words.insertAtFront("up");

        assertFalse( words.isEmpty());
    }
    

    @Test
    public void insertAtBack() {
        words.insertAtBack("my");
        words.insertAtBack("fortune");
        words.insertAtBack("up");

        assertFalse(words.isEmpty());
    }


    @Test
    public void deleteWords() {
        words.insertAtFront("up");
        words.insertAtFront("fortune");
        words.insertAtFront("my");
        assertFalse(words.isEmpty());
        assertEquals("my", words.removeFromFront());
        assertEquals("fortune", words.removeFromFront());
        assertEquals("up", words.removeFromFront());
        assertTrue(words.isEmpty());
    }
    
    @Test
    public void deleteEmptyList() {
    	assertThrows(EmptyListException.class, () -> {
    		words.removeFromFront();
    	});
    }
    
}
