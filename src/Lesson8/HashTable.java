package Lesson8;

public class HashTable {
    private Item[] hashArr;
    private int size;
    private Item nonItem;

    public HashTable(int size) {
        this.size = size;
        hashArr = new Item[size];
        nonItem = new Item(-1);
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            if(hashArr[i]!= null){
                System.out.println(hashArr[i].getKey());
            } else{
                System.out.println("***");
            }
        }
    }
    public int hashfunc (int key){
        return key % size;
    }

    public void insert (Item item){
        int key = item.getKey();
        int hashVal = hashfunc(key);
        while (hashArr[hashVal]!=null && hashArr[hashVal].getKey()!=-1){
            ++hashVal;
            hashVal%=size;
        }
        hashArr[hashVal]=item;
    }

    public Item delete(int key){
        int hashVal = hashfunc(key);
        while(hashArr[hashVal]!=null){
            if(hashArr[hashVal].getKey() == key){
                Item temp = hashArr[hashVal];
                hashArr[hashVal]=nonItem;
                return temp;
            }
            ++hashVal;
            hashVal%=size;
        }
        return null;
    }

    public Item find(int key){
        int hashVal = hashfunc(key);
        while (hashArr[hashVal]!=null){
            if(hashArr[hashVal].getKey()==key){
                return hashArr[hashVal];
            }
            ++hashVal;
            hashVal%=size;
        }
        return null;
    }
}
