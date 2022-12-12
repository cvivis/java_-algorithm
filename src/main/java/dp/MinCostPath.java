package dp;

import java.util.Arrays;

import static dp.LCS.printMatrix;

public class MinCostPath {
    public static void main(String[] args) {
        int[][] arr =
                {{ 1,3,2 },
        { 4,6,2 },
        { 1,2,4 }};

        solution(arr);
    }
    public static int[][] solution(int[][] arr){
        int[][] minArr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==0&&j==0){
                    minArr[i][j] = arr[i][j];
                }
                else if(i==0){
                    minArr[i][j] = minArr[i][j-1] + arr[i][j];
                }
                else if(j==0){
                    minArr[i][j] = minArr[i-1][j] + arr[i][j];
                }
                else{
                    minArr[i][j] = Math.min(Math.min(minArr[i-1][j-1],minArr[i-1][j]),minArr[i][j-1]) + arr[i][j];
                }
            }
        }
        printMatrix(arr,3,3);
        printMatrix(minArr,3,3);
        return arr;
    }
}
