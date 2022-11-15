package quickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quickSort {

    // 재귀
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

    public static void main(String[] args) {
        int[] arr = {20,18,5,19,5,25,40,50};
        List<Integer> list = new ArrayList<>();
        for(int num:arr){
            list.add(num);
        }
        quickSort q = new quickSort();
        System.out.println( q.sort(list));

    }
}
