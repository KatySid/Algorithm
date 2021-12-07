package Lesson3;

public class MyStack<T> {
        private MyLinkedList<T> stackL;

        public MyStack() {
            stackL = new MyLinkedList<>();
        }

        public void push(T element) {
            stackL.insert(element);
        }

        public T pop() {
            return stackL.removeLast();
        }

        public boolean isEmpty() {
            return stackL.isEmpty();
        }

        public T peek(){
            return stackL.getLast().getValue();
        }

    }


