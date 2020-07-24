package com.data.sort;

/**
 * @author 大海
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 1, 7};
        selectSort(arr);
        SortUtil.printArr(arr);
    }

    private static void selectSort(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            // arr.length-i 表示剩余未选择出的数量
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    max = j;
                }
            }
//            SortUtil.swap(arr, i, max);
            if (i != max) {
                SortUtil.swapbyoxr(arr, i, max);
            }

        }
    }

}
