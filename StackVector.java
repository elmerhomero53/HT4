
import java.util.Vector;


public class StackVector<E> extends AbstractStack<E>{
    protected Vector myVector;
    /**
     * Se construye un nuevo vector vacio.
     */
    public StackVector()
    {
        myVector=new Vector();
    }
     
    @Override
    public void push(E obj)
    {
        myVector.add(obj);
 
    }
    
    @Override
    public E pop() {
        E p = null;
        if( !myVector.isEmpty()) {
        p = (E) myVector.lastElement();
         myVector.remove( myVector.size() - 1);
    }
    return p;
    }
    
    @Override
    public E peek() {
        return (E)myVector.lastElement();
    }
    
    @Override
    public int size()
    {
    return myVector.size();
    }
}