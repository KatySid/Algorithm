package Lesson8;

import java.util.Random;

public class Main {
    public static void hashFunc2(int k, int size){
        System.out.println(k % size);
    }
    public static void main(String[] args) {
        Item aDataItem;
        int size = 66;
        int aKey;

        HashTable hTable = new HashTable(size);
        HashTableDouble gTable = new HashTableDouble(size);
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            aKey = rand.nextInt(999);
            aDataItem = new Item(aKey);
            hTable.insert(aDataItem);
            gTable.insert(aDataItem);
        }
        hTable.insert(new Item(999));
        hTable.insert(new Item(115));
        gTable.insert(new Item(999));
        gTable.insert(new Item(115));
        System.out.println("Линейное пробирование");
        hTable.display();
        System.out.println("Двойное пробирование");
        gTable.display();
        System.out.println();
        System.out.println(hTable.find(999).getKey());
        System.out.println();
        hTable.delete(115);
        hTable.display();
    }
}
