package test.java.com.example.iterable;

import main.java.com.example.iterable.Bag;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class BagTest {

    private Bag<String> bag;

    @BeforeEach
    public void setUp() {
        bag = new Bag<>();
    }

    @Test
    public void testAddAndSize() {
        bag.add("Apple");
        bag.add("Orange");
        bag.add("Banana");
        bag.add("Tangerine");
        bag.add("Peach");
        bag.add("Grape");

        assertEquals(6, bag.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(bag.isEmpty());
        bag.add("Apple");
        assertFalse(bag.isEmpty());
    }

    @Test
    public void testIterator() {
        bag.add("Apple");
        bag.add("Orange");
        bag.add("Banana");
        bag.add("Tangerine");
        bag.add("Peach");
        bag.add("Grape");

        Iterator<String> iter = bag.iterator();
        assertTrue(iter.hasNext());
        assertEquals("Apple", iter.next());
        assertEquals("Orange", iter.next());
        assertEquals("Banana", iter.next());
        assertEquals("Tangerine", iter.next());
        assertEquals("Peach", iter.next());
        assertEquals("Grape", iter.next());
        assertFalse(iter.hasNext());
    }

    @Test
    public void testAddMultipleItems() {
        for (int i = 0; i < 25; i++) {
            bag.add("Fruit" + i);
        }
        assertEquals(25, bag.size());
    }

}