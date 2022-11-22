package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySum {
    public static void main(String[] args) throws IOException {
        ArraySum arraySum = new ArraySum();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine());
        int[] arr = {7,3,2,9};
        System.out.println(arraySum.sumAll(arr,arr.length-1));
    }
    // 합할 idx 구분?
    // 1. 새배열 재귀 할때 마다 만들어서 맨끝이나 첫값만사용
    // 2. 사이즈를 매개변수로 넣어주기
    // 3. 사이즈를 전역변수로 설정하기

    private int sumAll(int[] arr,int idx) {
        if(idx<0)return 0;
        return sumAll(arr,idx-1)+arr[idx];
    }
}
