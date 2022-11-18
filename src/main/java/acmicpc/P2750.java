package acmicpc;

import java.io.*;
import java.util.Arrays;

public class P2751 {

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
//            System.out.printf("leftIdx:%d rightIdx:%d\n", leftIdx, rightIdx);
//            System.out.println(Arrays.toString(arr));
        }
        if(startIdx < rightIdx) sort3(arr, startIdx, rightIdx);
        if(leftIdx < endIdx) sort3(arr, leftIdx, endIdx);

        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        P2751 p2751 = new P2751();
        int[] result = p2751.sort3(arr,0, arr.length-1);
        for (int i = 0; i < num; i++) {
            bw.write(String.valueOf(result[i])+"\n");
        }
        bw.flush();
        bw.close();
    }
}
