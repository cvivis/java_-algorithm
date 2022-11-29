package sort.radixSort;

import java.util.Arrays;

public class radixSort {
    public static void main(String[] args) {
        int[] arr = {7,4,5,9,1,0};
        System.out.println(Arrays.toString(sort(arr)));

    }

    public static int[] sort(int[] arr){
        int size = 0;
        for (int num : arr){
           if(size<num)size = num;
        }
        int[] result = new int[size+1];
        Arrays.fill(result,-1);
        for (int num : arr){
            result[num] = num;
        }
        int cnt = 0;
        for (int i = 0; i < result.length; i++) {
            if(result[i]!=-1){
                arr[cnt++] = result[i];
            }
        }
        return arr;
    }
}
