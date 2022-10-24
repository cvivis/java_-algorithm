package kthnum;

import java.util.Arrays;

//[6, 10, 2]	"6210"
//[3, 30, 34, 5, 9]	"9534330"
public class Biggest {

    public String solution(int[] numbers) {
        String answer = "";
        String[] strNums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNums[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strNums,(str1,str2)->{
            return (str1+str2).compareTo(str2+str1);
        });
        for (int i = strNums.length-1; i >=0 ; i--) {
            answer += strNums[i];
        }
        //테스트 11번 틀린 이유 
        if(strNums[strNums.length-1].equals("0")){
            answer = "0";
        }

        return answer;

    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        Biggest biggest = new Biggest();
        System.out.println(biggest.solution(arr));
    }
}
