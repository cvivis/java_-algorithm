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
            int[] arr = IntStream.rangeClosed(1, n).toArray();
            List<Integer> listN = new ArrayList<>();
            for (int i = 2; i <= n; i++) {
                listN.add(i);
            }
//            System.out.println(listN);
//            System.out.println(listN.size());
//            System.out.println(listN.get(8));
            // remove를 하면 nums.size가 계속 바뀌기 때문에 가장바깥쪽의 for문을 사용하면 index오류가 난다.
            for (int i = 2; i < Math.sqrt(n); i++) {
                for (int j = 0; j <= listN.size(); j++) {
                    int num = listN.get(j);
                    System.out.println("num: "+num);
                    if(num%i==0&&num/i>1){
                        listN.remove(j);
                    }
                }
            }
            return listN;
        }

    public static void main(String[] args) {
        PrimeFind primeFind = new PrimeFind();
        System.out.println(primeFind.solution(13));
        System.out.println(primeFind.eratos(10));
    }
}
