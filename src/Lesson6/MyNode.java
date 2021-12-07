package Lesson6;

public class MyNode<T>{
    public T myNode;
    public MyNode leftChild;
    public MyNode rightChild;

    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return  myNode.toString();
    }
}
