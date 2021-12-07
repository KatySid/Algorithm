package Lesson7;

public class Queue {

        private final int size;
        private int[] queArray;
        private int front;
        private int rear;

        public Queue(int size) {
            this.size = size;
            queArray = new int[this.size];
            front = 0;
            rear = -1;
        }

        public void insert(int j){
            if (rear == size - 1)
                rear = -1;
            queArray[++rear] = j;
        }

        public int remove(){
            int temp = queArray[front++];
            if (front == size)
                front = 0;
            return temp;
        }

        public boolean isEmpty(){
            return (rear + 1 == front || (front + size - 1 == rear));
        }
    }

