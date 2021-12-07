package Lesson3;

import java.util.PriorityQueue;

public class MainStack {
            public static void main(String[] args) {
                //рализация стека на базе двусвязного списка
            MyStack<Cat> mStack = new MyStack<Cat>();

            mStack.push(new Cat("Tom",5));
            mStack.push(new Cat("Tim",59));
            mStack.push(new Cat("Miu",9));

            mStack.pop();
                mStack.push(new Cat("Tom",5));
                mStack.push(new Cat("Tim",59));
                mStack.push(new Cat("Miu",9));

            System.out.println("Stack: ");
            while (!mStack.isEmpty()) {
                String value = mStack.pop().getName();
                System.out.println(value);
            }
            // реализация очереди на базе двусвязного списка
                MyQueue<Cat> myQueue = new MyQueue<Cat>();

                myQueue.insert(new Cat("Tom1",5));
                myQueue.insert(new Cat("Tom2",5));
                myQueue.insert(new Cat("Tom3",5));
                myQueue.insert(new Cat("Tom4",5));
                myQueue.insert(new Cat("Tom5",5));

                myQueue.remove();
                myQueue.remove();
                myQueue.remove();

                myQueue.insert(new Cat("Tom6",5));
                System.out.println("Queue: ");
                while (!myQueue.isEmpty()) {
                    String n = myQueue.remove().getName();
                    System.out.println(n);
                }
                // реализация дека на базе двусвязного списка
                MyDeque<Cat> myDeque = new MyDeque<>();

                myDeque.addFirst(new Cat("Tom1",5));
                myDeque.addFirst(new Cat("Tom2",5));
                myDeque.addFirst(new Cat("Tom3",5));
                myDeque.addFirst(new Cat("Tom4",5));

                myDeque.removeFirst();
                myDeque.removeLast();

                System.out.println("Deque 1: ");
                while (!myDeque.isEmpty()) {
                    String n = myDeque.removeFirst().getName();
                    System.out.println(n);
                }
                System.out.println("Deque 2: ");
                myDeque.addFirst(new Cat("Tom1",5));
                myDeque.addFirst(new Cat("Tom2",5));
                myDeque.addFirst(new Cat("Tom3",5));
                myDeque.addFirst(new Cat("Tom4",5));
                while (!myDeque.isEmpty()) {
                    String n = myDeque.removeLast().getName();
                    System.out.println(n);
                }
                //реализация приоритетной очереди
                PriorityQueue<Cat> prior  = new PriorityQueue<Cat>();
                prior.add(new Cat("Tom1",5));
                prior.add(new Cat("Tom2",7));
                prior.add(new Cat("Tom3",3));
                prior.add(new Cat("Tom4",9));
                System.out.println("Priority: ");
                while (!prior.isEmpty()) {
                    String n = prior.poll().getName();
                    System.out.println(n);
                }

        }
    }

