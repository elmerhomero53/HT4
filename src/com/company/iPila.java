package com.company;

public interface iPila<E> {
    public abstract E pop();

    public abstract E peek();

    public boolean empty() {
        return size() == 0;
    }

    public int size() {
        return size();
    }
}