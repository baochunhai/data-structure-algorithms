package com.data.sort.util;

/**
 * @author 大海
 */
public class SortUtil {
    /**
     * 数组交换方法
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }

    /**
     * 通过异或交换数组
     * @param arr
     * @param a
     * @param b
     */
    public static void swapbyoxr(int[] arr,int a,int b){
        arr[a] = arr[a]^arr[b];
        arr[b] = arr[a]^arr[b];
        arr[a] = arr[a]^arr[b];
    }

    /**
     * 打印数组
     * @param arr
     */
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    /**
     * 对数器比较方法
     * @param arr1
     * @param arr2
     */
    public static void isEqule(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i]!=arr2[2]){
                System.out.println("第"+i+"位置："+arr1[i]+"排序错误");
            }
        }
    }

    /**
     * 生成随机数组
     * @param i
     * @return
     */
    public static int[] randomArr(int i){
        int size = i;
        int [] arr = new int[size];
        for (int j = 0; j < size; j++) {
            arr[j] = (int)(Math.random()*i);
        }
        return arr;
    }

}
