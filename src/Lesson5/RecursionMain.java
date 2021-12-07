package Lesson5;

import java.util.Arrays;

public class RecursionMain {
    public static void main(String[] args){
        int result;
        long start = System.nanoTime();
        result = factorialRecursive(6);
        long stop = System.nanoTime();
        System.out.println("Result = " + result);
        System.out.println("Recursive factorial time "+ (stop-start));

        start = System.nanoTime();
        result = factorialCycle(6);
        stop = System.nanoTime();
        System.out.println("Result = " + result);
        System.out.println("Cycle factorial time "+ (stop-start));

        int[] arr  = new int[]{0,2,4,6,8,10};
        int index;
        start = System.nanoTime();
        index = binarySearchRecursive(arr, 4, 0, 5);
        stop = System.nanoTime();
        System.out.println("Index = " + index);
        System.out.println("Recursive search time "+ (stop-start));

        start = System.nanoTime();
        index = binarySearchCycle(arr, 4);
        stop = System.nanoTime();
        System.out.println("Index = " + index);
        System.out.println("Cycle search time "+ (stop-start));

        int[] arr1 = new int[] {45,12,7,47,12,0,66,1,90};
        int[] sorted = mergesort(arr1);
        System.out.println(sorted.toString());

    }

    public static void infRecursion(){
        infRecursion();
    }

    public static int conditionRecursion(int a)
    {
        if (a >=10){
            return a;
        }

        a++;
        return conditionRecursion(a);
    }

    public static int factorialRecursive(int n){
        if (n==1){
            return 1;
        }

        return factorialRecursive(n-1)*n;
    }

    public static int factorialCycle(int n){
        int result = 1;
        while (n>1){
            result = result*n;
            n--;
        }

        return result;
    }

    public static int binarySearchRecursive(int[] arr, int value, int left, int right){
        int index = (right + left) / 2;
        if (arr[index]==value){
            return index;
        }

        if (left>=right){
            return -1;
        }

        if (value > arr[index]){
            return binarySearchRecursive(arr, value, index+1, right);
        }
        else {
            return binarySearchRecursive(arr, value, left, index-1);
        }
    }

    public static int binarySearchCycle(int[] arr, int value){
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int index = (left + right)/2;
            if (arr[index] == value){
                return  index;
            }

            if (value > arr[index]){
                left = index+1;
            }
            else{
                right = index -1;
            }
        }

        return -1;
    }

    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
