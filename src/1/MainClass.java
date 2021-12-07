package algoritms.lesson3;

import java.util.*;


public class MainClass {



    public static void main(String[] args) {
        String[] arr={"one","two","three","four","six","seven","eight","nine"};

//        Задание 3.1
//        На основе массива из домашнего задания 2.1 реализуйте простой список и коллекцию.
//        Оцените время выполнения преобразования.
        long startTime=System.nanoTime();
        Collection<String> list=Arrays.asList(arr) ; // коллекция
        System.out.println(System.nanoTime()-startTime);
        startTime=System.nanoTime();
        ArrayList<String> arrayList=new ArrayList(Arrays.asList(arr));
        
        System.out.println(System.nanoTime()-startTime);
//        Задание 3.2
//        На основе списка из задания 3.1 реализуйте основные методы добавления,
//        удаления и получения объекта или элемента из списка.
//        Оценить выполненные методы с помощью базового класса System.nanoTime().
        startTime=System.nanoTime();
        arrayList.add("ten");
        System.out.println(System.nanoTime()-startTime);
        startTime=System.nanoTime();
        arrayList.remove(8);
        System.out.println(System.nanoTime()-startTime);
        startTime=System.nanoTime();
        arrayList.get(0);
        System.out.println(System.nanoTime()-startTime);
//        Задание 3.4
//        На основе списка из задания 3.1 реализуйте простой двусторонний список и его базовые методы.
//        Реализуйте список заполненный объектами из вашего класса из задания 1.3
        LinkedList<String> linkedList=new LinkedList<>(arrayList);
        linkedList.add("ten");
        linkedList.get(8);
        linkedList.remove(8);
        linkedList.contains("six");
        User user1=new User("user1Name","user1SurName",20,"user1@gmail.com");
        User user2=new User("user2Name","user2SurName",21,"user2@gmail.com");
        User user3=new User("user3Name","user3SurName",22,"user3@gmail.com");
        User user4=new User("user4Name","user4SurName",23,"user4@gmail.com");
        User user5=new User("user5Name","user5SurName",24,"user5@gmail.com");
        LinkedList<User> userLinkedList=new LinkedList<>();
        userLinkedList.add(user1);
        userLinkedList.add(user2);
        userLinkedList.add(user3);
        userLinkedList.add(user4);
        userLinkedList.add(user5);
//        Задание 3.5
//        Реализуйте итератор на основе связанных списков из задания 3.4 и выполните базовые операции итератора.
//        Оцените время выполнения операций с помощью базового метода System.nanoTime()
        Iterator<String> stringIterator=linkedList.iterator();
        startTime=System.nanoTime();
        stringIterator.hasNext();
        System.out.println(System.nanoTime()-startTime);
        startTime=System.nanoTime();
        stringIterator.next();
        System.out.println(System.nanoTime()-startTime);
        startTime=System.nanoTime();
        stringIterator.remove();
        System.out.println(System.nanoTime()-startTime);
        Iterator<User> userIterator=userLinkedList.iterator();
        startTime=System.nanoTime();
        userIterator.hasNext();
        System.out.println(System.nanoTime()-startTime);
        startTime=System.nanoTime();
        userIterator.next();
        System.out.println(System.nanoTime()-startTime);
        startTime=System.nanoTime();
        userIterator.remove();
        System.out.println(System.nanoTime()-startTime);


    }
}
