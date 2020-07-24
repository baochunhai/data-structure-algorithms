package com.data.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 1, 7};
        bubbleSort(arr);
        SortUtil.printArr(arr);
    }

    /**
     * 简单冒泡排序
     * @param arr
     */
    private static void bubbleSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    SortUtil.swap(arr,i,j);
                }
            }
        }
    }

    /**
     * 最好时间复杂度O(n)
     * @param arr
     */
    private static void bubbleSortBest(int [] arr){
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    SortUtil.swap(arr,i,j);
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

}
