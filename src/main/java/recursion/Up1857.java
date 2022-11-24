package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Up1857 {
    public static void main(String[] args) throws IOException {
        Up1857 up1857 = new Up1857();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);
        System.out.println(up1857.combination(num,r));
    }



    private int combination(int num,int r) {
        if(num<r)return 0; // n개다 많이 선택할때
        else if(num == r) return 1; // n개중 n개 선택하기
        else if(r == 1) return num; // n 개중에 1개 선택하기
        return combination(num-1,r-1) + combination(num-1,r);
    }
}
