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

        int pivot = (low + high)/2;
        int lowIdx = low;
        int highIdx = high; // size - 1
        while (lowIdx <= highIdx) {
//            System.out.println(Arrays.toString(arr));
            while (arr[lowIdx] < arr[pivot]) lowIdx+=1;
            while (arr[highIdx] > arr[pivot]) highIdx-=1;
//            if(lowIdx <= highIdx){
                swap(arr, lowIdx, highIdx);
                lowIdx+=1;
                highIdx-=1;
//            }
        }
        if(low<highIdx)sort2(arr,low,highIdx);
        if(lowIdx<high)sort2(arr,lowIdx,high);
        return arr;
    }


    //해답 코드
    public int[] sort3(int[] arr, int startIdx, int endIdx) {
        int leftIdx = startIdx;
        int rightIdx = endIdx;
        int pivot = arr[(startIdx + endIdx) / 2];
        // 언제까지 반복되는지? leftIdx == rightIdx일 때도 아래 로직이 반복됨
        // ex) leftIdx = 3, rightIdx = 3일 때도
        // 왼쪽과 오른쪽 각각 교환할 index를 정하는 부분 pivot까지 올 수도 있다.
        while(leftIdx <= rightIdx){
            while(arr[leftIdx] < pivot) leftIdx += 1;   // <=아닙니다.
            while(arr[rightIdx] > pivot) rightIdx -= 1;   // <=아닙니다.
            // leftIdx = 4, rightIdx = 7 그대로 왜 냐하면 25는 교환 대상이기 때문입니다.

            if(leftIdx <= rightIdx){
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx += 1;
                rightIdx -= 1;
            }
            System.out.printf("leftIdx:%d rightIdx:%d\n", leftIdx, rightIdx);
            System.out.println(Arrays.toString(arr));
        }
        // 교환이 모두 끝나면 왼쪽, 오른쪽 두 그룹으로 나누어 지면 됩니다.
        // 20, 18, 5, 19, 25, 5, 50, 40

        if(startIdx < rightIdx) sort3(arr, startIdx, rightIdx);
        if(leftIdx < endIdx) sort3(arr, leftIdx, endIdx);

        return arr;
    }




    public int[] partition(int[] arr,int a, int b){
        return Arrays.copyOfRange(arr,a,b);
    }
        public static void main (String[]args){
            int[] arr = {20, 18, 5, 1, 40, 19, 5, 25};
            int[] arr2 = {20, 18, 5, 1};
            List<Integer> list = new ArrayList<>();
            for (int num : arr) {
                list.add(num);
            }
            quickSort q = new quickSort();
//        System.out.println( q.sort(list));
            System.out.println(Arrays.toString(q.sort3(arr2,0,arr2.length-1)));

            System.out.println(Arrays.toString(q.sort2(arr2,0,arr2.length-1)));

        }
    }
