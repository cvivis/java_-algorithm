package kthnum;


import java.util.Arrays;

//1. n~m까지 자르고
//2. 자른부분 정렬한뒤
//3. k번째
public class KthNum {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int id = 0;
        for(int[] command:commands){
            int[] arr = Arrays.copyOfRange(array,command[0]-1,command[1]);
            Arrays.sort(arr);
            answer[id++] = arr[command[2]-1];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        KthNum kthNUm = new KthNum();
        System.out.println(Arrays.toString(kthNUm.solution(arr,arr2)));

    }
}

