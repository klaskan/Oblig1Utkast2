package com.company;

import static org.junit.Assert.*;

public class ArrayDequeTest {

    @org.junit.Test
    public void size() {

        ArrayDeque<String> test = new ArrayDeque<>(10);
        try{
            test.addFirst("Hei");
            test.addLast("Nei");
            assertEquals(test.size(), 2);
        }catch (DequeFullException e){
            System.out.println(e.getMessage());
        }



    }

    @org.junit.Test
    public void addFirst() {

    }

    @org.junit.Test
    public void pullFirst() {
    }

    @org.junit.Test
    public void peekFirst() {
    }

    @org.junit.Test
    public void addLast() {
    }

    @org.junit.Test
    public void pullLast() {
    }

    @org.junit.Test
    public void peekLast() {
    }

    @org.junit.Test
    public void contains() {
    }

    @org.junit.Test
    public void toArray() {
    }

    @org.junit.Test
    public void clear() {
    }
}