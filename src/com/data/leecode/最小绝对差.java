package com.data.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * leetcode 1200
 * @author baochunhai
 * @date 16/7/2022 上午9:20
 */
public class 最小绝对差 {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        minimumAbsDifference(arr);
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<arr.length-1;i++){
            int temp = arr[i+1] - arr[i];
            if(min<temp){
                continue;
            }
            min = Math.min(arr[i+1] - arr[i],min);
        }

        for(int i = 0 ;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==min){
                List<Integer> tList = new ArrayList<>();
                tList.add(arr[i]);
                tList.add(arr[i+1]);
                ans.add(tList);
            }
        }
        return ans;
    }
}
