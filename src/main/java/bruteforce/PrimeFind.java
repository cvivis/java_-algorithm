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

        public List<Integer> eratos(int n){
            int[] arr = IntStream.rangeClosed(1, n+1).toArray();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 2; j < Math.sqrt(n); j++) {
                    if(arr[i]%j==0&&arr[i]/j>1){
                        arr[i] = 0;
                    }
                }
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] != 0){
                    list.add(arr[i]);
                }
            }
            return list;
        }

    public static void main(String[] args) {
        PrimeFind primeFind = new PrimeFind();
        System.out.println(primeFind.solution(13));
        System.out.println(primeFind.eratos(50));
    }
}
