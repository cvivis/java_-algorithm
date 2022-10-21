package bracket;

public class SolveBracket {
    boolean solution(String s){
        boolean answer = true;
        String[] splitted = s.split("()");
        while (s.indexOf("()") >= 0) {
            s = s.replace("()","");
        }
        answer = s.length()==0;

        return answer;
    }
}
