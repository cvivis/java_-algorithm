package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[5][4];
        int[] result = new int[5];
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j = 0; j<4;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                result[i] +=  arr[i][j];
            }
        }

        int max = result[0];
        int maxIdx = 1;
        for (int i = 0; i < 5; i++) {
            if(result[i]>max){
                max = result[i];
                maxIdx = i+1;
            }
        }
        System.out.printf("%d %d\n",maxIdx,max);
    }
}
