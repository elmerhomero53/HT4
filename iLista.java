
/**
 * Interfaz de las clases tipo lista. 
 * @author Andrea Elias
 */
public interface iLista<E> {
    
    public int size();


   public boolean isEmpty();


   public void addFirst(E value);


   public void addLast(E value);
  

   public E getFirst();

   
   public E removeFirst();

   public E removeLast();
   
   public boolean contains(E value);

  
   public int indexOf(E value);
 
   public E peek();
}
