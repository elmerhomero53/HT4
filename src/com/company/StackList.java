package com.company;

public class StackList <E> extends AbstractStack<E>{
    private iLista<String> list;
    private iLista<String> listc;

    public StackList(String tipo)
    {
        if (tipo.equals("Simplemente encadenada"))
        {
            list = new SinglyLinkedList<>();
        }
        if (tipo.equals("Doblemente encadenada"))
        {
            list = new DoublyLinkedList<>();
        }
        if (tipo.equals("Lista Circular"))
        {
            listc = new CircularLinkedList<String>();
        }
    }

    @Override
    public void push(E item) {
        list.addLast((String) item);
    }

    @Override
    public E peek()
    {
        return (E) list.peek();
    }


    @Override
    public E pop() {
        E value = (E)list.peek();
        list.removeLast();
        return value;
    }
}