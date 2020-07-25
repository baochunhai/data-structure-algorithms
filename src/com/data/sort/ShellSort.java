package com.data.sort;

/**
 * 希尔排序
 * @author Administrator
 */
public class ShellSort {
    public static void main(String[] args) {
//        int[] arr = SortUtil.randomArr(15);
        int[] arr = {9,6,11,3,5,12,8,7,10,15,14,4,1,13,2};
        SortUtil.printArr(arr);
//        shellSort(arr);
//        shellSortByTemp(arr);
        shellSortDirect(arr);
        SortUtil.printArr(arr);
    }

    private static void shellSort(int[] arr){
//        int gap = 4;
        for (int gap = 4; gap >0 ; gap=gap/2) {
        // 插入排序
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j >=gap ; j-=gap) {
                    if(arr[j]<arr[j-gap]){
                        SortUtil.swap(arr,j,j-gap);
                    }
                }
            }
        }
    }
    private static void shellSortByTemp(int[] arr) {
        for (int gap = 4; gap > 0; gap = gap / 2) {
            // 插入排序
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i];
                int j = i - gap;
                while (j >= 0 && temp < arr[j]) {
                    arr[j + gap] = arr[j];
                    j = j - gap;
                }
                arr[j + gap] = temp;
            }
        }
    }
    private static void shellSortDirect(int[] arr) {
        for (int gap = arr.length/2; gap > 0; gap = gap / 2) {
            // 插入排序
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i];
                int j = i - gap;
                while (j >=0 && temp > arr[j]) {
                    arr[j + gap] = arr[j];
                    j = j - gap;
                }
                arr[j + gap] = temp;
            }
        }
    }
}
