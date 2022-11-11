package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

/**
 ()(((()())(())()))(())
 1. (입력시 쇠 막대
 2. () 입력시 레이저 -> 쇠막대 갯수만큼 총 +N
 3. )입력시 총갯수에서 +1
 -> 쇠막대 입력값들이 쌓여서 저장되어야함 맥마지막값과의 비교이기 때문에 stack이 적합
 **/
public class P10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] iron = bf.readLine().split("");
        Stack<String> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < iron.length; i++) {
            if(iron[i].equals("(")){
                stack.push("(");
            }else {
                if(iron[i-1].equals(("("))){
                    stack.pop();
                    result += stack.size();
                }
                else{
                    result++;
                    stack.pop();
                }
            }
        }
        System.out.println(result);

    }
}
