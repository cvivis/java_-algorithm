package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GymSuit {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        Collections.sort(lostList);
        Collections.sort(reserveList);
        int len = lostList.size();
        List<Integer> newLost = new ArrayList<>();
        for (int i = 0; i < len; i++) { // 같은건 먼저 없애기;
            System.out.println(newLost.toString() + " : " + reserveList.toString() );
            int num = lostList.get(i);
            System.out.println(num);
            if (reserveList.contains(num)) {
                reserveList.remove(Integer.valueOf(num));
                answer++;
            }else{
                newLost.add(num);
            }

        }
//        System.out.println(lostList.toString() + " : " + reserveList.toString() );
        len = newLost.size();
        for (int i = 0; i < len; i++) {
            int num = newLost.get(i);
            if (reserveList.contains(num - 1)) {
                reserveList.remove(Integer.valueOf((num - 1)));
                answer++;
            } else if (reserveList.contains(num + 1)) {
                reserveList.remove(Integer.valueOf(num + 1));
                answer++;
            }
            System.out.println(reserveList.toString());
            System.out.println(answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {3,2,5};
        int[] arr2 = {3,4,5};
        System.out.println(solution(n, arr, arr2));
    }
}
