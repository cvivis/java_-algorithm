package sort.quickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quickSort {

    // 재귀

    /**
     * 피봇기준으로 low, high를 나눈뒤 붙이고 재귀한다. -> 공간복잡도가 높다.
     **/
    public List<Integer> sort(List<Integer> arr) {
        if (arr.size() <= 1) return arr;
        List<Integer> low = new ArrayList<>();
        List<Integer> middle = new ArrayList<>();
        List<Integer> high = new ArrayList<>();
        int pivot = arr.size() / 2;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(pivot) > arr.get(i)) {
                low.add(arr.get(i));
            } else if (arr.get(pivot) < arr.get(i)) {
                high.add(arr.get(i));
            } else {
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

        return list;
    }

    public int[] swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }


    /**
     * 기준피봇보다 작으면 바꾸는 대상이 아니기에 low피봇의 인덱스를 +1 high피봇은 대상이 피봇보다 크면 바꾸지 않고 -1
     **/

    public int[] sort2(int[] arr,int low, int high) {
        System.out.println("low: "+ low);
        System.out.println("high: "+ high);
        if(high-low<=0)return arr; // 사이즈가 1이면 종료
        int pivot = (low + high+1)/2;
        int lowIdx = low;
        int highIdx = high; // size - 1
        while (lowIdx <= highIdx) {
            while (arr[lowIdx] < arr[pivot]) lowIdx++;
            while (arr[highIdx] > arr[pivot]) highIdx--;
//            System.out.println("low: "+ lowIdx);
//            System.out.println("high: "+ highIdx);
            swap(arr, lowIdx, highIdx);
            lowIdx++;
            highIdx--;
            System.out.println(Arrays.toString(arr));
        }

        sort2(arr,low,highIdx);
        sort2(arr,lowIdx,high);
        return arr;
    }

    public int[] partition(int[] arr,int a, int b){
        return Arrays.copyOfRange(arr,a,b);
    }
        public static void main (String[]args){
            int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
            List<Integer> list = new ArrayList<>();
            for (int num : arr) {
                list.add(num);
            }
            quickSort q = new quickSort();
//        System.out.println( q.sort(list));
            System.out.println(Arrays.toString(q.sort2(arr,0,arr.length-1)));

        }
    }
