package com.data.leecode;

public class 成最多的水的容器 {
    public static void main(String[] args) {
    int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(arr));
    }

    /**
     * 面积最大 长*宽
     * @param arr
     * @return
     */
    public static int maxWater(int[] arr){
        int max = 0;
        int end = arr.length - 1;
        int start = 0;
        while (start<end){
            max = Math.max(max,Math.min(arr[start],arr[end])*(end-start));
            if(arr[start] <= arr[end]){
                start++;
            }else {
                end --;
            }
        }
        return max;
    }

}
