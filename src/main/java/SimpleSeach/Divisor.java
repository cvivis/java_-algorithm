package SimpleSeach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divisor {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            if(num%divisor==0)list.add(num);
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        if(answer.length == 0) return new int[]{-1};
        return answer;
    }

    public static void main(String[] args) {
        int[] num = {2, 36, 1, 3};
        Divisor divisor = new Divisor();
        System.out.println(Arrays.toString(divisor.solution(num,10)));
    }
}
