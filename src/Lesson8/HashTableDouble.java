package Lesson8;

public class HashTableDouble {
    private Item[] hashArr;
    private int size;
    private Item nonItem;

    public HashTableDouble(int size) {
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

    public int hashfuncDouble(int key){
        return (5-key%5);
    }

    public void insert (Item item){
        int key = item.getKey();
        int hashVal = hashfunc(key);
        int stepSize = hashfuncDouble(key);
        while (hashArr[hashVal]!=null && hashArr[hashVal].getKey()!=-1){
            hashVal+=stepSize;
            hashVal%=size;
        }
        hashArr[hashVal]=item;
    }

    public Item delete(int key){
        int hashVal = hashfunc(key);
        int stepSize = hashfuncDouble(key);
        while(hashArr[hashVal]!=null){
            if(hashArr[hashVal].getKey() == key){
                Item temp = hashArr[hashVal];
                hashArr[hashVal]=nonItem;
                return temp;
            }
            hashVal+=stepSize;
            hashVal%=size;
        }
        return null;
    }

    public Item find(int key){
        int hashVal = hashfunc(key);
        int stepSize = hashfuncDouble(key);
        while (hashArr[hashVal]!=null){
            if(hashArr[hashVal].getKey()==key){
                return hashArr[hashVal];
            }
            hashVal+=stepSize;
            hashVal%=size;
        }
        return null;
    }
}
