package com.data.sort;

import com.data.sort.util.SortUtil;

/**
 * @author Administrator
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = SortUtil.randomArr(10);
        SortUtil.printArr(arr);
//        insertionSort(arr);
        insertionSortByTemp(arr);
        SortUtil.printArr(arr);
    }

    private static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j>0; j--) {
                // 正序输出就小于，倒序输出就大于
                if(arr[j]<arr[j-1]){
                    SortUtil.swap(arr,j,j-1);
                }
            }
        }
    }
    private static void insertionSortByTemp(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            // 正序输出就temp<arr[j-1]，倒序输出就temp>arr[j-1]
            while (j>0&&temp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j] = temp;
        }

    }
}
