package com.data.sort;

import com.data.sort.util.SortUtil;

/**
 * 归并排序
 * @author Administrator
 */
public class MergeSort {
    public static void main(String[] args) {

        int[] arr = SortUtil.randomArr(5);

        SortUtil.printArr(arr);
//        process(arr,0,arr.length-1);
        mergeSort(arr);
        SortUtil.printArr(arr);
    }

    /**
     * 递归版本
     * @param arr
     * @param L
     * @param R
     */
    private static void process(int[] arr,int L,int R){
        if(L==R){
            return;
        }
        int mid = L + ((R-L)>>1);
        // 左边变有序
        process(arr,L,mid);
        // 右边变有序
        process(arr,mid+1,R);
        // 整体变有序
        merge(arr,L,mid,R);
    }

    /**
     * 非递归版本
     * @param arr
     */
    private static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        int mergeSize = 1;
        while (mergeSize < N) {
            int L = 0;
            while (L < N) {
                int mid = L + mergeSize - 1;
                if (mid >= N) {
                    break;
                }
                // 分组后，最后不够一组,则选小的为右边界
                int R = Math.min(mid + mergeSize, N - 1);
                merge(arr, L, mid, R);
                L = R + 1;
            }
            mergeSize <<= 1;
        }


    }

    private static void merge(int[] arr,int L,int M,int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        while (p1 <= M && p2 <= R) {
            if (arr[p1] <= arr[p2]) {
                help[i++] = arr[p1++];
            } else{
                help[i++] = arr[p2++];
            }
        }
        // 左边没越界,右边越界
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }
        // 右边没越界,左边越界
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }
}
