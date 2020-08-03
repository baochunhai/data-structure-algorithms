package com.data.sort;

/**
 * 快速排序
 * @author Administrator
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = SortUtil.randomArr(6);
        SortUtil.printArr(arr);
//        sort(arr,0,arr.length-1);
        sort1(arr,0,arr.length-1);
//        int[] arr1= netherlands(arr,0,arr.length-1);
//        SortUtil.printArr(arr1);
        SortUtil.printArr(arr);
    }

    /**
     * 快排1.0，时间复杂度O（n²），找出以arr[right]为界的中间位置，小于等于的放左边，大于等于的放右边
     * 分为左右2个区域，每个区域重复上面的步骤，直到最后left=right
     * @param arr
     * @param left
     * @param right
     */
    public static void sort(int[] arr,int left,int right){
        if(left>=right){return;}
        int mid = partition(arr,left,right);
        sort(arr,left,mid-1);
        sort(arr,mid+1,right);
    }

    /**
     * 快排2.0 以arr[right]作为中间值，最差情况时间复杂度O（n²），平均时间复杂度为 O(n logn)
     * @param arr
     * @param left
     * @param right
     */
    public static void sort1(int[] arr,int left,int right){
        if(left>=right){return;}
        int[] mid = netherlands(arr,left,right);
        sort1(arr,left,mid[0]-1);
        sort1(arr,mid[1]+1,right);
    }

    private static int partition(int[] arr, int left, int right) {
        if (left > right) {
            return -1;
        }
        if (left == right) {
            return left;
        }
        int lessEqual = left - 1;
        int index = left;

        while (index < right) {
            // 情况1,当前位置小于等于标记值，当前位置不动，标记右移
            if (arr[index] <= arr[right]) {
                lessEqual++;
                // 扩大小于等于区域
                SortUtil.swap(arr, index, lessEqual);
            }
            index++;
        }
        // 右边界位置和大于区域的起始位置交换
        SortUtil.swap(arr, ++lessEqual, right);
        return lessEqual;
    }

    /**
     * 荷兰国旗问题
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private static int[]  netherlands(int[] arr,int left,int right){
        if(left>right){
            return new int[]{-1,-1};
        }
        if(left==right){
            return new int[]{left,right};
        }
        int lessEqual = left-1;
        int i = left;
        int more = right;
        while (i<more){
            // 1.i位置==arr[right],i++
            if (arr[i]==arr[right]){
                i ++;
            }
            // 2.i位置<arr[right],i位置与小于区域右一个位置交换
            else if (arr[i]<arr[right]){
                SortUtil.swap(arr,++lessEqual,i++);
            }
            // 3.i位置>arr[right],i位置与大于区域左一个位置交换，i不动
            else if(arr[i]>arr[right]){
                SortUtil.swap(arr,i,--more);
            }
        }
        SortUtil.swap(arr,right,more);
        return new int[]{lessEqual+1,more};
    }

}
