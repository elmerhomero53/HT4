package com.company;

public class Node<E> {
    private E data; // value stored in this element
    protected Node<E> nextElement; // ref to next

    public Node(E v, Node<E> next)   {
        data = v;
        nextElement = next;
    }

    public Node(E v)   {
        this(v,null);
    }

    public Node<E> next()   {
        return nextElement;
    }

    public void setNext(Node<E> next)   {
        nextElement = next;
    }

    public E value()   {
        return data;
    }

    public void setValue(E value)   {
        data = value;
    }
}
