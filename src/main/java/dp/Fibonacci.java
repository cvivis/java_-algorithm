package dp;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(solution(30));
    }

    public static int solution(int num){
        int[] arr = new int[num+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[num];
    }
}
