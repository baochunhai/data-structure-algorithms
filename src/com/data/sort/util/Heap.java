package com.data.sort.util;

/**
 * 手写大根堆
 * 特殊逻辑关系:
 * 1.寻找父节点(i-1)/2
 * 2.寻找左孩子2*i+1,寻找右孩子2*i+2
 * @author Administrator
 */
public class Heap {
    // 堆的大小
    private  int heapSize;
    // 模拟堆
    private  int[] heap;

    public int[] getHeap() {
        return heap;
    }

    // 数组大小
    private  int limit;

    public Heap(int limit) {
        heap = new int[limit];
        this.limit = limit;
        heapSize = 0;
    }


    public  boolean isEmpty(){
        return heapSize==0;
    }
    public  boolean isFull(){
        return heapSize==limit;
    }
    public int size(){
        return limit;
    }

    /**
     * 根据用户给的值，
     * @param value
     */
    public void push(int value){
        if (heapSize==limit){
            throw new RuntimeException("堆已经满了");
        }
        heap[heapSize] = value;
        heapInsert(heap,heapSize);
        heapSize++;
    }
    public int pop(){
        int ans = heap[0];
        SortUtil.swap(heap,0,--heapSize);
        heapify(heap, 0, heapSize);
        return ans;
    }
    /**
     * 依次向堆中添加元素，如果大于父，就和父交换
     * 使堆成为一个大根堆
     * @param arr
     * @param index
     */
    public void heapInsert(int[] arr,int index){
       while (arr[index]>arr[(index-1)/2]){
           SortUtil.swap(arr,index,(index-1)/2);
           index = (index-1)/2;
       }

    }

    /**
     * 当前arr[0]位置是前大根堆的arr.length-1位置，为了保证heap还是大根堆，
     * arr[0]的值需要不断下沉，直到他的孩子中没有比他大的
     * @param arr
     * @param index
     * @param size
     */
    public void heapify(int[] arr, int index, int size){
        // 左孩子
        int left = index * 2 + 1;
        while (left<heapSize){
            // 如果右孩子存在，找到左右2个孩子中较大的那个
            int largest = left+1<heapSize&&arr[left]<arr[left+1]?left+1:left;
            // 比较是否比2个孩子中较大的还要大
            largest = arr[largest]<arr[index]?index:largest;
            if(largest==index){break;}
            // 交换
            SortUtil.swap(arr,index,largest);
            index = largest;
            left = index * 2 + 1;
        }
    }

}
