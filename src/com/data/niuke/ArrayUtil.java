package com.data.niuke;

import java.util.StringJoiner;

/**
 * @author baochunhai
 * @date  2022年6月23日23:46:33
 */
public class ArrayUtil {

    public static void print(int[] arr) {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        for (int n : arr) {
            joiner.add(n + "");
        }
        System.out.println(joiner);
    }

    public static void swap(int[] arr, int a , int b){
        if(arr[a]!= arr[b]){
            arr[a] = arr[a]^ arr[b];
            arr[b] = arr[a]^ arr[b];
            arr[a] = arr[a]^ arr[b];
        }
    }
}
