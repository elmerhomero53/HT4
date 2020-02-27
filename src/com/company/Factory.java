package com.company;

class Factory<E> {
    Object implementacion;

    public Factory(){}

    public Object getStack(String entryStack, String entryLista) {

        if(entryStack.equals("Vector"))
        {
            implementacion =  new StackVector<>();
        }
        else if(entryStack.equals("ArrayList"))
        {
            implementacion = new StackArrayList<>();
        }
        else if(entryStack.equals("Lista"))
        {
            implementacion = new StackList<>(entryLista);
        }
        return implementacion;
    }
}
