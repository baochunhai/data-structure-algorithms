package com.data.sort;

/**
 * @author 大海
 */
public class SortUtil {
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
