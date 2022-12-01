package programers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Hof {
    public static int[] solution(int k, int[] scores) {
        int count = 0; // pq.size로 대체 가능
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 내림차순
        int[] answer = new int[scores.length];
        int idx = 0;
        for (Integer score : scores){
            if(count>=k){
                if(pq.peek()<score){
                    pq.poll();
                    pq.add(score); //넣는 과정은 else와 동일하니 조건절 밖에서 처리 할 수 있음
                }
            }
            else{
                System.out.println(score);
                pq.add(score);
                count++;
            }
            answer[idx] = pq.peek();
            idx++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(solution(k,arr)));

    }
}
