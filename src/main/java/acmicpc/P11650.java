package acmicpc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[][] arr = new int[num][2];

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();
        Arrays.sort(arr, (arr1,arr2)->{
            if(arr1[0] == arr2[0])return arr1[1] - arr2[1] ; // 0번째가 같으면 1번째 오름차순
            else return arr1[0] - arr2[0]; // 0번째 다르면 0번째꺼를 오름차순 한다.
        });
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < num; i++) {
            bw.write(arr[i][0]+" "+arr[i][1]+"\n");
        }

        bw.close();
    }
}
