package com.data.sort;

import com.data.sort.util.SortUtil;

/**
 * 计数排序，非比较排序
 * 对样本内容有要求
 * @author Administrator 
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] arr = SortUtil.randomArr(10);
        SortUtil.printArr(arr);
        countingSort(arr,10);
        SortUtil.printArr(arr);
    }
    public static void countingSort(int[] arr,int k){
        int[] help = new int[k];
        for (int i = 0; i < arr.length ; i++) {
            help[arr[i]] +=1;
        }
        SortUtil.printArr(help);
        int count=0;
        for (int i = 0; i < help.length ; i++) {
            while (help[i]>0){
                arr[count++] = i;
                help[i]--;
            }

        }
    }
}
