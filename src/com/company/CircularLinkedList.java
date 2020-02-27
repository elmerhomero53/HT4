package com.company;

public class CircularLinkedList<E> extends AbstractList<E>{

    private Node<E> tail;
    private int count;
    private CircularLinkedList<String> listc;

    public CircularLinkedList(){
        tail = null;
        count = 0;
    }

    @Override
    public int size(){
        return count;
    }

    @Override
    public void addFirst(E value){
        Node<E> temp = new Node<>(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        count++;
    }

    @Override
    public E removeFirst(){
        E value = tail.value();
        tail = null;
        return value;
    }

    @Override
    public void addLast(E value){
        addFirst(value);
        tail = tail.next();
    }

    @Override
    public E removeLast(){
        Node<E> finger = tail;
        while (finger.next() != tail) {
            finger = finger.next();
        }
        // finger now points to second-to-last value
        Node<E> temp = tail;
        if (finger == tail)
        {
            tail = null;
        } else {
            finger.setNext(tail.next());
            tail = finger;
        }
        count--;
        return temp.value();
    }

    @Override
    public E getFirst()  {
        return tail.value();
    }

    @Override
    public int indexOf(E value) {
        Node<E> finger = tail;
        int counter =0;
        while (finger.next().value() != tail)
        {
            finger = finger.next();
            counter++;
        }
        return counter;
    }

    @Override
    public E peek() {
        return tail.value();
    }
}