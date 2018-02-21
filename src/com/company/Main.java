package com.company;

public class Main {

    public static void main(String[] args) {

        ArrayDeque<String> arrayDeque = new ArrayDeque<>(10);

        try {
            arrayDeque.addFirst("1");
            arrayDeque.addFirst("2");
            arrayDeque.addFirst("3");
            arrayDeque.addLast("10000");
            arrayDeque.addLast("20000");
            arrayDeque.addLast("3000");


            arrayDeque.printArray();
            System.out.println("______");
            System.out.println(arrayDeque.peekFirst());
            System.out.println(arrayDeque.peekFirst());
            System.out.println(arrayDeque.peekLast());
            System.out.println(arrayDeque.pullLast());
            System.out.println(arrayDeque.peekLast());
            System.out.println("_______");
            arrayDeque.printArray();
            arrayDeque.clear();
            arrayDeque.printArray();

        } catch (DequeFullException e) {
            System.out.println(e);
        }catch (DequeEmptyException e){
            System.out.println(e);
        }
    }
}
