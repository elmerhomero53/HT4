package com.company;

public abstract class AbstractStack<E> implements iPila<E> {
    /**
     * @param item : valor que se desea ingresar al stack
     */
    @Override
    public void push(E item) {

    }

    /**
     * @return valor que se ingreso de ultimo al stack y que en el metodo se eliminó
     */
    @Override
    public E pop() {
        return null;
    }

    /**
     * @return valor que se ingreso de ultimo al stack
     */
    @Override
    public E peek() {
        return null;
    }

    /**
     * @return si el stack está vacío o no
     */
    @Override
    public boolean empty() {
        return false;
    }

    /**
     * @return valor entero del tamaño del stack
     */
    @Override
    public int size() {
        return 0;
    }
}
