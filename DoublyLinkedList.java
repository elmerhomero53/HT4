

public class DoublyLinkedList<E> extends AbstractList<E>{
private int count;
private DoublyLinkedNode<E> head;
private DoublyLinkedNode<E> tail;

public DoublyLinkedList(){
   head = null;
   tail = null;
   count = 0;
}


@Override
public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoublyLinkedNode<>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}


@Override
public void addLast(E value){
   // construct new element
   tail = new DoublyLinkedNode<>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}

@Override
public E removeFirst(){
    DoublyLinkedNode<E> temp = head;
    head = head.next();
    count--;
    return temp.value();
}

@Override
public E removeLast(){
   DoublyLinkedNode<E> temp = tail;
   tail = tail.previous();
   if (tail == null) {
       head = null;
   } else {
       //tail.setNext(null);
   }
   count--;
   return temp.value();
}

 @Override
  public E getFirst()  {
      return head.value();
  } 
  
   @Override
   public boolean contains(E value)  {
      DoublyLinkedNode<E> finger = head;
	  
      while (finger != null &&!finger.value().equals(value)){
          finger = finger.next();
      }
      return finger != null;
   }
   
    @Override
    public int size() {
        return count;
    }
   
    @Override
    public E peek() {
        return tail.value();
    }
    
    @Override
    public int indexOf(E value) {
      DoublyLinkedNode<E> finger = head;
      int counter =0;
      while (finger != null &&!finger.value().equals(value))
      {
        finger = finger.next();
        counter++;          
      }
      return counter;
    }
}