package hash;

import java.util.*;

public class NoFinish {
    public String solution(String[] participant, String[] completion) {
        String str = "";
    HashMap<String,Integer> participantCount = new HashMap<>();
        for (int i = 0; i < participant.length; i++) { // 참가자의 이름을 키값으로 해쉬맵을 만들어 +1, 기본값은 0
            participantCount.put(participant[i],participantCount.getOrDefault(participant[i],0)+1);

        }
        for(int i = 0; i < completion.length;i++){ // 조회해서 완주했으면 key갑의 value -1
            participantCount.put(completion[i],participantCount.get(completion[i])-1);
        }
        Set<String> keys = participantCount.keySet(); // 참가자들의 키 값을 set으로 만들고
            for(String key:keys){  // 키값을 조회해 get 으로 0 이 아닌 값을 판별해준다-> 0이 아닌것은 완주하지 못한것
                if(participantCount.get(key)!=0){
                    str = key;
                }
            }

        return str;
    }

    public static void main(String[] args) {
        String[] arr1 = {"marina", "josipa", "nikola", "vinko", "filipa","vinko"};
        String[] arr2 = {"josipa", "filipa", "marina", "nikola","vinko"};
        NoFinish no = new NoFinish();
        System.out.println(no.solution(arr1,arr2));
    }
}
