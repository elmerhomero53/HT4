
public abstract class AbstractList<E> implements iLista<E>{
    
   public AbstractList()   {
 
   }
  
   @Override
   public boolean isEmpty()
   {
      return size() == 0;
   }
 
   @Override
  public boolean contains(E value)  {
	return -1 != indexOf(value);
  }
  
}
