package com.company;
import java.util.ArrayList;

public class StackArrayList<E> extends AbstractStack<E>{
    protected ArrayList<E> data;

    public StackArrayList()
    {
        data = new ArrayList<E>();
    }

    @Override
    public void push(E item)	{
        data.add(item);
    }

    @Override
    public E pop()	{
        return data.remove(size()-1);
    }

    @Override
    public E peek()	{
        return data.get(size() - 1);
    }

    @Override
    public int size()
    {
        return data.size();
    }
}