package Lesson3;

public class MyDeque<T> {
       private MyLinkedList<T> deque;

        public MyDeque() {
            deque = new MyLinkedList<T>();
        }

        public void addFirst(T elem) {
            deque.addFirst(elem);
        }

        public void addLast(T elem) {
        deque.insert(elem);
        }

        public T removeFirst() {
            return deque.removeFirst();
        }

        public T removeLast() {
        return deque.removeLast();

    }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
        public T peekFirst(){
            return deque.getFirst().getValue();
        }

    public T peekLast(){
        return deque.getLast().getValue();
    }

    }

