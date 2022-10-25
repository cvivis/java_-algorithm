package hash;

import java.util.HashMap;

public class Pocketmon {
    public int solution(int[] nums) {
        int answer = 0;
        int numsLen = nums.length/2;
        HashMap<Integer,Integer> map = new HashMap();
        for(Integer num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        if(map.size()>numsLen)answer = numsLen;
        else answer = map.size();
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {3,3,3,2,2,4}; //3
        Pocketmon pocketmon = new Pocketmon();
        System.out.println(pocketmon.solution(arr));
    }
}
