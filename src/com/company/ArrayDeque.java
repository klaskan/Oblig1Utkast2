package com.company;

import java.util.Arrays;
import java.util.stream.*;

/**
 * Kilder:
 * https://codereview.stackexchange.com/questions/186964/deque-implemented-using-a-circular-array
 * https://stackoverflow.com/questions/4208655/empty-an-array-in-java-processing
 * https://gist.github.com/samueltcsantos/3b96c30009d290d54d3a
 * @param <E>
 */

public class ArrayDeque<E> implements IDeque<E> {


    private E dequeArray[];
    private int front;
    private int back;
    private int size;
    private static final int DEFAULT_CAPACITY = 20;
    private int unitsInDeque;


    public ArrayDeque() {
        dequeArray = (E[]) new Object[DEFAULT_CAPACITY];
        this.front = 0;
        this.back = 0;
        this.unitsInDeque = 0;
        this.size = DEFAULT_CAPACITY;

    }

    public ArrayDeque(int størrelse) {
        dequeArray = (E[]) new Object[størrelse];
        this.front = 0;
        this.back = 0;
        this.unitsInDeque = 0;
        this.size = størrelse;
    }
    //Til testingen
    public E getFirstElement(){
        return dequeArray[0];
    }
    //Til testingen
    public E getLastElement(){
        return dequeArray[dequeArray.length-1];
    }

    public void printArray(){
        for(E element : dequeArray){
            System.out.println(element);
        }
    }

    @Override
    public int size() {
        return unitsInDeque;
    }

    @Override
    public void addFirst(E elem) throws DequeFullException {
        if(unitsInDeque == dequeArray.length){
            throw new DequeFullException("Deque is full");
        }else{
            unitsInDeque++;
            dequeArray[front] = elem;
            front = front + 1;
            front %= this.size;
        }
    }

    @Override
    public E pullFirst() throws DequeEmptyException {
        if(unitsInDeque == 0){
            throw new DequeEmptyException("Deque is empty");
        }else{
            int getFront = front-1;
            front--;
            unitsInDeque--;
            if (getFront < 0)
                getFront += this.size;

            E returValue = dequeArray[getFront % this.size];
            dequeArray[getFront % this.size] = null;
            return returValue;
        }
    }

    @Override
    public E peekFirst() throws DequeEmptyException {
        if(unitsInDeque == 0){
            throw new DequeEmptyException("Deque is empty");
        }else{
            int getFront = front-1;
            return dequeArray[getFront % this.size];
        }
    }

    @Override
    public void addLast(E elem) throws DequeFullException {
        if(unitsInDeque == dequeArray.length)
            throw new DequeFullException("Deque is full");

        unitsInDeque++;
        back = (back - 1) % this.size;
        dequeArray[back + this.size] = elem;

    }

    @Override
    public E pullLast() throws DequeEmptyException {
        if(unitsInDeque == 0){
            throw new DequeEmptyException("Deque is empty");
        }else {

            int getRearIndex = back + this.size;
            unitsInDeque--;
            back++;
            E returnElement = dequeArray[getRearIndex % this.size];
            dequeArray[getRearIndex % this.size] = null;
            return returnElement;
        }
    }

    @Override
    public E peekLast() throws DequeEmptyException {
        if(unitsInDeque == 0){
            throw new DequeEmptyException("Deque is empty");
        }else {
            int getRearIndex = back + this.size;
            return dequeArray[getRearIndex % this.size];
        }
    }

    @Override
    public boolean contains(Object elem) {
        for(E enhet : dequeArray){
            if(enhet == elem){
                return true;
            }
        }
        return false;
    }


    @SuppressWarnings("unchecked")
    @Override
    public <T> T[] toArray(T[] a) {
        return (T[]) Arrays.copyOf(dequeArray, size(), a.getClass());
    }



    @Override
    public void clear() {
        Arrays.fill(dequeArray, null);

    }
}
