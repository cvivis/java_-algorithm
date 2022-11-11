package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 입력된 수에서 왼쪽자리부터 숫자가 크게 와야한다
 * 따라서 왼쪽자리의 숫자가 뒤에 오는 수보다 작으면 없애야한다.(반복문으로 맨 앞에 자리까지 확인)
 * <반례>
 * 4 2
 * 1924
 * //answer : 94
 *
 * 7 3
 * 1231234
 * //answer : 3234
 *
 * 10 4
 * 4177252841
 * //answer : 775841


 **/
public class P2812 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int nNum = Integer.parseInt(st.nextToken());
        int kNum = Integer.parseInt(st.nextToken());
//        String num = bf.readLine().split("");
        String num = bf.readLine();
//        System.out.println("String: "+ num);
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.valueOf(num.charAt(0)-'0'));
//        stack.push(Integer.parseInt(num[i]));
//        System.out.println("peek: "+stack.peek());
        int count = 0;
        for (int i = 1; i < nNum; i++) {
//            System.out.println(stack.toString());
            while (!stack.empty() && stack.peek() < Integer.valueOf(num.charAt(i)-'0') && count < kNum ) {
                stack.pop();
                count++;
            }
            stack.push(Integer.valueOf(num.charAt(i))-'0');
        }
        while(stack.size() > nNum -  kNum ) { //K 개 만큼 제거하지 않는 경우도 있기 때문에 pop 을 해준다. ️
            stack.pop();
        }
        for (Integer s : stack) {
            System.out.print(s);
        }

//        System.out.println(Integer.parseInt("0"));

    }
}


//Integer.valueOf(String)
// Integer 클래스를 리턴하기 때문에 산술 연산을 할 수 없다. Integer타입 null 처리가능
// Integer.parseInt(String)
// int 형을 리턴하기 때문에 산술 연산을 할 수 있다.

/**
 int[] num = new int[nNum];
 for(int i = 0; i<str.length; i++) {
 num[i] = Integer.parseInt(str[i]);
 }
 로 모든 타입을 Stirng -> int로 바꾸어 연산해주었더니 5퍼센트 에러 해결

 2. 타입을 int -> Integer로 바꾸어도 해결....
 **/