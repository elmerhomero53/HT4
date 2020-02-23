package com.company;

public interface iLista<E> {
    /**
     *
     *
     * @return devuelve el tamano
     */
    public int size();

    /**
     *
     * @return esta o no esta vacio
     */
    public boolean isEmpty();

    /**
     *
     * @param value el valor
     */
    public void addFirst(E value);

    /**
     *
     * @param value el valor
     */
    public void addLast(E value);

    /**
     *
     * @return el valor obtenido
     */
    public E getFirst();

    /**
     *
     * @return el primer valor que es el removido
     */

    public E removeFirst();

    /**
     *
     * @return el ultimo valor que es el removido
     */

    public E removeLast();

    /**
     *
     * @param value valor
     * @return true si contiene el valor
     */

    public boolean contains(E value);

    /**
     *
     * @param value el valor
     * @return posicion del valor
     */

    public int indexOf(E value);

    /**
     *
     * @return el valors
     */

    public E peek();
}
