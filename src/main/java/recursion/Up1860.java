package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Up1860 {
    public static void main(String[] args) throws IOException {
        Up1860 up1860 = new Up1860();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println("1");
        System.out.println(up1860.numTriangle(num,"1",2));

    }


    private String numTriangle(int num,String str,int reverseNum) {
        if (num < reverseNum) return"";
        System.out.println(str+" " +reverseNum);
        return numTriangle(num, str+" "+ reverseNum,reverseNum+1);

    }
}
