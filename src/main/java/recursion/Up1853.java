package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Up1853 {
    public static void main(String[] args) throws IOException {
        Up1853 up1851 = new Up1853();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(up1851.sumAll(num));
    }



    private int sumAll(int num) {
        if(num <= 0)return 0;
        return sumAll(num-1)+num;
    }
}
