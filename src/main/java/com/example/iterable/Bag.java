package main.java.com.example.iterable;
import com.example.iterable.Container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Container<T> {

    //class variables
    private ArrayList<T> bag;

    //constructor
    public Bag(){
        this.bag = new ArrayList<>();
    }

    //methods
    @Override
    public boolean isEmpty() {
        return bag.isEmpty();
    }

    @Override
    public int size() {
        return bag.size();
    }

    @Override
    public void add(T item) {
        bag.add(item);
    }

    public Iterator<T> iterator() {
        return bag.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        bag.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return bag.spliterator();
    }
}

/*
sorry for taking so long to turn this in! I'm just having trouble grasping a solid understanding of
what these different methods are actually doing. Everytime I think I'm starting to understand another piece
of information makes me rethink everything. I will be utilizing the tutors often over this next week to ensure
that I'm not falling behind. Though I just finished this and it was easier than I originally thought it would be
after reading the ReadMe file.
 */
