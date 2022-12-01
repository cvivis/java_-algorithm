package programers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TemplarWeapon {
    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 2; i <= number; i++) { // 2부터 확인 1의 약수는 1 
            int divisorNum = 0;
            Set<Integer> set = new HashSet<>();
            for (int j = 1; j*j <= i; j++) { // 제곱근 만큼의 횟수로 확인
                if(i%j==0) {
                    set.add(j); // 같은게 들어 갈 수 있으니 set
                    set.add(i/j);
                }
            }
            divisorNum = set.size();
            if(divisorNum>limit) divisorNum = power;
            answer+=divisorNum;
        }
        return answer+1; // 1의 약수 1더하기
    }

    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power = 2;
        System.out.println(solution(number,limit,power));
    }
}
