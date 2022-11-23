package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Up1852 {
    public static void main(String[] args) throws IOException {
        Up1852 arraySum = new Up1852();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(arraySum.print(num,""));
    }


    private String print(int num,String str) {
        if(num<1)return str;
        return print(num-1,num+" "+str);
    }
}
