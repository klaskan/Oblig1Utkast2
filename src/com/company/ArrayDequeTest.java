package com.company;

import static org.junit.Assert.*;

public class ArrayDequeTest {

    @org.junit.Test
    public void size() {
        ArrayDeque<String> test = new ArrayDeque<>(10);
        try{
            String lei = "Lei";
            test.addFirst("Hei");
            test.addLast("Nei");
            assertEquals(test.size(), 2);
            test.pullFirst();
            assertEquals(test.size(), 1);
        }catch (DequeFullException e){
            System.out.println(e.getMessage());
        }catch (DequeEmptyException e){
            System.out.println(e.getMessage());
        }



    }

    @org.junit.Test
    public void addFirst() {
        ArrayDeque<String> test = new ArrayDeque<>(10);

        try{
            String hei = "Hei";
            test.addFirst(hei);
            String firstString = test.getFirstElement();
            assertEquals(firstString, hei);
            assertEquals(test.size(), 1);
        }catch (DequeFullException e) {
            System.out.println(e.getMessage());
        }

    }

    @org.junit.Test
    public void pullFirst() {
        ArrayDeque<String> test = new ArrayDeque<>(10);
        try {
            String hei = "Hei";
            test.addFirst(hei);
            assertEquals(test.pullFirst(), hei);
            assertEquals(test.getFirstElement(), null);
        }catch (DequeFullException e){
            System.out.println(e.getMessage());
        }catch (DequeEmptyException e){
            System.out.println(e.getMessage());
        }


    }

    @org.junit.Test
    public void peekFirst() {

        ArrayDeque<String> test = new ArrayDeque<>(10);
        try {
            String hei = "Hei";
            test.addFirst(hei);
            assertEquals(test.peekFirst(), hei);
            assertEquals(test.getFirstElement(), hei);
        }catch (DequeFullException e){
            System.out.println(e.getMessage());
        }catch (DequeEmptyException e){
            System.out.println(e.getMessage());
        }


    }

    @org.junit.Test
    public void addLast() {
        ArrayDeque<String> test = new ArrayDeque<>(10);

        try{
            String hei = "Hei";
            test.addLast(hei);
            String lastString = test.getLastElement();
            assertEquals(lastString, hei);
        }catch (DequeFullException e){
            System.out.println(e.getMessage());
        }

    }

    @org.junit.Test
    public void pullLast() {
        ArrayDeque<String> test = new ArrayDeque<>(10);
        try {
            String hei = "Hei";
            test.addLast(hei);
            assertEquals(test.pullLast(), hei);
            assertEquals(test.getLastElement(), null);
        }catch (DequeFullException e){
            System.out.println(e.getMessage());
        }catch (DequeEmptyException e){
            System.out.println(e.getMessage());
        }
    }

    @org.junit.Test
    public void peekLast() {
        ArrayDeque<String> test = new ArrayDeque<>(10);
        try {
            String hei = "Hei";
            test.addLast(hei);
            assertEquals(test.peekLast(), hei);
            assertEquals(test.getLastElement(), hei);
        }catch (DequeFullException e){
            System.out.println(e.getMessage());
        }catch (DequeEmptyException e){
            System.out.println(e.getMessage());
        }



    }

    @org.junit.Test
    public void contains() {
        ArrayDeque<String> test = new ArrayDeque<>(10);

        try{
            String first = "Hei";
            String last = "Nei";

            test.addFirst(first);
            test.addLast(last);

            assertEquals(test.contains(last), true);
            assertEquals(test.contains(first), true);

        }catch (DequeFullException e){
            System.out.println(e.getMessage());
        }

    }

    @org.junit.Test
    public void toArray() {



    }

    @org.junit.Test
    public void clear() {
        ArrayDeque<String> test = new ArrayDeque<>(10);

        try{
            String first = "Hei";
            String last = "Nei";
            test.addFirst(first);
            test.addLast(last);
            test.clear();
            assertEquals(test.getLastElement(), null);
            assertEquals(test.contains(first), false);

        }catch (DequeFullException e){
            System.out.println(e.getMessage());
        }



    }
}