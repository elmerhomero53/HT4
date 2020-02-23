package com.company;

public abstract class AbstractStack<E> implements iPila<E> {
    /**
     * pre: el stack no debe estar vacio<p>
     * post: el item mas recientemente metido al stack se saca primero.
     */
    @Override
    public abstract E pop();
    /**
     * pre: el stack no esta vacio
     * post: el valor del tope a ser sacado es returnado
     * @return el objeto del tope
     */
    @Override
    public abstract E peek();
    /**
     * pre: ninguna<p>
     * post: retorna true si el stack no tiene elementos.
     * @return true o false
     */
    @Override
    public boolean empty() {
        return size() == 0;
    }
    /**
     * post: se retorna el numero de elementos del stack
     * @return un entero
     */
    @Override
    public int size()    {
        return size();
    }

}
