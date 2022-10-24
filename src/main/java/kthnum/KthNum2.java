package kthnum;


import java.util.Arrays;
import java.util.PriorityQueue;

//1. n~m까지 자르고
//2. 자른부분 정렬한뒤
//3. k번째
public class KthNum2 {
    public int getkthNum(int[] arr, int[] command){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = command[0]-1; i < command[1]; i++) {
            pq.add(arr[i]);
        }
        int result = 0;
        for (int i = 0; i < command[2]; i++) {
            result = pq.poll();
        }
        return result;
    }

    public int[] solution(int[] array, int[][] commands) {


        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length ; i++) {
            answer[i] = getkthNum(array,commands[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        KthNum2 kthNUm = new KthNum2();
        System.out.println(Arrays.toString(kthNUm.solution(arr,arr2)));

    }
}

