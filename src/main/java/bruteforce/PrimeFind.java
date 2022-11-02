package bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeFind {
    public int solution(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }

            }
            if (prime == true) {
                System.out.println("prime : " + i);
                count++;
            }
        }
        return count;
    }

        public int eratos(int n){
            int[] arr = IntStream.rangeClosed(2, n).toArray();
            boolean[] checks = new boolean[n-1];
            Arrays.fill(checks,true);
            // remove를 하면 nums.size가 계속 바뀌기 때문에 가장바깥쪽의 for문을 사용하면 index오류가 난다.
            for (int i = 2; i < Math.sqrt(n); i++) {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[j]%i==0&&arr[j]/i>1){
                        checks[j] = false;
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < checks.length; i++) {
                if(checks[i] == true){
                   count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        PrimeFind primeFind = new PrimeFind();
        System.out.println(primeFind.solution(10));
        System.out.println(primeFind.eratos(10));
    }
}
