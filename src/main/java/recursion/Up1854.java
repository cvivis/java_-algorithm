package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Up1854 {
    public static void main(String[] args) throws IOException {
        Up1854 up1854 = new Up1854();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = br.readLine().split("");
        long num = Long.parseLong(br.readLine());
        System.out.println(up1854.sumAll(num));
    }

    

    public long sumAll(long num) {
        long addNum = num%10;
        if(num < 10)return addNum;
        return sumAll(num / 10)+addNum;
    }
}
