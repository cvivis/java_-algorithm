package sort.selectionSort;

import java.util.Arrays;

interface SortKind{
    boolean isSort(int a,int b);
}

public class SelectionSort {

    public int findMin(int[] arr, int index, SortKind sort){
        int num = arr[index];
        for (int i = index; i < arr.length; i++) {
            if(sort.isSort(num,arr[i])){
                num = arr[i];
                index = i;
            }
        }
        return index;
    }

    public int[] swap(int[]arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }

    public void sort(int[] arr, SortKind sort){
        int swapIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            swapIdx = findMin(arr,i,sort);
            arr = swap(arr,i,swapIdx);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{11,7,72,9,10,223,111,23,8,4,39};
        SelectionSort ss = new SelectionSort();
        ss.sort(arr,(a,b)->a<b);
        ss.sort(arr,(a,b)->a>b);
    }
}
