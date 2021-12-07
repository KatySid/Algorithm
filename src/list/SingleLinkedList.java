package list;

public class SingleLinkedList<T> {
    private Link<T> first;

    public SingleLinkedList() {
        first=null;
    }
   public boolean isEmpty(){
        return (first == null);
   }

   public void insert (T element){
        Link<T> l = new Link<T>(element);
        l.setNext(first);
        this.first = l;
   }

   public Link<T> delete(){
        Link<T> temp = first;
        first = first.getNext();
        return temp;
   }

   public T find (T element){
        Link<T> findElement = new Link<T>(element);
        Link<T> current = first;
        while (current!=null){
            if (findElement.getValue().equals(findElement.getValue())){
                return findElement.getValue();
            }
            current=current.getNext();
        }
        return null;
   }
}
