import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class MethodsSorted {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[400];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= random.nextInt(400);
        }
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr,arr.length);
        System.out.println("arr : " + Arrays.toString(arr));
        long time1 = System.nanoTime();
        System.out.print(" Line search result "+lineSearch(arr, 255));
        long timeFinishLine = System.nanoTime()-time1;
        System.out.println(" time : "+ timeFinishLine);
        System.out.println("arr2 : " + Arrays.toString(arr2));
        long time4 = System.nanoTime();
        sortedPaste(arr2);
        long timeFinishSortPaste=System.nanoTime()-time4;
        System.out.println("arr2 sorted paste: " + Arrays.toString(arr2));
        System.out.println("Sort paste time : " + timeFinishSortPaste);
        long time3 = System.nanoTime();
        bubble(arr);
        long timeFinishBubble = System.nanoTime()-time3;
        System.out.println("arr sorted bubble "+Arrays.toString(arr));
        System.out.println("Sort bubble time : "+timeFinishBubble);
        long time2 = System.nanoTime();
        boolean result = binarySearch(arr, 255);
        long timeFinishBinary = System.nanoTime()-time2;
        System.out.println("Binary search result "+result + " time " + timeFinishBinary);

        System.out.println("arr3 : " + Arrays.toString(arr3));
        long time5 = System.nanoTime();
        sortedChoice(arr3);
        long timeFinishChoice = System.nanoTime()-time5;
        System.out.println("arr3 sort choice"+Arrays.toString(arr3));
        System.out.println("Sort choice time : "+timeFinishChoice);

        System.out.println("arr1 : " + Arrays.toString(arr1));
        long time6 = System.nanoTime();
        Arrays.sort(arr1);
        long timeFinishSort = System.nanoTime()-time6;
        System.out.println("arr1 sort "+Arrays.toString(arr1));
        System.out.println("Sort time : "+timeFinishSort);

    }
    //сортировка методом пузырька
    public static void bubble(int[] array) {
    boolean isSorted = false;
    while (!isSorted){
        isSorted=true;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]){
               int buff = array[i];
               array[i]= array[i+1];
               array[i+1] = buff;
               isSorted = false;
            }
        }
    }
    }

    //сортировка методом выбора
    public static int[] sortedChoice(int[] array){
        for (int i = 0; i <array.length-1; i++) {
            int min = array[i];
            int index = i;
            for (int j = i+1; j <array.length ; j++) {
                if(array[j]< min){
                    min=array[j];
                     index = j;
                }

            }
            array[index]= array[i];
            array[i]=min;
        }
        return array;
    }
    //сортировка методом вставки
    public static int[] sortedPaste(int[] array){
        for (int i = 1; i < array.length; i++) {
            int buffer = array[i];
            int j =i-1;
            while ( j>=0 && array[j]>buffer) {
                    array[j+1] = array[j];
                    j-=1;
            }
            array[j+1] = buffer;
            }
        return array;
    }
    // поиск линейный

    public static boolean lineSearch (int[] array, int element){
        boolean containsElement = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element){
                containsElement= true;
                return containsElement;
            }
        }
        return containsElement;
    }
    // двоичный поиск
    public static boolean binarySearch(int[] array, int element){
        boolean containsElement = false;
        int first = array[0];
        int last = array.length-1;
        while (first<=last){
            int middle = (first+last)/2;
            if (array[middle]== element){
                containsElement = true;
                return containsElement;
            } else if (element > array[middle]){
                first=middle+1;
            } else if (element < array[middle]) {
                last= middle-1;
            }

        }
        return containsElement;
    }

}
