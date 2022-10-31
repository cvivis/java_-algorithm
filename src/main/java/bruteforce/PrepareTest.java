package bruteforce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrepareTest {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int[] score = {0,0,0};
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == first[i%first.length]){
                score[0] = score[0]+1;
            }
            if(answers[i] == second[i%second.length]){
                score[1] = score[1]+1;
            }
            if(answers[i] == third[i%third.length]){
                score[2] = score[2]+1;
            }
        }
        int max = Math.max(score[0],Math.max(score[1],score[2])); // 3개중 최대값 설정
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) { // 최대값과 같으면 list에 추가
            if(score[i]==max){
                list.add(i+1);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) { // list -> array
            answer[i] = list.get(i).intValue();
            System.out.println( answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
//        int[]arr = {1,3,2,4,2};
        int[]arr = {1,2,3,4,5};
        PrepareTest prepareTest = new PrepareTest();
        int[] result = prepareTest.solution(arr);
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }

    }
}
