package com.data.sort;

import com.data.sort.util.Heap;
import com.data.sort.util.SortUtil;

import javax.sound.midi.Soundbank;
import java.util.PriorityQueue;

/**
 * 堆排序
 * @author Administrator
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = SortUtil.randomArr(10);
        SortUtil.printArr(arr);
        heapSort(arr);
//        SortUtil.printArr(arr);

    }
    public static void heapSort(int[] arr){
        Heap heap = new Heap(arr.length);
        for (int i = 0; i < heap.size(); i++) {
            heap.push(arr[i]);
        }
        System.out.println("push");
        SortUtil.printArr(heap.getHeap());
        for (int i = 0; i < heap.size(); i++) {
            heap.pop();
        }
        System.out.println("pop");
        SortUtil.printArr(heap.getHeap());
    }
}
