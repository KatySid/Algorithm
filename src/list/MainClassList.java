package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainClassList {
    public static void main(String[] args) {
        Dog[] dogs1 = { new Dog("Tom", 5), new Dog("Jerry", 10), new Dog("Barsik", 14)};
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("Drugok", 10));
        dogs.add (new Dog ("Barbos", 5));
        dogs.add(new Dog ("Belka", 7));
        Collections.addAll(dogs, dogs1);
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).getName());
        }
        System.out.println();

    }
}
