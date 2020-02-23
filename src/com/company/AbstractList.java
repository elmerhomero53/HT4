package com.company;

public abstract class AbstractList<E> implements iLista<E> {
    /**
     * @return devuelve el tamano
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * @return esta o no esta vacio
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * @param value el valor
     */
    @Override
    public void addFirst(E value) {

    }

    /**
     * @param value el valor
     */
    @Override
    public void addLast(E value) {

    }

    /**
     * @return el valor obtenido
     */
    @Override
    public E getFirst() {
        return null;
    }

    /**
     * @return el primer valor que es el removido
     */
    @Override
    public E removeFirst() {
        return null;
    }

    /**
     * @return el ultimo valor que es el removido
     */
    @Override
    public E removeLast() {
        return null;
    }

    /**
     * @param value valor
     * @return true si contiene el valor
     */
    @Override
    public boolean contains(E value) {
        return false;
    }

    /**
     * @param value el valor
     * @return posicion del valor
     */
    @Override
    public int indexOf(E value) {
        return 0;
    }

    /**
     * @return el valors
     */
    @Override
    public E peek() {
        return null;
    }
}
