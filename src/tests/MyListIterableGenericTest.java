package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domain.MyListIterable;

public class MyListIterableGenericTest {

    private MyListIterable<String> words;

    @BeforeEach
    public void before() {
        words = new MyListIterable<>("words");
    }

    @Test
    public void showList() {
        words.insertAtFront("up");
        words.insertAtFront("fortune");
        words.insertAtFront("my");
        String test = words.toString().replaceAll("\\s+", " ").trim();
        assertEquals("The words is: my fortune up", test);
    }

    @Test
    public void showEmptyList() {
        String test = words.toString().replaceAll("\\s+", " ").trim();
        assertEquals("words is empty", test);
    }

}
