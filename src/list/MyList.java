package list;

//реализация простого списка
public class MyList<T> {
    private T[] myList;
    private int countElement;

    public MyList(){
        myList = (T[])(new Object[10]);
        countElement = 0;
    }
//количество элементов в списке
    public int size(){
        return countElement;
    }

 //добавление элемента в список
   public void add (T element){
        if (countElement > (myList.length*0.8)){
            T[] newArray = (T[])(new Object[myList.length*2]);
            for (int i = 0; i < countElement; i++) {
                newArray[i]=myList[i];
            }
            myList = newArray;
        }
        myList[countElement] = element;
        countElement++;
   }
   //удаление элемента из списка по индексу
   public T remove(int index){
        T buffer = myList[index];
       for (int i = index; i < countElement; i++) {
           myList[i]=myList[i+1];
       }
       countElement--;
        return buffer;
   }

   // получение элемента по индексу
   public T get(int index){
        return myList[index];
   }

   //получение индекса элемента
   public int getIndex(T element){
       for (int i = 0; i < myList.length; i++) {
           if (element == myList[i]){
               return i;
           }
       }
       return -1;
   }
}
