package programers;

import java.util.PriorityQueue;

public class MoreScovile {
    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        for (Integer num : scoville){ // 힙 채우기
            pqueue.add(num);
        }
        while(pqueue.size()>1){ // scoville 을 구하기 위해선 최소 2개의 음식이 필요하다.
            if(pqueue.peek() < K){ // K 미만일때만
                int min = pqueue.poll(); // 첫번째와 두번째 꺼내서 연산하고 횟수++ 하기
                int secondMine = pqueue.poll();
                pqueue.add(min + secondMine * 2);
                answer++;
            }
            else break; // 중간에 최소 scoville이 K 이상이 되면 break하기
        }
        if(pqueue.peek() < K)answer = -1; // 연산을 다 했는데도 K 이상이 없으면 -1로 출력
        System.out.println(pqueue.toString());
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 10, 12};
        int[] arr2 = {1, 0, 0, 0, 0};
        int k = 7;
        System.out.println(solution(arr2,k));
    }
}
