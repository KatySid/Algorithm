package Lesson3;

public class MyLink<T> {
    private T myLink;
    private MyLink<T> next;
    private MyLink<T> previous;

    public MyLink (T myLink){
        this.myLink= myLink;
    }
    public MyLink<T> getNext(){
        return next;
    }
    public MyLink<T> getPrevious(){
        return previous;
    }

    public void setNext(MyLink<T> next){
        this.next = next;
    }

    public void setPrevious(MyLink <T> previous){
        this.previous = previous;
    }

    public T getValue(){
        return myLink;
    }
}
