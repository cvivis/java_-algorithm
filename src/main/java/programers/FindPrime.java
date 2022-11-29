package programers;

import java.util.ArrayList;
import java.util.List;

public class FindPrime {
    public int solution(String numbers) {
        int answer = 0;
        List<String> result = new ArrayList<>();
        findAll("",numbers,result);
        result.toString();
        return answer;
    }
    public void findAll(String prefix, String numbers, List<String> result){
        result.add(prefix);
        result.toString();
        if(prefix.length() > numbers.length()) return;
        for (int i = 0; i < numbers.length(); i++) {
           findAll(prefix+numbers.charAt(i),numbers,result);
        }
    }

    public static void main(String[] args) {
        FindPrime findPrime = new FindPrime();
        findPrime.solution("17");
    }
}
