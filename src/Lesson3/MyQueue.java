package Lesson3;

public class MyQueue<T> {
        private MyLinkedList<T> queue;

        public MyQueue() {
            queue = new MyLinkedList<T>();
        }

    public void insert(T elem) {
        queue.insert(elem);
    }
    public T remove() {
       return queue.removeFirst();

    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public T peek(){
        return queue.getFirst().getValue();
    }



}
