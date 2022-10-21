package bracket;

import java.util.Stack;

public class SolveBracket {
    boolean solutionNoStack(String s){
        boolean answer = true;
        String[] splitted = s.split("()");
        while (s.indexOf("()") >= 0) {
            s = s.replace("()","");
        }
        answer = s.length()==0;

        return answer;
    }
    boolean solutionJoin(String s){
        boolean answer = true;
        String[] splitted = s.split("\\(\\");



        return answer;
    }


    boolean solution(String s){
//        String[] splitted = s.split("");
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                if(stack.isEmpty())return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    boolean solution3(String s) {
        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){ // 여기로 처음부터 ) 가 오는경우가 막아짐
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }
}
