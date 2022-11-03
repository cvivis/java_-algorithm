package bruteforce;

import java.util.*;
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
//                System.out.println("prime : " + i);
                count++;
            }
        }
        return count;
    }

    public int eratos(int n ){
        int[] arr = IntStream.rangeClosed(2, n).toArray();
        boolean[] checks = new boolean[arr.length];
        Arrays.fill(checks,true);


        int index = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for(int j = index+2; j < arr.length; j+=i) {
                checks[j] = false;
            }
            index+=2;
        }
        int count = 0;
        for (int i = 0; i < checks.length; i++) {
            if(checks[i]==true) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        PrimeFind primeFind = new PrimeFind();
        System.out.println(primeFind.solution(5));
        System.out.println(primeFind.eratos(5));
    }
}
