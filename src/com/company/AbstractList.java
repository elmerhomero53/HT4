package com.company;

public abstract class AbstractList<E> implements iLista<E> {

    /**
     * constructor vacio
     */
    public AbstractList(){
    }
    /**
     * @return true si esta vacia
     */
    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    /**
     * @param value valor
     * @return true si contiene el valor
     */
    @Override
    public boolean contains(E value) {
        return false;
    }

}
