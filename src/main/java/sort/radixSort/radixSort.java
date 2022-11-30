package sort.radixSort;

import java.util.*;

public class radixSort {
    public static void main(String[] args) {
        int[] arr = {7,4,5,9,1,0};
        int[] arr2 = {7,4,5,9,1,0,123};
        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(sort2(arr2)));

    }

    public static int[] sort(int[] arr){
        int size = 0;
        for (int num : arr){ // size 정하기
           if(size<num)size = num;
        }
        int[] result = new int[size+1];
        Arrays.fill(result,-1); // 해당 index == num하기
        for (int num : arr){
            result[num] = num;
        }
        int cnt = 0;
        for (int i = 0; i < result.length; i++) { // 결과 -1 빼고 정렬
            if(result[i]!=-1){
                arr[cnt++] = result[i];
            }
        }
        return arr;
    }

    public static int[] sort2(int[] arr){
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < 10; i++) {
            queueArr[i] = new LinkedList<>();
        }
        int[] digits = getDigits(arr);
        for (int i = 0; i < arr.length; i++) {
            // 강의 코드 보고 digits 중복 허용해서 해당하는 자릿수 큐배열에 넣기로 해보기
        }
        return arr;
    }
    public static int[] getDigits(int[] arr){
        TreeSet<Integer> digits = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) digits.add(1);
            else{
                digits.add((int)(Math.log10(arr[i])+1));
            }
        }
        int[] result = new int[digits.size()];
        int idx = 0;
        for(Integer num : digits){
            result[idx++] = num;
        }
        return result;
    }
}
