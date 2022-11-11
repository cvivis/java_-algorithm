package bitoperation;

import java.util.Scanner;

public class DecimalTobinary {
    //1. 각각의 원소를 이진수로 변화시킨후 arr1, arr2각 인덱스끼리
    //2. 합집합하여 result 를 구한다.
    //3. 1 은 # 0은 공백으로 변환시켜 출력한다.

    public static void main(String[] args) {
        int n = 18;
        int[] arr = new int[17];

        int i = 0;
        while(n != 1)
        {
            arr[i++] = n%2;
            n = n/2;
        } // 마지막꺼 추가
        arr[i] = n;

        for(int j = i; j >= 0; --j) // 뒤에서부터 읽음
        {
            System.out.print(arr[j]);
        }
    }
}
