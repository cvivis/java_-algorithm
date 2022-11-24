package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Up1904 {
    public static void main(String[] args) throws IOException {
        Up1904 up1860 = new Up1904();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        System.out.println(up1860.odd(num,num2,""));

    }


    private String odd(int num,int num2,String str) {
        if(num>num2)return str;
        if(num%2==0)return odd(num+1,num2,str);
        else return odd(num+2,num2,str+(num)+" ");
    }
}
