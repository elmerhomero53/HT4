

public abstract class AbstractStack<E> implements iPila<E> {
    
    
    @Override
    public abstract E pop();
   
    @Override
    public abstract E peek();
   
    @Override
    public boolean empty() {
        return size() == 0;
    }
    
    @Override
    public int size()    {
            return size();
    }

    
    
}
