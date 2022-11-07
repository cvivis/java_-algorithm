package SimpleSeach;


import java.util.Arrays;

//1. 넘어온 수의 자릿수 더하기
//2  넘어온 수로 나우어 지는지 확인하기
public class Hashad {

    public boolean solution(int x) {
        boolean answer = false;

        String[] strs = Integer.toString(x).split("");
        int checkNum = 0;

        for(String str : strs){
            checkNum += Integer.parseInt(str);
        }
        if(x%checkNum==0)return true;

        return answer;
    }

    public static void main(String[] args) {
        Hashad hashad = new Hashad();
        System.out.println(hashad.solution(18));
    }
}
