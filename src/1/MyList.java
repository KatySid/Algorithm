package algoritms.lesson3;
//Задание 3.3
//Реализуйте простой односвязный список и его базовые методы.
public class MyList<T> {

    private Link<T> first;

    public MyList(Link<T> first) {
        this.first = first;
    }
    public boolean isEmpty(){
        return (first==null);
    }
    public void add(T link){
        Link<T> l=new Link<>(link);
        l.setNext(first);
        this.first=l;
    }
    public Link<T> delete(){
        Link<T> temp=first;
        first=first.getNext();
        return temp;
    }
    public void display(){
        Link<T> current=first;
        while(current!=null){
            System.out.println(current.getValue());
            current=current.getNext();
        }
    }
    public T find(T searchNode){
        Link<T> findNode=new Link<>(searchNode);
        Link<T> current=first;
        while (current!=null){
            if (current.getValue().equals(findNode.getValue())){
                return findNode.getValue();
            }
            current=current.getNext();
        }
        return null;
    }
}
class Link<T>{
    private T link;
    private Link<T> next;

    public Link(T link){
        this.link=link;

    }

    public Link<T> getNext() {
        return next;
    }

    public void setNext(Link<T> next) {
        this.next = next;
    }
    public T getValue(){
        return link;
    }

}
