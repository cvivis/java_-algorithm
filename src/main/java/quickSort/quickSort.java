package quickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quickSort {

    // 재귀
    /** 피봇기준으로 low, high를 나눈뒤 붙이고 재귀한다. -> 공간복잡도가 높다. **/
    public List<Integer> sort(List<Integer> arr){
        if(arr.size() <= 1)return arr;
        List<Integer> low = new ArrayList<>();
        List<Integer> middle = new ArrayList<>();
        List<Integer> high = new ArrayList<>();
        int pivot = arr.size()/2;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(pivot) > arr.get(i)){
                low.add(arr.get(i));
            }
            else if(arr.get(pivot) < arr.get(i)){
                high.add(arr.get(i));
            }
            else{
                middle.add(arr.get(i));
            }
        }
        List<Integer> list = new ArrayList<>();
        List<Integer> lowList = new ArrayList<>();
        List<Integer> highList = new ArrayList<>();
        low = sort(low);
        high = sort(high);
        list.addAll(low);
        list.addAll(middle);
        list.addAll(high);

        return list ;
    }
    public int[] swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }


    /** 기준피봇보다 작으면 바꾸는 대상이 아니기에 low피봇의 인덱스를 +1 high피봇은 대상이 피봇보다 크면 바꾸지 않고 -1 **/

    public int[] sort2(int[] arr){
        int pivot = arr.length/2;
        int lowIdx = 0;
        int highIdx = arr.length-1;
        while(lowIdx <= highIdx){
            while(true){
                if(lowIdx>=pivot)break;
                if(arr[lowIdx]>arr[pivot]){
                    swap(arr,lowIdx,pivot);
                    lowIdx++;
                    highIdx--;
                }
                else{
                    lowIdx++;
                }
            }
            System.out.println("low: " + lowIdx);
            System.out.println("high: " + highIdx);
            System.out.println("arr: "+Arrays.toString(arr));
            while(true){
                if(highIdx<=pivot)break;
                if(arr[highIdx]<arr[pivot]) {
                    swap(arr,highIdx,pivot);
                    lowIdx++;
                    highIdx--;
                }
                else{
                    highIdx--;
                }
            }

            System.out.println("arr: "+Arrays.toString(arr));

        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        List<Integer> list = new ArrayList<>();
        for(int num:arr){
            list.add(num);
        }
        quickSort q = new quickSort();
//        System.out.println( q.sort(list));
        System.out.println(Arrays.toString(q.sort2(arr)));

    }
}
