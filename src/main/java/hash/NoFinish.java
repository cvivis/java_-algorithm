package hash;

import java.util.*;

public class NoFinish {
    public String solution(String[] participant, String[] completion) {
        String str = "";
    HashMap<String,Integer> participantCount = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            participantCount.put(participant[i],participantCount.getOrDefault(participant[i],0)+1);

        }
        for(int i = 0; i < completion.length;i++){
            participantCount.put(completion[i],participantCount.get(completion[i])-1);
        }
        Set<String> keys = participantCount.keySet();
            for(String key:keys){
                if(participantCount.get(key)!=0){
                    str = key;
                }
            }
//        Iterator<Map.Entry<String, Integer>> iter = participantCount.entrySet().iterator();
//
//        while(iter.hasNext()){
//            Map.Entry<String, Integer> entry = iter.next();
//            if (entry.getValue() != 0){
//                str = entry.getKey();
//                break;
//            }
//        }


        return str;
    }

    public static void main(String[] args) {
        String[] arr1 = {"marina", "josipa", "nikola", "vinko", "filipa","vinko"};
        String[] arr2 = {"josipa", "filipa", "marina", "nikola","vinko"};
        NoFinish no = new NoFinish();
        System.out.println(no.solution(arr1,arr2));
    }
}
