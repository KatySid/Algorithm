package Lesson6;

import java.util.Arrays;
import java.util.Random;

public class MainTree {
    public static void main(String[] args) {
        //Задание 6.6
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        HeapSort arrSort = new HeapSort();
        arrSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        //Задание 6.2-6.3
        MyTree myTree1 = new MyTree();
        Person person1 = new Person("Tom1", 0, 12);
        myTree1.insert(person1);
        myTree1.insert(new Person("Tom2", 5, 15));
        myTree1.insert(new Person("Tom3", 1, 10));
        myTree1.insert(new Person("Tom4", 2, 11));
        myTree1.insert(new Person("Tom5", 7, 12));
        myTree1.insert(new Person("Tom6", 7, 12));
        myTree1.displayTree();
        System.out.println("Поиск ");
        myTree1.find(person1).display();
        //Задание 6.5
        myTree1.delete(person1);
        //Задание 6.4
        myTree1.displayTree();
        System.out.println("Max");
        myTree1.max().display();
        System.out.println("Min");
        myTree1.min().display();

    }
}
