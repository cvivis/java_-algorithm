package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class pimeFactor {

    public static void main(String[] args) throws IOException {
//        int n = 72;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            long m = Long.parseLong(br.readLine());
            List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= m; i++) {
            while (m % i == 0) {
                m /= i;
                list.add(i);
            }
        }
//        int[] nums = list.stream().mapToInt(x->x).sorted().toArray();
        list.stream().mapToInt(x->x).sorted().forEach((x) -> System.out.printf("%d ",x));
//        StringBuilder sb = new StringBuilder();
//        int i = 2;
        //n이 1이 될 때까지 반복

//        while (n != 1) {
//            // i가 n의 약수이면 나누고 출력
//            if (n % i == 0) {
//                n /= i;
//                sb.append(i + "\n");
//            } else {
//                i++;
//            }
//        }
//        System.out.print(sb);
    }
}
