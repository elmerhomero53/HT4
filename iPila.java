
/**
 * Interfaz de las clases tipo Stack
 * @author Andrea Elias
 * @param <E> un generico
 */
public interface iPila<E> 
{
   
   public void push(E item);
  
   public E pop();
   
   public E peek();
  
   public boolean empty();
   
   public int size();
   
}
